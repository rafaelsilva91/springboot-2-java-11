package com.systemmvp.sysorders.config;

import com.systemmvp.sysorders.entities.Order;
import com.systemmvp.sysorders.entities.User;
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

    @Override
    public void run(String... args) throws Exception {

        User u1 = new User(null, "Maria Pereira", "maria@gmail.com", "65992069999", "12345");
    	User u2 = new User(null, "Alex Ribeiro", "alex@gmail.com", "65992068888", "12345");
        User u3 = new User(null, "Ana Souza", "ana@gmail.com", "65992068877", "12345");

        Order o1 = new Order(null, Instant.parse("2022-01-20T19:53:07Z"), u1);
        Order o2 = new Order(null, Instant.parse("2022-02-21T03:42:10Z"), u2);
        Order o3 = new Order(null, Instant.parse("2022-03-22T15:21:22Z"), u1);
        Order o4 = new Order(null, Instant.parse("2022-03-23T15:40:26Z"), u3);

    	userRepository.saveAll(Arrays.asList(u1,u2,u3));
        orderRepository.saveAll(Arrays.asList(o1,o2,o3,o4));

    }




}
