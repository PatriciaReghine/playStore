package com.playstore.playstore.repositories;

import com.playstore.playstore.entities.User;


import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
