package com.springboot.webflux.service;

import com.springboot.webflux.entity.User;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface UserService {

    Mono<User> getUserById(int id);

    Flux<User> findUser();

    Mono<Void> saveUser(Mono<User> userMono);

}
