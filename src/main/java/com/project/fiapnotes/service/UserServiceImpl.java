package com.project.fiapnotes.service;

import com.project.fiapnotes.dto.AuthDto;
import com.project.fiapnotes.dto.CreateUserDto;
import com.project.fiapnotes.dto.TokenDto;
import com.project.fiapnotes.dto.UserDto;
import com.project.fiapnotes.entity.UserEntity;
import com.project.fiapnotes.repository.UserRepository;
import com.project.fiapnotes.security.JwtUtil;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class UserServiceImpl implements UserService {

    private AuthenticationManager authenticationManager;
    private JwtUtil jwtUtil;
    private PasswordEncoder passwordEncoder;
    private UserRepository userRepository;

    public UserServiceImpl(AuthenticationManager authenticationManager,
                           JwtUtil jwtUtil,
                           PasswordEncoder passwordEncoder,
                           UserRepository userRepository) {
        this.authenticationManager = authenticationManager;
        this.jwtUtil = jwtUtil;
        this.passwordEncoder = passwordEncoder;
        this.userRepository = userRepository;
    }
    @Override
    public TokenDto login(AuthDto authDto) {
        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
                    authDto.getUsername(),
                    authDto.getPassword()
            ));
        } catch (DisabledException | BadCredentialsException exception) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "invalid.credentials");
        }
        String token = jwtUtil.generateToken(authDto.getUsername());
        TokenDto tokenDto = new TokenDto();
        tokenDto.setToken(token);
        return tokenDto;
    }

    @Override
    public UserDto create(CreateUserDto createUserDto) {
        UserEntity userEntity = new UserEntity();
        userEntity.setUsername(createUserDto.getUsername());
        userEntity.setPassword(passwordEncoder.encode(createUserDto.getPassword()));
        UserEntity savedUser = userRepository.save(userEntity);

        UserDto userDto = new UserDto();
        userDto.setId(savedUser.getId());
        userDto.setUsername(savedUser.getUsername());
        return userDto;
    }
}
