package com.otel.demo.service.oteldemoservicea;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@Slf4j
class ServiceAController {

    @GetMapping(value = "/service-a")
    public ResponseEntity<String> sluethServiceA() {
        try {
            log.info("Inside service-a..");
            RestTemplate restTemplate = new RestTemplate();
            String response = (String) restTemplate.exchange("http://localhost:8082/service-b", HttpMethod.GET, null, new ParameterizedTypeReference<String>() {
            }).getBody();

        return new ResponseEntity<>(response, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
