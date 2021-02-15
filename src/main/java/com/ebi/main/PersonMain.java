package com.ebi.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
/**
 * Main Person Application
 * @author vp
 */
public class PersonMain {

	/**
	 * Main app method
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(PersonMain.class, args);
	}

}
