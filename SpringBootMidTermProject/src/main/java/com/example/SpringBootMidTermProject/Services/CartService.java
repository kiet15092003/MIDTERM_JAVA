package com.example.SpringBootMidTermProject.Services;

import com.example.SpringBootMidTermProject.Models.Account;
import com.example.SpringBootMidTermProject.Models.Cart;
import com.example.SpringBootMidTermProject.Repositories.AccountRepository;
import com.example.SpringBootMidTermProject.Repositories.CartRepository;
import com.example.SpringBootMidTermProject.Repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService {
    private CartRepository cartRepository;
    private AccountRepository accountRepository;
    @Autowired
    public CartService(CartRepository cartRepository, AccountRepository accountRepository){
        this.cartRepository = cartRepository;
        this.accountRepository = accountRepository;
    }

    public List<Cart> getAllCartsByUserName(String username){
        Account account = accountRepository.findByUsername(username);
        return cartRepository.findByUserAccount(account);
    }

    public Cart getCartByUserAccountAndProductId(String productId, Account account){
        return cartRepository.findByProductIdAndUserAccount(productId,account);
    }

    public void save(Cart cart){
        cartRepository.save(cart);
    }

    public void delete(Cart cart){
        cartRepository.delete(cart);
    }
}
