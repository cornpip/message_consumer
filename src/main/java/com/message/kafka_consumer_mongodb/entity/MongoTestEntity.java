package com.message.kafka_consumer_mongodb.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "testCollection")
@Getter
@Setter
@ToString
public class MongoTestEntity {
    @Id
    private String id;

    private String firstName;
    private String lastName;

    public MongoTestEntity(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
