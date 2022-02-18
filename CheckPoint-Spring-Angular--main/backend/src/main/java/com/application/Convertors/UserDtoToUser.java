package com.application.Convertors;

import com.application.DTO.*;
import com.application.entities.User;
import org.springframework.stereotype.Component;

@Component
public class UserDtoToUser {

    public User UserDtoToUser(UserDTO userDTO){
        User user=new User();
        user.setPassword(userDTO.getPassword());
        user.setUsername(userDTO.getUsername());
        return user;
    }
}
