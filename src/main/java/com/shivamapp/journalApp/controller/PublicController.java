package com.shivamapp.journalApp.controller;

import com.shivamapp.journalApp.entity.User;
import com.shivamapp.journalApp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/public")

public class PublicController {
    @Autowired
    private UserService userService;
    @GetMapping("/health-check")
    public String healthcheck(){
        return "Ok";
    }

    @PostMapping("/create-user")
    public void createUser(@RequestBody User user){
        userService.saveNewUser(user);
    }
}
