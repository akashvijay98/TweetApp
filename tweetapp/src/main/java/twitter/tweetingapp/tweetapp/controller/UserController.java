package twitter.tweetingapp.tweetapp.controller;


import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;
import  twitter.tweetingapp.tweetapp.domain.Users;
import  twitter.tweetingapp.tweetapp.service.UserService;
import twitter.tweetingapp.tweetapp.service.UserService;

import java.util.List;
import java.util.UUID;

@RestController
public class UserController {

    private final UserService userService;


    UserController(UserService userService){
        this.userService = userService;

    }

    @PostMapping("/User")
    String postUser(@RequestBody Users userInfo){

        return userService.postUserDetails(userInfo);
    }


    @GetMapping("/User/{id}")
    Users getUser(@PathVariable String id){
        UUID uuid = UUID.fromString(id);
        return userService.getUserDetails(uuid);
    }

    @GetMapping("/User")
    List<Users> getUser() {
        return userService.getAllUsers();
    }







}
