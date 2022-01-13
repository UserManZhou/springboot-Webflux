package com.springboot.webflux.controller;

import com.springboot.webflux.entity.User;
import com.springboot.webflux.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user/{id}")
    public Mono<User> userMono(@PathVariable int id){
       return userService.getUserById(id);
    }

    @GetMapping("/user")
    public Flux<User> userFlux(){
        return userService.findUser();
    }

    @PostMapping("/saveUser")
    public Mono<Void> saveUser(@RequestBody User user){
        Mono<User> mono = Mono.just(user);
        return userService.saveUser(mono);
    }

}
