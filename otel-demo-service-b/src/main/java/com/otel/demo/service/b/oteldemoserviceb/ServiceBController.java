package com.otel.demo.service.b.oteldemoserviceb;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@Slf4j
class ServiceBController {

    private final RestTemplate restTemplate;

    public ServiceBController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping(value = "/service-b")
    public ResponseEntity<String> sluethServiceA() {
        try {
            log.info("Inside service-b..");
            String tracingMessage = this.restTemplate.getForObject("http://whatthecommit.com/index.txt", String.class);
            log.info("Call to external site completed");
            String response = "service-a, service-b calls are working";
        return new ResponseEntity<>(response, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
