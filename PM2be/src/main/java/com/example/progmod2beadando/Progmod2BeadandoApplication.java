package com.example.progmod2beadando;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.filter.CharacterEncodingFilter;

@SpringBootApplication
public class Progmod2BeadandoApplication implements CommandLineRunner {
	private static final Logger LOGGER = LoggerFactory.getLogger(Progmod2BeadandoApplication.class);
	private static final String TAG = "Demo - " + Progmod2BeadandoApplication.class.getSimpleName();

	public static void main(String[] args) {
		LOGGER.info("Starting Demo and endpoint.");
		SpringApplication.run(Progmod2BeadandoApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		LOGGER.info(TAG + " Running With settings: ");

	}

	@Bean
	CharacterEncodingFilter characterEncodingFilter() {
		CharacterEncodingFilter filter = new CharacterEncodingFilter();
		filter.setEncoding("UTF-8");
		filter.setForceEncoding(true);
		return filter;
	}
}