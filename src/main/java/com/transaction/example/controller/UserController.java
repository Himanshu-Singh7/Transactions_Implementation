package com.transaction.example.controller;
import com.transaction.example.service.UserProgramaticApproach1;
import com.transaction.example.service.UserProgramativeApproach2;
import com.transaction.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class UserController {
     // http://localhost:9191/api/update_user
     @Autowired
     UserService userServiceObj;

     @Autowired
     UserProgramaticApproach1 user1;

     @Autowired
     UserProgramativeApproach2 user2;

     @GetMapping(path = "/update_user")
    public String updateUser(){
         userServiceObj.method1();
         return "User is Update successfully";
    }
}
