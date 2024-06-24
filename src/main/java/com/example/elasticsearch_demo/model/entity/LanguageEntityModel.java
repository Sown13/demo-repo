package com.example.elasticsearch_demo.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "language")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class LanguageEntityModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "INT(11)")
    private Integer id;
    @Column(name = "language")
    private String language;
    @Column(name="user_id")
    private Integer userId;
}
