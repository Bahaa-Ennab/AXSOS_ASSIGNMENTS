package com.bahaa.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @RequestMapping("/bb")
    public String index(@RequestParam(value = "q", required = false) String searchQuery) {
        return "You searched for: " + searchQuery;
    }
}