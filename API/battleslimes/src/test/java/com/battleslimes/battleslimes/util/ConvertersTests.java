
package com.battleslimes.battleslimes.util;

import com.battleslimes.battleslimes.services.BattleSlimes;
import models.SlimeCollectionKeyNames;
import org.bson.Document;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConvertersTests {
    @Test
    void documentToSlime_Populated(){

        String expectedCollectorNumber = "1";
        String expectedName = "Blu";
        String expectedDescription = "Some Description";
        String expectedMetadata = "Some Metadata";
        String expectedPicture = "https://storage.googleapis.com/battleslimes_bucket/assets/images/slimecollection/BattleSlime1.svg";
        String expectedOpenseaUrl = "https://opensea.io/assets/0x495f947276749ce646f68ac8c248420045cb7b5e/38702784988183345035410978490421897305681563005849230365966878050034284232705";

        BattleSlimes.Slime expectedSlime = BattleSlimes.Slime.newBuilder()
                                            .setCollectorNumber(expectedCollectorNumber)
                                            .setName(expectedName)
                                            .setDescription(expectedDescription)
                                            .setMetadata(expectedMetadata)
                                            .setPicture(expectedPicture)
                                            .setOpenseaUrl(expectedOpenseaUrl)
                                            .build();

        Document inputDocument = new Document();
        inputDocument.append(SlimeCollectionKeyNames.COLLECTOR_NUMBER, expectedCollectorNumber);
        inputDocument.append(SlimeCollectionKeyNames.NAME, expectedName);
        inputDocument.append(SlimeCollectionKeyNames.DESCRIPTION, expectedDescription);
        inputDocument.append(SlimeCollectionKeyNames.METADATA, expectedMetadata);
        inputDocument.append(SlimeCollectionKeyNames.PICTURE, expectedPicture);
        inputDocument.append(SlimeCollectionKeyNames.OPENSEA_URL, expectedOpenseaUrl);

        BattleSlimes.Slime actualSlime = Converters.documentToSlime(inputDocument);

        assertEquals(expectedCollectorNumber, actualSlime.getCollectorNumber());
        assertEquals(expectedName, actualSlime.getName());
        assertEquals(expectedDescription, actualSlime.getDescription());
        assertEquals(expectedMetadata, actualSlime.getMetadata());
        assertEquals(expectedPicture, actualSlime.getPicture());
        assertEquals(expectedOpenseaUrl, actualSlime.getOpenseaUrl());

        assertEquals(expectedSlime, actualSlime);
    }

    @Test
    void documentToSlime_Empty(){

        String expectedCollectorNumber = Constants.EMPTY_STRING;
        String expectedName = Constants.EMPTY_STRING;
        String expectedDescription = Constants.EMPTY_STRING;
        String expectedMetadata = Constants.EMPTY_STRING;
        String expectedPicture = Constants.EMPTY_STRING;
        String expectedOpenseaUrl = Constants.EMPTY_STRING;

        BattleSlimes.Slime expectedSlime = BattleSlimes.Slime.newBuilder().build();

        Document inputDocument = new Document();
        inputDocument.append(SlimeCollectionKeyNames.COLLECTOR_NUMBER, expectedCollectorNumber);
        inputDocument.append(SlimeCollectionKeyNames.NAME, expectedCollectorNumber);
        inputDocument.append(SlimeCollectionKeyNames.DESCRIPTION, expectedCollectorNumber);
        inputDocument.append(SlimeCollectionKeyNames.METADATA, expectedCollectorNumber);
        inputDocument.append(SlimeCollectionKeyNames.PICTURE, expectedCollectorNumber);
        inputDocument.append(SlimeCollectionKeyNames.OPENSEA_URL, expectedCollectorNumber);

        BattleSlimes.Slime actualSlime = Converters.documentToSlime(inputDocument);

        assertEquals(expectedCollectorNumber, actualSlime.getCollectorNumber());
        assertEquals(expectedName, actualSlime.getName());
        assertEquals(expectedDescription, actualSlime.getDescription());
        assertEquals(expectedMetadata, actualSlime.getMetadata());
        assertEquals(expectedPicture, actualSlime.getPicture());
        assertEquals(expectedOpenseaUrl, actualSlime.getOpenseaUrl());

        assertEquals(expectedSlime, actualSlime);
    }
}
