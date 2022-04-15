package com.systemmvp.sysorders.services;

import com.systemmvp.sysorders.entities.Category;
import com.systemmvp.sysorders.entities.Order;
import com.systemmvp.sysorders.repositories.CategoryRepository;
import com.systemmvp.sysorders.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll(){
        return repository.findAll();
    }

    public Category findById(Long id){
        Optional<Category> obj = repository.findById(id);
        return obj.get();
    }



}
