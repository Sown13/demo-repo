package com.example.elasticsearch_demo.repo;

import com.example.elasticsearch_demo.model.entity.UserEntityModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserJPARepo extends JpaRepository<UserEntityModel, Integer> {
}
