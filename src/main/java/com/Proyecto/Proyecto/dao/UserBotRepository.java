package com.Proyecto.Proyecto.dao;


import com.Proyecto.Proyecto.domain.UserBot;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserBotRepository extends JpaRepository<UserBot,Integer> {

    UserBot findByBotUserId(String botUserId);
}
