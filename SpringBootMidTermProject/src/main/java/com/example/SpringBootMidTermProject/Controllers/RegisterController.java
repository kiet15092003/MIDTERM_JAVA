package com.example.SpringBootMidTermProject.Controllers;

import com.example.SpringBootMidTermProject.Models.Account;
import com.example.SpringBootMidTermProject.Services.AccountService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.io.Console;

@Controller
public class RegisterController {
    @Autowired
    HttpServletRequest request;
    @Autowired
    AccountService accountService;
    @Autowired
    HttpSession httpSession;
    @GetMapping("/register")
    public String showRegisterPage(){
        return "register";
    }
    @PostMapping("/register")
    public String executeRegisterInfo(){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        Account accountReq = new Account(username,password);
        accountService.save(accountReq);
        return "login";
    }
}
