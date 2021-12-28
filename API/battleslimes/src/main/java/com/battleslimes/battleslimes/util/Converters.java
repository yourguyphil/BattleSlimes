package com.battleslimes.battleslimes.util;

import com.battleslimes.battleslimes.services.BattleSlimes;
import lombok.extern.slf4j.Slf4j;
import models.SlimeCollectionKeyNames;
import org.bson.Document;

@Slf4j
public class Converters {

    public static BattleSlimes.Slime documentToSlime(Document slimeDocument) {
        BattleSlimes.Slime slime = BattleSlimes.Slime
                .newBuilder()
                .setCollectorNumber(getStringValueDefaultEmpty(slimeDocument, SlimeCollectionKeyNames.COLLECTOR_NUMBER))
                .setName(getStringValueDefaultEmpty(slimeDocument, SlimeCollectionKeyNames.NAME))
                .setDescription(getStringValueDefaultEmpty(slimeDocument, SlimeCollectionKeyNames.DESCRIPTION))
                .setMetadata(getStringValueDefaultEmpty(slimeDocument, SlimeCollectionKeyNames.METADATA))
                .setPicture(getStringValueDefaultEmpty(slimeDocument, SlimeCollectionKeyNames.PICTURE))
                .setOpenseaUrl(getStringValueDefaultEmpty(slimeDocument, SlimeCollectionKeyNames.OPENSEA_URL))
                .build();

        return slime;
    }

    //Unit Testable
    private static String getStringValueDefaultEmpty(Document document, String keyName) {
        var value = document.get(keyName);

        if (value == null) {
            log.error(keyName + " in slime document: " + document.getObjectId("_id").toHexString());
        }

        return String.valueOf(value);
    }
}
