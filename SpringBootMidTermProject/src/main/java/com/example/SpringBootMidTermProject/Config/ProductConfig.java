package com.example.SpringBootMidTermProject.Config;

import com.example.SpringBootMidTermProject.Models.Account;
import com.example.SpringBootMidTermProject.Models.Product;
import com.example.SpringBootMidTermProject.Repositories.AccountRepository;
import com.example.SpringBootMidTermProject.Repositories.ProductRepository;
import org.apache.catalina.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ProductConfig {
    @Bean
    CommandLineRunner commandLineRunner(ProductRepository productRepository){
        return args -> {
            Product phone1 = new Product("pro1",
                    "iPhone 15 Pro Max 512GB",
                    "phone",
                    "Apple",
                    "black",
                    40290000,
                    "https://cdn.tgdd.vn/Products/Images/42/305659/iphone-15-pro-max-blue-thumbnew-600x600.jpg",
                    "Màn hình Dynamic Island - Sự biến mất của màn hình tai thỏ thay thế bằng thiết kế viên thuốc, OLED 6,7 inch, hỗ trợ always-on display <br> Cấu hình iPhone 14 Pro Max mạnh mẽ, hiệu năng cực khủng từ chipset A16 Bionic"
                    );
            Product phone18 = new Product(
                    "pro18",
                    "iPhone 15 Pro Max 256GB",
                    "phone",
                    "Apple",
                    "white",34990000,
                    "https://cdn.tgdd.vn/Products/Images/42/305658/iphone-15-pro-max-white-thumbnew-600x600.jpg",
                    "Màn hình Dynamic Island - Sự biến mất của màn hình tai thỏ thay thế bằng thiết kế viên thuốc, OLED 6,7 inch, hỗ trợ always-on display <br> Cấu hình iPhone 14 Pro Max mạnh mẽ, hiệu năng cực khủng từ chipset A16 Bionic"

                    );
            Product phone11 = new Product(
                    "pro11",
                    "Samsung Galaxy M34 5G",
                    "phone",
                    "Samsung",
                    "blue",
                    7690000,
                    "https://cdn.tgdd.vn/Products/Images/42/309834/samsung-galaxy-m34-xanh-ngoc-thumb-600x600.jpg",
                    "Màn hình Dynamic Island - Sự biến mất của màn hình tai thỏ thay thế bằng thiết kế viên thuốc, OLED 6,7 inch, hỗ trợ always-on display <br> Cấu hình iPhone 14 Pro Max mạnh mẽ, hiệu năng cực khủng từ chipset A16 Bionic"
            );
            Product phone4 = new Product(
                    "pro4",
                    "Samsung Galaxy S22 Ultra",
                    "phone",
                    "Samsung",
                    "red",
                    16990000,
                    "https://cdn.tgdd.vn/Products/Images/42/235838/Galaxy-S22-Ultra-Burgundy-600x600.jpg",
                    "Màn hình Dynamic Island - Sự biến mất của màn hình tai thỏ thay thế bằng thiết kế viên thuốc, OLED 6,7 inch, hỗ trợ always-on display <br> Cấu hình iPhone 14 Pro Max mạnh mẽ, hiệu năng cực khủng từ chipset A16 Bionic"
            );
            Product phone10 = new Product(
                    "pro10",
                    "Xiaomi 13 Lite 5G",
                    "phone",
                    "Xiaomi",
                    "black",
                    9490000,
                    "https://cdn.tgdd.vn/Products/Images/42/302531/xiaomi-13-lite-den-thumb-600x600.jpg",
                    "Màn hình Dynamic Island - Sự biến mất của màn hình tai thỏ thay thế bằng thiết kế viên thuốc, OLED 6,7 inch, hỗ trợ always-on display <br> Cấu hình iPhone 14 Pro Max mạnh mẽ, hiệu năng cực khủng từ chipset A16 Bionic"
            );
            Product phone12 = new Product(
                    "pro12",
                    "Xiaomi Redmi 12 4GB",
                    "phone",
                    "Xiaomi",
                    "blue",
                    3590000,
                    "https://cdn2.cellphones.com.vn/x358,webp,q100/media/catalog/product/5/_/5_158.jpg",
                    "Màn hình Dynamic Island - Sự biến mất của màn hình tai thỏ thay thế bằng thiết kế viên thuốc, OLED 6,7 inch, hỗ trợ always-on display <br> Cấu hình iPhone 14 Pro Max mạnh mẽ, hiệu năng cực khủng từ chipset A16 Bionic"
            );
            Product phone7 = new Product(
                    "pro7",
                    "LG Smart TV 55UQ8000PSC",
                    "TV",
                    "LG",
                    "black",
                    10890000,
                    "https://cdn.tgdd.vn/Products/Images/1942/278554/TimerThumb/smart-lg-4k-55-inch-55uq8000psc-(63).jpg",
                    "Màn hình Dynamic Island - Sự biến mất của màn hình tai thỏ thay thế bằng thiết kế viên thuốc, OLED 6,7 inch, hỗ trợ always-on display <br> Cấu hình iPhone 14 Pro Max mạnh mẽ, hiệu năng cực khủng từ chipset A16 Bionic"
            );
                    Product phone8 = new Product(
                    "pro8",
                    "LG Smart TV 32LQ636BPSA",
                    "TV",
                    "LG",
                    "black",
                    5490000,
                    "https://cdn.tgdd.vn/Products/Images/1942/278529/TimerThumb/smart-lg-32-inch-32lq636bpsa-(27).jpg",
                            "Màn hình Dynamic Island - Sự biến mất của màn hình tai thỏ thay thế bằng thiết kế viên thuốc, OLED 6,7 inch, hỗ trợ always-on display <br> Cấu hình iPhone 14 Pro Max mạnh mẽ, hiệu năng cực khủng từ chipset A16 Bionic"
                    );
                    Product phone9 = new Product(
                    "pro9",
                    "Samsung Smart TV Crystal",
                    "TV",
                    "Samsung",
                    "black",
                    9790000,
                    "https://cdn.tgdd.vn/Products/Images/1942/273392/TimerThumb/smart-samsung-4k-43-inch-ua43bu8000-(69).jpg",
                            "Màn hình Dynamic Island - Sự biến mất của màn hình tai thỏ thay thế bằng thiết kế viên thuốc, OLED 6,7 inch, hỗ trợ always-on display <br> Cấu hình iPhone 14 Pro Max mạnh mẽ, hiệu năng cực khủng từ chipset A16 Bionic"
                    );
            Product phone5 = new Product(
                    "pro5",
                    "Xiaomi Google TV A Pro",
                    "TV",
                    "Xiaomi",
                    "white",
                    6690000,
                    "https://cdn.tgdd.vn/Products/Images/1942/312860/TimerThumb/google-tivi-xiaomi-4k-43-inch-pro-l43m8-a2sea-(4).jpg",
                    "Màn hình Dynamic Island - Sự biến mất của màn hình tai thỏ thay thế bằng thiết kế viên thuốc, OLED 6,7 inch, hỗ trợ always-on display <br> Cấu hình iPhone 14 Pro Max mạnh mẽ, hiệu năng cực khủng từ chipset A16 Bionic"
            );
            Product phone3 = new Product(
                    "pro3",
                    "MacBook Air 13 inch M1",
                    "Laptop",
                    "Apple",
                    "white",
                    18990000,
                    "https://cdn.tgdd.vn/Products/Images/44/231244/macbook-air-m1-2020-gray-600x600.jpg",
                    "Màn hình Dynamic Island - Sự biến mất của màn hình tai thỏ thay thế bằng thiết kế viên thuốc, OLED 6,7 inch, hỗ trợ always-on display <br> Cấu hình iPhone 14 Pro Max mạnh mẽ, hiệu năng cực khủng từ chipset A16 Bionic"
            );
            Product phone6 = new Product(
                    "pro6",
                    "MacBook Air 15 inch M2",
                    "Laptop",
                    "Apple",
                    "white",
                    32290000,
                    "https://cdn.tgdd.vn/Products/Images/44/309016/apple-macbook-air-15-inch-m2-2023-gray-thumb-600x600.jpg",
                    "Màn hình Dynamic Island - Sự biến mất của màn hình tai thỏ thay thế bằng thiết kế viên thuốc, OLED 6,7 inch, hỗ trợ always-on display <br> Cấu hình iPhone 14 Pro Max mạnh mẽ, hiệu năng cực khủng từ chipset A16 Bionic"
            );
            Product phone13 = new Product(
                    "pro13",
                    "LG gram 2023 i7 1360P",
                    "Laptop",
                    "LG",
                    "black",
                    44990000,
                    "https://cdn.tgdd.vn/Products/Images/44/306796/lg-gram-2023-i7-16z90reah75a5-thumb-600x600.jpg",
                    "Laptop LG Gram là một dòng sản phẩm laptop của LG Electronics. Đặc điểm nổi bật của LG Gram là thiết kế siêu nhẹ và siêu mỏng, khiến chúng trở thành một lựa chọn phù hợp cho những người dùng cần sự di động cao");
            Product phone14 = new Product(
                    "pro14",
                    "LG gram Style 2023 i5",
                    "Laptop",
                    "LG",
                    "white",
                    44990000,
                    "https://cdn.tgdd.vn/Products/Images/44/306797/lg-gram-style-2023-i5-14z90rsgah54a5-thumb-600x600.jpg","" +
                    "Laptop LG Gram là một dòng sản phẩm laptop của LG Electronics. Đặc điểm nổi bật của LG Gram là thiết kế siêu nhẹ và siêu mỏng, khiến chúng trở thành một lựa chọn phù hợp cho những người dùng cần sự di động cao"
                    );
            Product phone15 = new Product(
                    "pro15",
                    "Panasonic Inverter",
                    "Fridge",
                    "Panasonic",
                    "blue",
                    79990000,
                    "https://cdn.tgdd.vn/Products/Images/1943/195323/panasonic-nr-f503gt-x2-16-300x300.jpg",

                            "Panasonic Inverter là một công nghệ được sử dụng trong nhiều sản phẩm điện gia dụng của Panasonic, chẳng hạn như điều hòa không khí và tủ lạnh. Công nghệ Inverter được thiết kế để điều khiển");
            Product phone16 = new Product(
                    "pro16",
                    "Panasonic Inverter 300",
                    "Fridge",
                    "Panasonic",
                    "black",
                    16990000,
                    "https://cdn.tgdd.vn/Products/Images/1943/302310/tu-lanh-panasonic-300-lit-nr-bv331wgkv-220223-020355-600x600.jpg",

                            "Panasonic Inverter là một công nghệ được sử dụng trong nhiều sản phẩm điện gia dụng của Panasonic, chẳng hạn như điều hòa không khí và tủ lạnh. Công nghệ Inverter được thiết kế để điều khiển");
            Product phone17 = new Product(
                    "pro17",
                    "LG Inverter 635",
                    "Fridge",
                    "LG",
                    "black",
                    22990000,
                    "https://cdn.tgdd.vn/Products/Images/1943/271982/lg-inverter-635-lit-gr-d257wb-1.-600x600.jpg",
                    "LG Inverter là một công nghệ điện tử của LG Electronics được sử dụng trong nhiều sản phẩm gia dụng, như điều hòa không khí, tủ lạnh, máy giặt và nhiều thiết bị khác");
            Product phone2 = new Product(
                    "pro2",
                    "LG Inverter 635 InstaView",
                    "Fridge",
                    "LG",
                    "white",
                    26720000,
                    "https://cdn.tgdd.vn/Products/Images/1943/271979/lg-inverter-635-lit-gr-x257js-600x600.jpg",
                    "LG Inverter là một công nghệ điện tử của LG Electronics được sử dụng trong nhiều sản phẩm gia dụng, như điều hòa không khí, tủ lạnh, máy giặt và nhiều thiết bị khác");

            Product phone19 = new Product(
                    "pro19",
                    "Samsung Galaxy A14",
                    "phone",
                    "Samsung",
                    "red",
                    4490000,
                    "https://cdn.tgdd.vn/Products/Images/42/271721/samsung-galaxy-a14-5g-thumb-nau-600x600.jpg",
                    "Dòng điện thoại Samsung là một trong những thương hiệu phổ biến và đáng tin cậy trên thị trường. Samsung sản xuất các sản phẩm đa dạng từ điện thoại thông thường đến điện thoại thông minh");

            Product phone20 = new Product(
                    "pro20",
                    "Samsung Galaxy M54",
                    "phone",
                    "Samsung",
                    "blue",
                    11990000,
                    "https://cdn.tgdd.vn/Products/Images/42/275953/samsung-galaxy-m54-5g-thumb-600x600.jpg",
                    "Dòng điện thoại Samsung là một trong những thương hiệu phổ biến và đáng tin cậy trên thị trường. Samsung sản xuất các sản phẩm đa dạng từ điện thoại thông thường đến điện thoại thông minh");
            productRepository.saveAll(List.of(phone1,phone2,phone3,phone4,phone5,phone6,phone7,phone8,phone9,
                    phone10,phone11,phone12,phone13,phone14,phone15,phone16,phone17,phone18,phone19,phone20));

        };
    }
}
