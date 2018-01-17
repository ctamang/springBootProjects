package demoApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import lombok.extern.slf4j.Slf4j;


@SpringBootApplication
@Slf4j
public class SpringBootMain {
	

	public static void main(String[] args) {
		
		log.trace("doStuff needed more information - {}");
		log.debug("doStuff needed to debug - {}");
		log.info("doStuff took input - {}");
		log.warn("doStuff needed to warn - {}");
		log.error("doStuff encountered an error with value - {}");
		SpringApplication.run(SpringBootMain.class, args);
		
	}

}
