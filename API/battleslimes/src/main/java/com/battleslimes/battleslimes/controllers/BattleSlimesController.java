package com.battleslimes.battleslimes.controllers;

import com.battleslimes.battleslimes.services.BattleSlimeService;
import com.battleslimes.battleslimes.services.BattleSlimes;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
@Slf4j
public class BattleSlimesController {
    @Autowired
    private BattleSlimeService battleSlimeService;

    @GetMapping(path = "/slimes", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getSlimes() {
        log.info("Request to getSlimes!");
        BattleSlimes.SlimeCollection battleSlimeCollection = null;
        try {
            battleSlimeCollection = battleSlimeService.getAllSlimes();

            log.info("Request to getSlimes Success!");
        } catch(Exception e) {
            log.info("Request to getSlimes Error: " + e);
            ResponseEntity.ok(HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return ResponseEntity.ok(battleSlimeCollection);
    }

    @GetMapping(path = "/slime/{collector_id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getSlime(@PathVariable(value="collector_id") String collector_id) {
        log.info("Request to getSlime for : " + collector_id);
        BattleSlimes.Slime battleSlime = null;
        try {
            battleSlime = battleSlimeService.getSlime(collector_id);

            log.info("Request to getSlime Success!");
        } catch(Exception e) {
            log.info("Request to getSlime Error: " + e);
        }

        return ResponseEntity.ok(battleSlime);
    }


    @GetMapping(path = "/randomslime", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> randomSlime() {

        BattleSlimes.Slime randomSlime = null;

        try {
            randomSlime = battleSlimeService.getRandomSlime();
        } catch (Exception e) {
            log.info("Request to randomSlime Error: " + e);
            ResponseEntity.ok(HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return ResponseEntity.ok(randomSlime);
    }
}
