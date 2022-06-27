package com.springjwt.springjwt.controller;

import com.springjwt.springjwt.models.JwtRequest;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by DELL on 6/27/2022.
 */
@RestController
@CrossOrigin(origins="http://localhost:3000")
public class NewController {
    @GetMapping("/hello")
    public JwtRequest home(){
        JwtRequest jwtRequest = new JwtRequest();
        jwtRequest.setUsername("admin");
        return jwtRequest;
    }
}
