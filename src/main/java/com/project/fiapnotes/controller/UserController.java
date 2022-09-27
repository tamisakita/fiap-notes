package com.project.fiapnotes.controller;

import com.project.fiapnotes.dto.AuthDto;
import com.project.fiapnotes.dto.CreateUserDto;
import com.project.fiapnotes.dto.TokenDto;
import com.project.fiapnotes.dto.UserDto;
import com.project.fiapnotes.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("login")
    public TokenDto login(@RequestBody AuthDto authDto) {
        return userService.login(authDto);
    }

    @PostMapping
    public UserDto create(@RequestBody CreateUserDto createUserDto) {
        return userService.create(createUserDto);
    }
}
