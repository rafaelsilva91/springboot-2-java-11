package com.systemmvp.sysorders.config;

import com.systemmvp.sysorders.entities.Category;
import com.systemmvp.sysorders.entities.Order;
import com.systemmvp.sysorders.entities.Product;
import com.systemmvp.sysorders.entities.User;
import com.systemmvp.sysorders.entities.enums.OrderStatus;
import com.systemmvp.sysorders.repositories.CategoryRepository;
import com.systemmvp.sysorders.repositories.OrderRepository;
import com.systemmvp.sysorders.repositories.ProductRepository;
import com.systemmvp.sysorders.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ProductRepository productRepository;

    @Override
    public void run(String... args) throws Exception {

        Category cat1 = new Category(null, "Eletronics");
        Category cat2 = new Category(null, "Books");
        Category cat3 = new Category(null, "Computers");

        Product p1 = new Product(null, "The Lord of the Rings", "Lorem ipsum dolor sit amet, consectetur.", 90.5, "");
        Product p2 = new Product(null, "Smart TV", "Nulla eu imperdiet purus. Maecenas ante.", 2190.0, "");
        Product p3 = new Product(null, "Macbook Pro", "Nam eleifend maximus tortor, at mollis.", 1250.0, "");
        Product p4 = new Product(null, "PC Gamer", "Donec aliquet odio ac rhoncus cursus.", 1200.0, "");
        Product p5 = new Product(null, "Rails for Dummies", "Cras fringilla convallis sem vel faucibus.", 100.99, "");

        categoryRepository.saveAll(Arrays.asList(cat1,cat2,cat3));
        productRepository.saveAll(Arrays.asList(p1,p2,p3,p4,p5));


        User u1 = new User(null, "Maria Pereira", "maria@gmail.com", "65992069999", "12345");
    	User u2 = new User(null, "Alex Ribeiro", "alex@gmail.com", "65992068888", "12345");
        User u3 = new User(null, "Ana Souza", "ana@gmail.com", "65992068877", "12345");

        Order o1 = new Order(null, Instant.parse("2022-01-20T19:53:07Z"), OrderStatus.PAID, u1);
        Order o2 = new Order(null, Instant.parse("2022-02-21T03:42:10Z"), OrderStatus.WAITING_PAYMENT, u2);
        Order o3 = new Order(null, Instant.parse("2022-03-22T15:21:22Z"),OrderStatus.WAITING_PAYMENT, u1);
        Order o4 = new Order(null, Instant.parse("2022-03-23T15:40:26Z"),OrderStatus.WAITING_PAYMENT, u3);


    	userRepository.saveAll(Arrays.asList(u1,u2,u3));
        orderRepository.saveAll(Arrays.asList(o1,o2,o3,o4));


    }




}
