package com.java.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


    @RestController
    @RequestMapping("/serviceA")
     public class UserController {

        @GetMapping("/callServiceB")
        public String callServiceB() {
            String serviceBUrl = "http://localhost:8081/serviceB/endpoint"; // URL of Service B's endpoint

            RestTemplate restTemplate = new RestTemplate();
            return restTemplate.getForObject(serviceBUrl, String.class);
        }
    }
