package com.developerstalk.dts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.developerstalk.dts.dao.UserRepository;
import com.developerstalk.dts.model.User;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

}
