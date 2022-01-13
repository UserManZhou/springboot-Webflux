package com.springboot.webflux;

import com.springboot.webflux.entity.User;
import com.springboot.webflux.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Flux;

@SpringBootTest
class SpringbootWebfluxApplicationTests {

    @Autowired
    private UserService userService;

    @Test
    void contextLoads() {
        Flux<User> user = userService.findUser();
    }

}
