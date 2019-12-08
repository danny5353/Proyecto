package com.Proyecto.Proyecto.repository;

import com.Proyecto.Proyecto.domain.Usuario;
import org.springframework.beans.MutablePropertyValues;
//import org.springframework.data.jpa.repository.JpaRepository;


public interface UsuarioRepository extends JpaRepository<Usuario, Integer>  {
    Usuario findByTelegramId(int telegramId);

    MutablePropertyValues findById(Integer id);

    Usuario save(Usuario person);
}