package com.example.SpringBootMidTermProject.Controllers;

import com.example.SpringBootMidTermProject.Models.Product;
import com.example.SpringBootMidTermProject.Services.AccountService;
import com.example.SpringBootMidTermProject.Services.ProductService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.io.Console;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Controller
public class ProductController {
    @Autowired
    HttpServletRequest request;
    @Autowired
    ProductService productService;
    @Autowired
    HttpSession httpSession;
    @GetMapping("/")
    public String homePage(Model model){
        if(httpSession.getAttribute("account")!=null) {
            List<Product> productList = productService.getAllProducts();
            List<Product> first6Products = productList
                    .stream()
                    .limit(6)
                    .collect(Collectors.toList());
            model.addAttribute("listProduct",first6Products);
            return "index";
        }
        return "login";
    }

    public List<Product> getIntersectionProducts(List<Product> list1, List<Product> list2){
        if (list1.isEmpty()) return list2;
        if (list2.isEmpty()) return list1;
        return  list1.stream()
                .filter(list2::contains)
                .distinct()
                .collect(Collectors.toList());
    }
    @PostMapping("/product")
    public String getProductsFilter(
            @RequestParam(value = "categoriesCheck", defaultValue = "") List<String> categories,
            @RequestParam(value = "brandCheck", defaultValue = "") List<String> brands,
            @RequestParam(value = "colorCheck", defaultValue = "") List<String> colors,
            @RequestParam(value = "minPrice", defaultValue = "0") long minPrice,
            @RequestParam(value = "maxPrice", defaultValue = "99999999") long maxPrice,
            Model model){
        List<Product> listProductByBrands = productService.getProductsByBrands(brands);
        List<Product> listProductByCategories = productService.getProductsByCategories(categories);
        List<Product> listProductByColors = productService.getProductsByColors(colors);
        List<Product> listProductByPriceRange = productService.getProductsByPriceRange(minPrice, maxPrice);

        List<Product> resultFilterProducts =
                getIntersectionProducts(listProductByBrands,
                        getIntersectionProducts(listProductByCategories,
                                getIntersectionProducts(listProductByColors,listProductByPriceRange)));

        model.addAttribute("listProduct",resultFilterProducts);
        return "index";
    }

    @PostMapping("/productName")
    public String getProductsByNameSearch(
            @RequestParam(value = "nameProductSearch", defaultValue = "") String nameProductSearch,
            Model model
    ){
        List<Product> listProductByName =productService.getProductsByName(nameProductSearch);
        model.addAttribute("listProduct",listProductByName);
        return "index";
    }

    @GetMapping("/detail/{id}")
    public String detailPage(@PathVariable("id") String productId, Model model){
        Product product  = productService.getProductById(productId);
        model.addAttribute(product);
        return "detail";
    }
}
