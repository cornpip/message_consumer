package com.message.kafka_consumer_mongodb.repository;

import com.message.kafka_consumer_mongodb.entity.MongoTestEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface MongoTestRepository extends MongoRepository<MongoTestEntity, String> {
    public List<MongoTestEntity> findByFirstName(String firstName);
}
