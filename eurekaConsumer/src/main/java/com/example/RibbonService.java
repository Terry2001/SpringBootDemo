package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by lenovopc on 2017/1/29.
 */
@Service
public class RibbonService {
    @Autowired
    private RestTemplate restTemplate;

    public String findById(Long id) {

        // http://服务提供者的serviceId/url
        return this.restTemplate.getForObject("http://microservice-provider-user/" + id, String.class);
    }
}
