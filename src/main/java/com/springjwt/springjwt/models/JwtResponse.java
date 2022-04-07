package com.springjwt.springjwt.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Bean;

import java.io.Serializable;

/**
 * Created by Kelzang Ugyen Dorji on 4/7/2022.
 */

public class JwtResponse implements Serializable {
    private static final long serialVersionUID = 1L;
    private final String token;
    public JwtResponse(String token) {
        this.token = token;
    }
    public String getToken() {
        return token;
    }
}
