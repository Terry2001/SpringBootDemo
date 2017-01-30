package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lenovopc on 2017/1/30.
 */
@RestController
@RefreshScope
public class ConfigClientController {
    @Value("${url}")
    private String url;

    @GetMapping("/hello")
    public String hello() {
        return this.url;
    }
}
