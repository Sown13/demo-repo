package com.example.elasticsearch_demo.model.elastic;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class LanguageElasticsearchModel {
    private String language;
    private String user_id;
}
