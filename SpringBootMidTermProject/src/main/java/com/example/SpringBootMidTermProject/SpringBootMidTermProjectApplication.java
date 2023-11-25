package com.example.SpringBootMidTermProject;

import com.example.SpringBootMidTermProject.Models.Account;
import com.example.SpringBootMidTermProject.Services.AccountService;
import com.example.SpringBootMidTermProject.Services.ProductService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootMidTermProjectApplication implements CommandLineRunner {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootMidTermProjectApplication.class, args);
	}
	@Autowired
	private AccountService accountService;
	@Override
	public void run(String... args) throws Exception {
		Account acc1 = new Account("user1","user1abc");
		Account acc2 = new Account(	"user2","user2abc");
		accountService.save(acc1);
		accountService.save(acc2);
	}
}
