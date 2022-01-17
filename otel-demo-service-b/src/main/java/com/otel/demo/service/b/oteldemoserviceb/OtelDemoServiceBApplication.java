package com.otel.demo.service.b.oteldemoserviceb;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class OtelDemoServiceBApplication {

	public static void main(String[] args) {
		log.info("Starting service-b");
		SpringApplication.run(OtelDemoServiceBApplication.class, args);
	}

}
