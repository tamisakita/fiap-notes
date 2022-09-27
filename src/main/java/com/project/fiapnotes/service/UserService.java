package com.project.fiapnotes.service;

import com.project.fiapnotes.dto.AuthDto;
import com.project.fiapnotes.dto.CreateUserDto;
import com.project.fiapnotes.dto.TokenDto;
import com.project.fiapnotes.dto.UserDto;

public interface UserService {
    TokenDto login(AuthDto authDto);

    UserDto create(CreateUserDto createUserDto);
}
