package com.service.api.service_api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class Test {

    @RequestMapping("one")
    public String test() {
        return "test[success]";
    }
}
