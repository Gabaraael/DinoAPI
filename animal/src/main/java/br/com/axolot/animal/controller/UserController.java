package br.com.axolot.animal.controller;

import br.com.axolot.animal.Service.UserService;
import br.com.axolot.animal.dtos.UserRegisterDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping(path = "/register")
    public ResponseEntity<?> registerUser(@RequestBody UserRegisterDto userRegister) {

        return ResponseEntity.ok().body(true);
    }
}
