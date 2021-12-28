package com.battleslimes.battleslimes.db;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@Slf4j
public class MongoDBConnection {
    private String mongoDBConnectionUri = "INSERT MONGODB CONNECTION STRING HERE";
    @Getter
    @Setter
    private MongoCollection slimesCollection;

    MongoDBConnection() {
        ConnectionString connectionString = new ConnectionString(mongoDBConnectionUri);
        MongoClientSettings settings = MongoClientSettings.builder()
                .applyConnectionString(connectionString)
                .build();
        MongoClient mongoClient = MongoClients.create(settings);
        MongoDatabase database = mongoClient.getDatabase("BattleSlimes");
        this.slimesCollection = database.getCollection("Slimes");
        log.info("Connected to BattleSlimes Mongo DB!");
    }
}
