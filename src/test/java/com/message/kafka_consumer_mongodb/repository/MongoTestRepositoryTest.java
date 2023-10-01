package com.message.kafka_consumer_mongodb.repository;

import com.message.kafka_consumer_mongodb.entity.MongoTestEntity;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MongoTestRepositoryTest {
    @Autowired
    private MongoTestRepository mongoTestRepository;

    @DisplayName("saveTest")
    @Test
    public void saveTest() {
        MongoTestEntity mongoTestEntity = new MongoTestEntity("choi", "seonhyo");
        MongoTestEntity insertedEntity = mongoTestRepository.insert(mongoTestEntity);
        System.out.println(insertedEntity);
    }

    @DisplayName("deleteTest")
    @Test
    public void deleteTest() {
        List<MongoTestEntity> findList = mongoTestRepository.findByFirstName("choi");
        mongoTestRepository.deleteAll(findList);
    }

    @DisplayName("updateTest")
    @Test
    public void updateTest() {
        MongoTestEntity mongoTestEntity = new MongoTestEntity("jeon", "seonhyo");
        MongoTestEntity inserted = mongoTestRepository.insert(mongoTestEntity);
        inserted.setFirstName("choi");
        mongoTestRepository.save(inserted);
        //insert 는 _id 중복시 예외
        //save 는 _id 중복시 update
    }

    @DisplayName("findTest")
    @Test
    public void findTest() {
        List<MongoTestEntity> findList = mongoTestRepository.findByFirstName("choi");
        System.out.println(findList);
        System.out.println(findList.size());
    }
}