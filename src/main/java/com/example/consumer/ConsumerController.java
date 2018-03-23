package com.example.consumer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

    @Value("${dependentServiceUri}")
    private String dependentServiceUri;

    @GetMapping("/")
    public String getMoreContentFromDependentService() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(dependentServiceUri, String.class);
    }

}
