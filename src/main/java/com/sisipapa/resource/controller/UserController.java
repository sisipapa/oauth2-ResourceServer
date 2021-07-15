package com.sisipapa.resource.controller;

import com.sisipapa.resource.entity.User;
import com.sisipapa.resource.repository.UserJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/v1")
public class UserController {

    private final UserJpaRepository userJpaRepository;

    @GetMapping(value = "/users")
    public List<User> findAllUser() {
        return userJpaRepository.findAll();
    }
}
