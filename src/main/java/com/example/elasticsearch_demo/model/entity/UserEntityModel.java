package com.example.elasticsearch_demo.model.entity;

import com.example.elasticsearch_demo.model.enum_model.GenderEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;

@Entity(name = "test_user")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class UserEntityModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "INT(11)")
    private Integer id;
    private String firstname;
    @Column(name = "username", columnDefinition = "VARCHAR(32)")
    private String username;
    private String hashPassword;
    @Column(name = "user_age", columnDefinition = "INT")
    private Integer age;
    private GenderEnum gender;
    private Date birthDay;
}
