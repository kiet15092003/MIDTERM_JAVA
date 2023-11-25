package com.example.SpringBootMidTermProject.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tbl_product")
@Getter
@Setter
@Builder
public class Product {
    @Id
    private String id;
    private String name;
    private String category;
    private String brand;
    private String color;
    private long price;
    private String imageSrc;

    private String description;
    public Product(){

    }

    public Product(String id, String name, String category, String brand, String color, long price, String imageSrc
    , String description) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.brand = brand;
        this.color = color;
        this.price = price;
        this.imageSrc = imageSrc;
        this.description = description;
    }

    public String getImageSrc() {
        return imageSrc;
    }

    public void setImageSrc(String imageSrc) {
        this.imageSrc = imageSrc;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }
}
