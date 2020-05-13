package com.interview.trutec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.interview.trutec.config.SwaggerConfig;

@SpringBootApplication
@Import(SwaggerConfig.class)
public class TruetecApplication {

	public static void main(String[] args) {
		SpringApplication.run(TruetecApplication.class, args);
	}

}
