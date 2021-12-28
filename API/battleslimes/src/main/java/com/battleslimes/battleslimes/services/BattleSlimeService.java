package com.battleslimes.battleslimes.services;

import com.battleslimes.battleslimes.db.MongoDBConnection;
import com.battleslimes.battleslimes.util.Converters;
import com.battleslimes.battleslimes.util.Verification;
import com.mongodb.client.MongoCursor;
import lombok.extern.slf4j.Slf4j;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.mongodb.client.model.Filters.eq;

import java.util.Random;

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
                BattleSlimes.Slime currentSlime = Converters.documentToSlime(documentOn);
                slimeCollectionBuilder.addSlimes(currentSlime);
            }
        } catch (Exception e) {
            log.error("Exception Caught while populating SlimeCollection:" + e);
        }

        return slimeCollectionBuilder.build();
    }

    //Unit Testable
    private String getStringValueDefaultEmpty(Document document, String keyName) {
        var value = document.get(keyName);

        if (value == null) {
            log.error(keyName + " in slime document: " + document.getObjectId("_id").toHexString());
        }

        return String.valueOf(value);
    }

    public BattleSlimes.Slime getSlime(String collector_number) throws Exception {
        int lengthOfValidInput = 4;

        if (!Verification.isValidInputString(collector_number, lengthOfValidInput)) {
            throw new Exception("Invalid collector_number: A collector_number is a number of max length " + lengthOfValidInput);
        }

        var documentFound = (Document) mongoDBConnection.getSlimesCollection().find(eq("collector_number", collector_number)).first();
        BattleSlimes.Slime returnSlime = Converters.documentToSlime(documentFound);

        return returnSlime;
    }

    public BattleSlimes.Slime getRandomSlime() throws Exception {
        Random rand = new Random(); //instance of random class
        int upperbound = 25;
        //generate random values from 0-24, + 1 to not include 0
        int int_random = rand.nextInt(upperbound + 1);

        return getSlime(String.valueOf(int_random));
    }
}
