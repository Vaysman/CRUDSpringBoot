package com.springboot.controller;

import com.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping
    public String getAllUser(Model model){
        model.addAttribute("getAllUser", this.userService.getAllUser());
        return "userPage";
    }
}

