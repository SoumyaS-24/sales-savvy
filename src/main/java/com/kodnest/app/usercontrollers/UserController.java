package com.kodnest.app.usercontrollers;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kodnest.app.dao.UserDao;
import com.kodnest.app.entities.User;
import com.kodnest.app.userServices.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@RequestBody User user) {
        try {
            User registeredUser = userService.registerUser(user);
            UserDao userDao = new UserDao(registeredUser.getUserId() , registeredUser.getUsername(), registeredUser.getEmail(), registeredUser.getRole().name());
            return ResponseEntity.ok(Map.of("message", "User registered successfully", "user", userDao));
        } catch (RuntimeException e) {
            return ResponseEntity.badRequest().body(Map.of("error", e.getMessage()));
        }
    }
    

}
