package com.systemmvp.sysorders.config;

import com.systemmvp.sysorders.entities.Category;
import com.systemmvp.sysorders.entities.Order;
import com.systemmvp.sysorders.entities.User;
import com.systemmvp.sysorders.entities.enums.OrderStatus;
import com.systemmvp.sysorders.repositories.CategoryRepository;
import com.systemmvp.sysorders.repositories.OrderRepository;
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

    @Override
    public void run(String... args) throws Exception {

        Category cat1 = new Category(null, "Eletronics");
        Category cat2 = new Category(null, "Books");
        Category cat3 = new Category(null, "Computers");

        categoryRepository.saveAll(Arrays.asList(cat1,cat2,cat3));


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
