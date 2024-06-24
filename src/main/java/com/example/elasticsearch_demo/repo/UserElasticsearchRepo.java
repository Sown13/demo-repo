package com.example.elasticsearch_demo.repo;

import co.elastic.clients.elasticsearch._types.query_dsl.QueryBuilders;
import com.example.elasticsearch_demo.model.elastic.UserElasticsearchModel;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.client.erhlc.NativeSearchQueryBuilder;
import org.springframework.data.elasticsearch.core.query.SearchTemplateQuery;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface UserElasticsearchRepo extends ElasticsearchRepository<UserElasticsearchModel, String> {

// JSon base query
    @Query("{\"bool\": {\"should\": [" +
            "  {\"match\": {\"project_list.article\": {\"query\": \"?0\"}}}, " +
            "  {\"match\": {\"username\": {\"query\": \"?0\"}}}, " +
            "  {\"match\": {\"skill_list.description\": {\"query\": \"?0\"}}}, " +
            "  {\"match\": {\"skill_list.skillName\": {\"query\": \"?0\"}}}, " +
            "  {\"match\": {\"language_list.language\": {\"query\": \"?0\"}}}, " +
            "  {\"match\": {\"project_list.projectName\": {\"query\": \"?0\"}}} " +
            "]}}")
    List<UserElasticsearchModel> findByMultipleFields(String input);

}
