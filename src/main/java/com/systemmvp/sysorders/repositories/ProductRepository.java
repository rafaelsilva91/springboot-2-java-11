package com.systemmvp.sysorders.repositories;

import com.systemmvp.sysorders.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
