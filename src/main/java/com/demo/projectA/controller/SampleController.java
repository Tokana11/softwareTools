package com.demo.projectA.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @GetMapping(value = "/test")
    public String greeting () {
        return "Hello I'm project A Sample controller!";
    }
}
