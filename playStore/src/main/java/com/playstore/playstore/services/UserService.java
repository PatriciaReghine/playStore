package com.playstore.playstore.services;

import com.playstore.playstore.entities.User;
import com.playstore.playstore.repositories.UserRepository;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> findAllUsers(){
        return userRepository.findAll();
    }
    public User buscarPeloId(Long id){
        Optional<User> objeto = userRepository.findById(id);
        return objeto.get();
    }

}
