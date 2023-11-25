package com.example.SpringBootMidTermProject.Repositories;

import com.example.SpringBootMidTermProject.Models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,String> {
    List<Product> findProductsByPriceBetween(long minPrice, long maxPrice);
    List<Product> findProductsByBrandIn(List<String> brands);
    List<Product> findProductsByCategoryIn(List<String> categories);
    List<Product> findProductsByColorIn(List<String> colors);
    List<Product> findProductsByNameContainingIgnoreCase(String name);
}
