package com.systemmvp.sysorders.repositories;

import com.systemmvp.sysorders.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
