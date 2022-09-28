package com.project.fiapnotes.config.security;

import com.project.fiapnotes.models.UserModel;
import com.project.fiapnotes.repository.UserRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserDetailsService, ApplicationRunner {

    private final UserRepository repository;

    public UserServiceImpl(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserModel userModel = repository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("User Not Found with username: " + username));
        return new User(userModel.getUsername(), userModel.getPassword(), true, true, true,true, userModel.getAuthorities());
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        var user = new UserModel();
        user.setId(1L);
        user.setUsername("Fernanda");
        user.setPassword(new BCryptPasswordEncoder().encode("senha1234"));
        System.out.println(new BCryptPasswordEncoder().encode("senha1234"));
        repository.save(user);
    }
}
