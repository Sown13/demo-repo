package com.example.elasticsearch_demo.model.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "project")
@Builder
@AllArgsConstructor
@Data
@NoArgsConstructor
public class UserProjectEntityModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "INT(11)")
    private String id;
    @Column(name = "project_name", columnDefinition = "VARCHAR(32)")
    private String projectName;
    @Column(name = "article", columnDefinition = "TEXT")
    private String article;
    @Column(name = "period", columnDefinition = "INT")
    private Integer period;
    @Column(name = "user_id", columnDefinition = "INT")
    private Integer userId;

}
