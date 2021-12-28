package com.battleslimes.battleslimes.services;

import com.battleslimes.battleslimes.com.battleslimes.battleslimes.services.BattleSlimes;
import com.battleslimes.battleslimes.db.MongoDBConnection;
import com.mongodb.DBObject;
import com.mongodb.client.MongoCursor;
import lombok.extern.slf4j.Slf4j;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import static com.mongodb.client.model.Filters.eq;
import java.util.Random;


import java.util.List;

@Service
@Slf4j
public class BattleSlimeService {

    @Autowired
    private MongoDBConnection mongoDBConnection;

    public BattleSlimes.SlimeCollection getAllSlimes() {

        var slimeCollectionBuilder = BattleSlimes.SlimeCollection.newBuilder();

        try {
            MongoCursor<Document> cursor = mongoDBConnection.getSlimesCollection().find().iterator();
            while (cursor.hasNext()) {
                Document documentOn = cursor.next();
                BattleSlimes.Slime currentSlime = BattleSlimes.Slime
                        .newBuilder()
                        .setCollectorNumber(documentOn.get("collector_number") != null ? documentOn.get("collector_number").toString() :  "")
                        .setName(documentOn.get("name") != null ? documentOn.get("name").toString() :  "")
                        .setDescription(documentOn.get("description") != null ? documentOn.get("description").toString() :  "")
                        .setMetadata(documentOn.get("metadata") != null ? documentOn.get("metadata").toString() :  "")
                        .setPicture(documentOn.get("picture") != null ? documentOn.get("picture").toString() :  "")
                        .setOpenseaUrl(documentOn.get("opensea_url") != null ? documentOn.get("opensea_url").toString() :  "")
                        .build();

                slimeCollectionBuilder.addSlimes(currentSlime);
            }
        } catch (Exception e) {
            log.error("Exception Caught while populating SlimeCollection:" + e);
        }

        return slimeCollectionBuilder.build();
    }

    public BattleSlimes.Slime getSlime(String collector_number) {
        var slimeFound = (Document) mongoDBConnection.getSlimesCollection().find(eq("collector_number", collector_number)).first();

        BattleSlimes.Slime returnSlime = BattleSlimes.Slime
                .newBuilder()
                .setCollectorNumber(slimeFound.get("collector_number") != null ? slimeFound.get("collector_number").toString() :  "")
                .setName(slimeFound.get("name") != null ? slimeFound.get("name").toString() :  "")
                .setDescription(slimeFound.get("description") != null ? slimeFound.get("description").toString() :  "")
                .setMetadata(slimeFound.get("metadata") != null ? slimeFound.get("metadata").toString() :  "")
                .setPicture(slimeFound.get("picture") != null ? slimeFound.get("picture").toString() :  "")
                .setOpenseaUrl(slimeFound.get("opensea_url") != null ? slimeFound.get("opensea_url").toString() :  "")
                .build();

        return returnSlime;
    }

    public BattleSlimes.Slime getRandomSlime() {
        Random rand = new Random(); //instance of random class
        int upperbound = 25;
        //generate random values from 0-24, + 1 to not include 0
        int int_random = rand.nextInt(upperbound + 1);

        return getSlime(String.valueOf(int_random));
    }
}
