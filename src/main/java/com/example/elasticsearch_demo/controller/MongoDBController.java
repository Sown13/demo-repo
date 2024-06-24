package com.example.elasticsearch_demo.controller;

import com.example.elasticsearch_demo.model.mongo.UserMongoDocument;
import com.example.elasticsearch_demo.repo.UserMongoDBRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/mongo")
public class MongoDBController {
    @Autowired
    private UserMongoDBRepo mongoDBRepo;

    @GetMapping("/{id}")
    public UserMongoDocument getOneById(@PathVariable Integer id){
        return mongoDBRepo.findItemByName(id);
    }

    @PostMapping
    public void saveMongoDemo(UserMongoDocument userMongoDocument){
        mongoDBRepo.save(userMongoDocument);
    }

    @GetMapping
    public List<UserMongoDocument> getAll(){
        return mongoDBRepo.findAll();
    }
}
