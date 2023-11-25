package com.example.SpringBootMidTermProject.Repositories;

import com.example.SpringBootMidTermProject.Models.Account;
import com.example.SpringBootMidTermProject.Models.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartRepository extends JpaRepository<Cart,Long> {
    List<Cart> findByUserAccount(Account account);
    Cart findByProductIdAndUserAccount(String productId,Account account);
}
