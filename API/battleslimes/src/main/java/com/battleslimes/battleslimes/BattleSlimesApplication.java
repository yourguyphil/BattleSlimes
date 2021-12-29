package com.battleslimes.battleslimes;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration(exclude={MongoAutoConfiguration.class})
@ComponentScan("com.battleslimes.battleslimes")
@Slf4j
public class BattleSlimesApplication {

	public static void main(String[] args) {
		SpringApplication.run(BattleSlimesApplication.class, args);
		log.info("__________         __    __  .__           _________.__  .__                       ");
		log.info("\\______   \\_____ _/  |__/  |_|  |   ____  /   _____/|  | |__| _____   ____   ______");
		log.info(" |    |  _/\\__  \\\\   __\\   __\\  | _/ __ \\ \\_____  \\ |  | |  |/     \\_/ __ \\ /  ___/");
		log.info(" |    |   \\ / __ \\|  |  |  | |  |_\\  ___/ /        \\|  |_|  |  Y Y  \\  ___/ \\___ \\ ");
		log.info(" |______  /(____  /__|  |__| |____/\\___  >_______  /|____/__|__|_|  /\\___  >____  >");
		log.info("        \\/      \\/                     \\/        \\/               \\/     \\/     \\/");
		log.info("BattleSlimes Service has successfully started!!!");
	}

}
