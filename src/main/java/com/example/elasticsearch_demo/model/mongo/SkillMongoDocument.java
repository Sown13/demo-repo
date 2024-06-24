package com.example.elasticsearch_demo.model.mongo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("skill")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class SkillMongoDocument {

    private Integer id;
    private String skillName;
    private String description;
    private String skillType;
    private Integer userId;

}
