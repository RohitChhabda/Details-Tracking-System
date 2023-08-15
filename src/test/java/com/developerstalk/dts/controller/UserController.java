package com.developerstalk.dts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.developerstalk.dts.dto.UserRequest;
import com.developerstalk.dts.model.User;
import com.developerstalk.dts.service.UserService;

@RestController
@RequestMapping
public class UserController {

    @Autowired
    private UserService userService;
    
    @GetMapping("/")
    public String index(Model model){
    	model.addAttribute("user", new User());
    	return "index";
    }

   
}

