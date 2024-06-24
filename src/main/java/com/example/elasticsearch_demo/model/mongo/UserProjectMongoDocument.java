package com.example.elasticsearch_demo.model.mongo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;


@Builder
@AllArgsConstructor
@Data
@NoArgsConstructor
public class UserProjectMongoDocument {

    private String id;
    private String projectName;
    private String article;
    private Integer period;
    private Integer userId;

}
