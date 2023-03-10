package com.api.resources;

import com.api.domain.User;
import com.api.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserResoucers {

    @Autowired
    private UserService userService;


    @RequestMapping("/{id}")
    public ResponseEntity<User> findById(@PathVariable("id") Long id) {
        User user = userService.findById(id);

        return ResponseEntity.ok().body(user);

    }

}
