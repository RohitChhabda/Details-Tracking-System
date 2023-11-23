package com.developerstalk.dts.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
public class UserRequest {

    private String username;
    private String password;

    // Constructors, getters, setters
}

