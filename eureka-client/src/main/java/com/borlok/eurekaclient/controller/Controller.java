package com.borlok.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/main")
public class Controller {
    @Value("${eureka.instance.instance-id}")
    private String instance;

    @GetMapping("/test")
    public String test() {
        return "LET'S CODE!!! With" + instance;
    }
}
