package com.example.SpringJPAKHibernate.controller;

import com.example.SpringJPAKHibernate.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.SpringJPAKHibernate.repository.UserRepository;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserRepository userRepoObj;
    @PostMapping("/signup")
    public User saveUser(@RequestBody User userObj){
        System.out.println(userObj);
        User userResponse = userRepoObj.save(userObj);

        return userResponse;
    };

    @PostMapping("/signups")
    public List<User> saveUsers(@RequestBody List<User> userObjs){
        System.out.println(userObjs);
        List<User> userResponse = userRepoObj.saveAll(userObjs);

        return userResponse;
    };

    @GetMapping("/users")
    public List<User> getAllUsers() {
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

    // Delete All Users
    @DeleteMapping("/delete")
    public void deleteAllUser(){
        userRepoObj.deleteAll();
    }

    // find by id
    @GetMapping("/findbyid/{id}")
    public User findById(@PathVariable int id){
        try {
            return userRepoObj.findById(id).get();
        } catch (NoSuchElementException e){
            System.out.println(e);
        } catch (Exception e){
            System.out.println(e);
        }
        return null;
    }

    @GetMapping("/existbyid/{id}")
    public boolean existById(@PathVariable int id){
        Optional<User>  req = userRepoObj.findById(id);
        if(req.isEmpty()) return false;
        return true;
    }

    // delete user by ID
    @DeleteMapping("/delete/{id}")
    public void deleteUserById(@PathVariable int id){
        userRepoObj.deleteById(id);
    }

}
