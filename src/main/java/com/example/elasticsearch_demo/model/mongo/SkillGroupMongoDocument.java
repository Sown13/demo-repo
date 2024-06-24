package com.example.elasticsearch_demo.model.mongo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document("skill_group")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class SkillGroupMongoDocument {
    @Id
    private String id;
    private String skillGroupName;
    private List<SkillMongoDocument> skillList;
}
