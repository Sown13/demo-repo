package com.example.elasticsearch_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class ElasticsearchDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ElasticsearchDemoApplication.class, args);
	}

}