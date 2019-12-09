package com.Proyecto.Proyecto.dao;


import com.Proyecto.Proyecto.domain.Usuario;
import com.Proyecto.Proyecto.repository.JpaRepository;


public interface UserRepository extends JpaRepository<Usuario,Integer> {

    Usuario findByBotUserId(String botUserId);
}
