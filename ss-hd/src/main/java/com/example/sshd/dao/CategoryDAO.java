package com.example.sshd.dao;


import com.example.sshd.pojo.Category;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoryDAO extends JpaRepository<Category, Integer> {

}

