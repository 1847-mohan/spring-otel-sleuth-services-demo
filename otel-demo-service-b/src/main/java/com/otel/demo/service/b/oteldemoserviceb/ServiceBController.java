package com.otel.demo.service.b.oteldemoserviceb;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
class ServiceBController {

    @GetMapping(value = "/service-b")
    public ResponseEntity<String> sluethServiceA() {
        try {
            log.info("Inside service-b..");
            String response = "Api calls working";
        return new ResponseEntity<>(response, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
