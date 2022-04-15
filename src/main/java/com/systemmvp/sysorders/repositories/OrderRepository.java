package com.systemmvp.sysorders.repositories;

import com.systemmvp.sysorders.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
