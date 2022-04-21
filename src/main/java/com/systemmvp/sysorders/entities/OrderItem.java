package com.systemmvp.sysorders.entities;

public class OrderItem {

    private Integer quantity;
    private Double price;



    public Double subTotal(){
        return quantity * price;
    }
}
