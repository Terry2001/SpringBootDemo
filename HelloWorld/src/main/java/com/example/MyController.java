package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Terry on 17/2/11.
 */
@RestController
public class MyController {

    @GetMapping("/hello")
    public String hello()
    {
        return "Hello world!";
    }

}
