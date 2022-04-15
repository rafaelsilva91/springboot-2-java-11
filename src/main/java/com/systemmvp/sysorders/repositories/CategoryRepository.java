package com.systemmvp.sysorders.repositories;

import com.systemmvp.sysorders.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
