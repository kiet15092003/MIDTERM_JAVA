package com.example.SpringBootMidTermProject.Controllers;

import com.example.SpringBootMidTermProject.Models.Account;
import com.example.SpringBootMidTermProject.Services.AccountService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {
    @Autowired
    HttpServletRequest request;
    @Autowired
    AccountService accountService;
    @Autowired
    HttpSession httpSession;
//    @GetMapping("/login")
//    public String showLoginPage(){
//        return "login";
//    }
    @PostMapping("/login")
    public String executeLoginInfo(Model model, HttpSession session){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        Account accountReq = new Account(username,password);
        Account account = accountService.getAccount(accountReq);
        if(account!=null){
            httpSession.setAttribute("account",account);
            return "redirect:/";
        }
        return "login";
    }
}
