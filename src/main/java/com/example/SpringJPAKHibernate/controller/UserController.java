package com.example.SpringJPAKHibernate.controller;

import com.example.SpringJPAKHibernate.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.SpringJPAKHibernate.repository.UserRepository;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserRepository userRepoObj;
    @PostMapping("/signup")
    public User save(@RequestBody User userObj){
        System.out.println(userObj);
        User userResponse = userRepoObj.save(userObj);

        return userResponse;
    };

    @GetMapping("/users")
    public List<User> index() {
        List<User> users = userRepoObj.findAll();
        for (User user: users){
            System.out.println(user);
        }
        return users;
    }

    @GetMapping("/")
    public String check() {
        return "Hello";
    }

    @DeleteMapping("/deleteall")
    public void delete(){
        userRepoObj.deleteAll();
    }



}
