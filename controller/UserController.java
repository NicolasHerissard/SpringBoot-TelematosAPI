package com.example.telematos_api.controller;

import com.example.telematos_api.Entity.User;
import com.example.telematos_api.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

@Controller
@RestController
@RequestMapping(path = "/api/user")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(path = "", produces = APPLICATION_JSON_VALUE)
    public List<User> getAll() {
        return userService.getAll();
    }

    @ResponseStatus(value = HttpStatus.CREATED)
    @PostMapping(path = "/post")
    public User create(@RequestBody User user) {
        return userService.save(user);
    }
}
