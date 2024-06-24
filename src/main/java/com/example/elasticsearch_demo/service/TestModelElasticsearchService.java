package com.example.elasticsearch_demo.service;

import co.elastic.clients.elasticsearch._types.query_dsl.TermQuery;
import com.example.elasticsearch_demo.model.elastic.UserElasticsearchModel;
import com.example.elasticsearch_demo.repo.UserElasticsearchRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TestModelElasticsearchService {
    private final UserElasticsearchRepo testModelElasticsearchRepo;

    public void save(UserElasticsearchModel testModel){
        testModelElasticsearchRepo.save(testModel);
        System.out.println("save! \n");
    }

    public Iterable<UserElasticsearchModel> getAll(){
//        TermQuery termQuery = new TermQuery.Builder()
//                .field("filed1")
//                .value("exactValue")
//                .build();
        return testModelElasticsearchRepo.findAll();
    }


}
