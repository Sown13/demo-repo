package com.example.elasticsearch_demo.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "skill")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class SkillEntityModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "INT(11)")
    private Integer id;
    private String skillName;
    private String description;
    private String skillType;
    private Integer userId;

}
