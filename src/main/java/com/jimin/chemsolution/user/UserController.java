package com.jimin.chemsolution.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/api/user/add")
    public String AddUser() {
        return "test add user!";
    }
}
