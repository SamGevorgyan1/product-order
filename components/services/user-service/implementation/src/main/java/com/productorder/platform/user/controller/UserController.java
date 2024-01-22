package com.productorder.platform.user.controller;

import com.productorder.platform.user.repository.UserRepository;
import com.productorder.platform.user.springjpa.UserEntity;
import com.productorder.platform.user.iface.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping
    public @ResponseBody UserEntity create(@RequestBody User user) {


        return null;
    }


}
