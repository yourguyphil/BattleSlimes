package com.battleslimes.battleslimes.services;

import com.battleslimes.battleslimes.db.MongoDBConnection;
import com.battleslimes.battleslimes.util.Constants;
import com.battleslimes.battleslimes.util.Converters;
import com.battleslimes.battleslimes.util.Verification;
import com.mongodb.client.MongoCursor;
import lombok.extern.slf4j.Slf4j;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import static com.mongodb.client.model.Filters.eq;

import java.util.Random;

@Service
@Slf4j
public class BattleSlimeService {

    @Autowired
    private MongoDBConnection mongoDBConnection;

    @Value("${mongo.connectionUri}")
    private String mongoDBConnectionString;

    public BattleSlimes.SlimeCollection getAllSlimes() {
        var slimeCollectionBuilder = BattleSlimes.SlimeCollection.newBuilder();

        try {
            getNewMongoConnecton();

            MongoCursor<Document> cursor = mongoDBConnection.getSlimesCollection().find().iterator();
            while (cursor.hasNext()) {
                Document documentOn = cursor.next();
                BattleSlimes.Slime currentSlime = Converters.documentToSlime(documentOn);
                slimeCollectionBuilder.addSlimes(currentSlime);
            }
        } catch (Exception e) {
            log.error(Constants.ERROR_PREFIX + "Exception Caught while populating SlimeCollection: " + e);
        }

        return slimeCollectionBuilder.build();
    }

    public BattleSlimes.Slime getSlime(String collector_number) throws Exception {

        BattleSlimes.Slime returnSlime = null;

        try {
            getNewMongoConnecton();
            int lengthOfValidInput = 4;

            if (!Verification.verifyCollector_Id(collector_number)) {
                throw new Exception("Invalid collector_number: A collector_number is a number of max length 4");
            }

            var documentFound = (Document) mongoDBConnection.getSlimesCollection().find(eq("collector_number", collector_number)).first();
            returnSlime = Converters.documentToSlime(documentFound);

        } catch(Exception e) {
            log.error(Constants.ERROR_PREFIX + "Exception caught in getSlime: " + e);
        }

        return returnSlime;
    }

    public BattleSlimes.Slime getRandomSlime() throws Exception {
        Random rand = new Random(); //instance of random class
        int upperbound = 25;
        //generate random values from 0-24, + 1 to not include 0
        int int_random = rand.nextInt(upperbound + 1);

        return getSlime(String.valueOf(int_random));
    }


    // Really ugly workaround to the mongoDB time out.
    // We will just generate a connection each time
    // More info about this solution https://stackoverflow.com/questions/52577486/how-to-avoid-an-exception-prematurely-reached-end-of-stream-using-mongodb-java-d
    private void getNewMongoConnecton() {
        this.mongoDBConnection = new MongoDBConnection(mongoDBConnectionString);
    }
}
