package com.example.elasticsearch_demo.controller;

import com.example.elasticsearch_demo.model.elastic.UserElasticsearchModel;
import com.example.elasticsearch_demo.repo.UserElasticsearchRepo;
import com.example.elasticsearch_demo.service.TestModelElasticsearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/elasticsearch")
public class ElasticsearchController {
    @Autowired
    TestModelElasticsearchService elasticsearchService;
    @Autowired
    UserElasticsearchRepo repo;

    @GetMapping("")
    public Iterable<UserElasticsearchModel> getAll () {
//        return elasticsearchService.getAll();
        return repo.findAll();
    }

    @PostMapping("")
    public void addTestModel(@RequestBody UserElasticsearchModel testModel){
        elasticsearchService.save(testModel);
    }
    @PatchMapping("/patch")
    public void updateTestModel(@RequestBody UserElasticsearchModel testModel){
        elasticsearchService.save(testModel);
    }

    @GetMapping("/{id}")
    public UserElasticsearchModel findModelById(@PathVariable String id){
        return repo.findById(id).orElse(null);
    }

    @PostMapping("/search")
    public List<UserElasticsearchModel> findBySearch(@RequestBody String searchTerm){
        return repo.findByMultipleFields(searchTerm);
    }
}
