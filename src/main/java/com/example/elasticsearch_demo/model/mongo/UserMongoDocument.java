package com.example.elasticsearch_demo.model.mongo;

import com.example.elasticsearch_demo.model.enum_model.GenderEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Document("test_user")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class UserMongoDocument {

    private Integer id;
    private String firstname;
    private String username;
    private String hashPassword;
    private Integer age;
    private GenderEnum gender;
    private Date birthDay;
    private List<SkillMongoDocument> skillList;
    private List<UserProjectMongoDocument> projectList;
    private List<LanguageMongoDocument> languageList;
}
