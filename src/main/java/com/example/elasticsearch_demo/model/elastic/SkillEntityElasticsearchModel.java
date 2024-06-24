package com.example.elasticsearch_demo.model.elastic;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class SkillEntityElasticsearchModel {
    private String skillName;
    private String description;
    private String skillType;
    private Integer userId;
}
