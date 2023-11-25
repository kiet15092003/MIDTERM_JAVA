package com.example.SpringBootMidTermProject.Services;

import com.example.SpringBootMidTermProject.Models.Account;
import com.example.SpringBootMidTermProject.Models.Product;
import com.example.SpringBootMidTermProject.Repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private ProductRepository productRepository;
    @Autowired
    public ProductService(ProductRepository productRepository){
        this.productRepository = productRepository;
    }
    public Product getProduct(Product product){
        Optional<Product> foundProduct = productRepository.findById(product.getId());
        return foundProduct.isPresent() ? product : null;
    }
    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }
    public void save(Product product) {
        productRepository.save(product);
    }
    public List<Product> getProductsByPriceRange(long minPrice, long maxPrice) {
        return productRepository.findProductsByPriceBetween(minPrice, maxPrice);
    }
    public List<Product> getProductsByBrands(List<String> brands){
        return productRepository.findProductsByBrandIn(brands);
    }

    public List<Product> getProductsByCategories(List<String> categories){
        return productRepository.findProductsByCategoryIn(categories);
    }

    public List<Product> getProductsByColors(List<String> colors){
        return productRepository.findProductsByColorIn(colors);
    }

    public List<Product> getProductsByName(String name){
        return productRepository.findProductsByNameContainingIgnoreCase(name);
    }

    public Product getProductById(String productId){
        return productRepository.getReferenceById(productId);
    }
}
