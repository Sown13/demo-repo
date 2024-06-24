package com.example.elasticsearch_demo.repo;

import com.example.elasticsearch_demo.model.mongo.UserMongoDocument;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMongoDBRepo extends MongoRepository<UserMongoDocument, Integer> {
    @Query("{id:'?0'}")
    UserMongoDocument findItemByName(Integer id);

    @Query(value="{age:'?0'}", fields="{'username' : 1, 'quantity' : 1}")
    List<UserMongoDocument> findAll(Integer age);


}
