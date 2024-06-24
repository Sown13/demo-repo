package com.example.elasticsearch_demo.model.elastic;

import com.example.elasticsearch_demo.model.enum_model.GenderEnum;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;
import org.springframework.data.elasticsearch.annotations.Mapping;

import java.util.Date;
import java.util.List;

@Document(indexName = "test_model")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class UserElasticsearchModel {
    @Id
    private String id;
    @Field(name = "username", type = FieldType.Text)
    private String username;
    @Field(name = "first_name", type = FieldType.Text)
    private String firstname;
    @Field(name = "age", type = FieldType.Text)
    private Integer age;
    @Field(name = "gender", type = FieldType.Text)
    private GenderEnum gender;
    @Field(name = "birth_day", type = FieldType.Date)
    private Date birthDay;
    @Field(name = "project_list", type = FieldType.Nested)
    private List<UserProjectElasticsearchModel> userProjectList;
    @Field(name="skill_list", type = FieldType.Nested)
    private List<SkillEntityElasticsearchModel> skillList;
    @Field(name="language_list", type = FieldType.Nested)
    private List<LanguageElasticsearchModel> languageList;
}
