/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package humber.learning.demo.controllers;

import humber.learning.demo.models.User;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Owner
 */
@RestController
public class UserController {
    
    @GetMapping("/users")
    public List<User> getAllProducts(){
        List<User> users = new ArrayList<User>();
        
        for(int i=1;i<=10;i++){
            User user = new User();
            user.setId(i);
            user.setName("User_" + i);
            user.setAddress("Street " + i + ", Toronto, ON");
            
            users.add(user);
        }
        
        return users;
    }
    
}
