package com.playstore.playstore.resources;

import com.playstore.playstore.entities.User;
import com.playstore.playstore.services.UserService;
import jakarta.persistence.Id;
import org.hibernate.engine.jdbc.connections.internal.UserSuppliedConnectionProviderImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/user")

public class UserResource {

        @Autowired
        UserService userService;

        @GetMapping
        public ResponseEntity<List<User>> findAllUsers(){
            List<User> listaDeUsuarios = userService.findAllUsers();
            return ResponseEntity.ok().body(listaDeUsuarios);
        }

        @GetMapping(value = "/teste")
        public ResponseEntity<User> buscarPorId(long id){
            User user = userService.buscarPeloId(1L);
            return ResponseEntity.ok().body(user);
        }
}
