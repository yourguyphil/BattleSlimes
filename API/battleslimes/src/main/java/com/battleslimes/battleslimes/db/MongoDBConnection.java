package com.battleslimes.battleslimes.db;

import com.battleslimes.battleslimes.util.Constants;
import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class MongoDBConnection {
    @Getter
    @Setter
    private MongoCollection slimesCollection;

    MongoDBConnection(@Value("${mongo.connectionUri}") String mongoDBConnectionUri) {
        ConnectionString connectionString = new ConnectionString(mongoDBConnectionUri);
        MongoClientSettings settings = MongoClientSettings.builder()
                .applyConnectionString(connectionString)
                .build();
        MongoClient mongoClient = MongoClients.create(settings);
        MongoDatabase database = mongoClient.getDatabase(Constants.DATABASE_NAME);
        this.slimesCollection = database.getCollection(Constants.BATTLESLIMES_COLLECTION_NAME);
        log.info("Connected to BattleSlimes Mongo DB!");
    }
}
