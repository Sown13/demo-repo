package com.example.elasticsearch_demo.model.elastic;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class UserProjectElasticsearchModel {
    private String projectName;
    private String article;
    private Integer period;
    private Integer userId;
}
