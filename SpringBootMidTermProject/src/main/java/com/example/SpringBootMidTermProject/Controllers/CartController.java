package com.example.SpringBootMidTermProject.Controllers;

import com.example.SpringBootMidTermProject.Models.Account;
import com.example.SpringBootMidTermProject.Models.Cart;
import com.example.SpringBootMidTermProject.Models.Product;
import com.example.SpringBootMidTermProject.Services.CartService;
import com.example.SpringBootMidTermProject.Services.ProductService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CartController {
    @Autowired
    HttpServletRequest request;
    @Autowired
    CartService cartService;
    @Autowired
    HttpSession httpSession;
    @Autowired
    ProductService productService;
    @PostMapping("/cart")
        public String addToCart(Model model){
        String productId = request.getParameter("productId");
        long unitPrice = Long.valueOf(request.getParameter("unitPrice"));
        Account account = (Account) httpSession.getAttribute("account");
        Cart cart = cartService.getCartByUserAccountAndProductId(productId,account);
        if (cart!=null){
            cart.setQuantity(cart.getQuantity()+1);
            cart.setUnitPrice(cart.getUnitPrice()+unitPrice);
            cartService.save(cart);
        } else{
            cartService.save(new Cart(productId,1,unitPrice,account));
        }
        List<Cart> cartList = cartService.getAllCartsByUserName(account.getUsername());
        List<Product> productList = new ArrayList<>();
        long totalPrice = 0;
        for (Cart cartItem: cartList) {
            Product product = productService.getProductById(cartItem.getProductId());
            productList.add(product);
            totalPrice+=cartItem.getUnitPrice();
        }
        model.addAttribute("productList", productList);
        model.addAttribute("cartList",cartList);
        model.addAttribute("totalPrice",totalPrice);
        return "cart";
    }

    @GetMapping("cart")
    public String getAllCarts(Model model){
        Account account = (Account) httpSession.getAttribute("account");
        List<Cart> cartList = cartService.getAllCartsByUserName(account.getUsername());
        List<Product> productList = new ArrayList<>();
        long totalPrice = 0;
        for (Cart cartItem: cartList) {
            Product product = productService.getProductById(cartItem.getProductId());
            productList.add(product);
            totalPrice+=cartItem.getUnitPrice();
        }
        model.addAttribute("productList", productList);
        model.addAttribute("cartList",cartList);
        model.addAttribute("totalPrice",totalPrice);
        return "cart";
    }
    @GetMapping("cart/add/{id}")
    public String increasingProductOnCart(@PathVariable("id") String productId, Model model){
        Account account = (Account) httpSession.getAttribute("account");
        Cart cart = cartService.getCartByUserAccountAndProductId(productId,account);
        Product product = productService.getProductById(productId);
        if (cart!=null){
            cart.setQuantity(cart.getQuantity()+1);
            cart.setUnitPrice(cart.getUnitPrice()+product.getPrice());
            cartService.save(cart);
        } else{
            cartService.save(new Cart(productId,1,product.getPrice(),account));
        }
        return "redirect:/cart";
    }

    @GetMapping("cart/minus/{id}")
    public String decreasingProductOnCart(@PathVariable("id") String productId, Model model){
        Account account = (Account) httpSession.getAttribute("account");
        Cart cart = cartService.getCartByUserAccountAndProductId(productId,account);
        Product product = productService.getProductById(productId);
        if (cart!=null){
            if (cart.getQuantity()>1){
                cart.setQuantity(cart.getQuantity()-1);
                cart.setUnitPrice(cart.getUnitPrice()-product.getPrice());
                cartService.save(cart);
            } else{
                cartService.delete(cart);
            }
        } else{
            cartService.save(new Cart(productId,1,product.getPrice(),account));
        }
        return "redirect:/cart";
    }

    @GetMapping("cart/remove/{id}")
    public String removeProductOnCart(@PathVariable("id") String productId, Model model){
        Account account = (Account) httpSession.getAttribute("account");
        Cart cart = cartService.getCartByUserAccountAndProductId(productId,account);
        if (cart!=null){
            cartService.delete(cart);
        }
        return "redirect:/cart";
    }

    @GetMapping("cart/deleteAll")
    public String removeAllProducts(Model model){
        Account account = (Account) httpSession.getAttribute("account");
        List<Cart> cartList = cartService.getAllCartsByUserName(account.getUsername());
        for (Cart cart: cartList){
            cartService.delete(cart);
        }
        return "redirect:/";
    }
}
