//package com.project.fiapnotes.service;
//
//import com.project.fiapnotes.models.UserModel;
//import com.project.fiapnotes.repository.UserRepository;
//import org.springframework.boot.ApplicationArguments;
//import org.springframework.boot.ApplicationRunner;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.stereotype.Service;
//
//import java.util.logging.Level;
//import java.util.logging.Logger;
//
//@Service
//public class UserService implements ApplicationRunner {
//
//    private static final Logger LOGGER = Logger.getLogger(UserService.class.getName());
//
//    private final UserRepository repository;
//
//    public UserService(UserRepository repository) {
//        this.repository = repository;
//    }
//
//    @Override
//    public void run(ApplicationArguments args) throws Exception {
//        var user = new UserModel();
//        user.setUserName("Fernanda");
//        user.setPassword(new BCryptPasswordEncoder().encode("senha1234"));
//        System.out.println(new BCryptPasswordEncoder().encode("senha1234"));
//        repository.save(user);
//        repository.findById(user.getId()).ifPresent(it -> {
//            LOGGER.log(Level.INFO, user.toString());
//        });
//
//        var user2 = new UserModel();
//        user2.setUserName("Carol");
//        user2.setPassword(new BCryptPasswordEncoder().encode("senha123"));
//        System.out.println(new BCryptPasswordEncoder().encode("senha123"));
//        repository.save(user2);
//        repository.findById(user2.getId()).ifPresent(it -> {
//            LOGGER.log(Level.INFO, user2.toString());
//        });
//
//
//    }
//}
