package com.otel.demo.service.oteldemoservicea;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class OtelDemoServiceAApplication {

	public static void main(String[] args) {
		log.info("Starting service-a");
		SpringApplication.run(OtelDemoServiceAApplication.class, args);
	}

}
