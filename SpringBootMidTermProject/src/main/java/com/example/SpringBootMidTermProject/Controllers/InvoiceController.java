package com.example.SpringBootMidTermProject.Controllers;

import com.example.SpringBootMidTermProject.Models.*;
import com.example.SpringBootMidTermProject.Services.CartService;
import com.example.SpringBootMidTermProject.Services.InvoiceDetailService;
import com.example.SpringBootMidTermProject.Services.InvoiceService;
import com.example.SpringBootMidTermProject.Services.ProductService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Controller
public class InvoiceController {
    @Autowired
    CartService cartService;
    @Autowired
    ProductService productService;
    @Autowired
    InvoiceDetailService invoiceDetailService;
    @Autowired
    InvoiceService invoiceService;
    @Autowired
    HttpSession session;
    @Autowired
    HttpServletRequest request;
    @PostMapping("/invoice")
    public String showInvoice(Model model){
        Account account = (Account) session.getAttribute("account");
        if (account!=null){
            long totalMoney = 0;
            List<Cart> carts = cartService.getAllCartsByUserName(account.getUsername());
            for (Cart cart: carts) {
                totalMoney += cart.getUnitPrice();
            }

            Invoice invoice = invoiceService.save(new Invoice(LocalDate.now(),totalMoney,account));
            List<InvoiceDetail> invoiceDetails = new ArrayList<>();
            for (Cart cart: carts){
                Product product =productService.getProductById(cart.getProductId());
                InvoiceDetail invoiceDetail = new InvoiceDetail(product.getPrice(),
                        cart.getQuantity(),
                        cart.getUnitPrice(),
                        invoice,
                        product);
                invoiceDetails.add(invoiceDetail);
                invoiceDetailService.save(invoiceDetail);
            }
            model.addAttribute("invoiceDetailList", invoiceDetails);
            model.addAttribute("invoice", invoice);
            model.addAttribute("customerName", request.getParameter("customerName"));
            model.addAttribute("phoneNumber", request.getParameter("phoneNumber"));
            model.addAttribute("customerAddress", request.getParameter("customerAddress"));
            return "invoice";
        }
        return "/";
    }
}
