package com.systemmvp.sysorders.repositories;

import com.systemmvp.sysorders.entities.Order;
import com.systemmvp.sysorders.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
