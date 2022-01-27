package com.jimin.chemsolution.index;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @GetMapping("/api")
    public String index() {
        return "Hello, World";
    }
}
