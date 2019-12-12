package com.Proyecto.Proyecto.dao;

//import org.springframework.beans.MutablePropertyValues;
import com.Proyecto.Proyecto.domain.Usuario;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
//import org.springframework.data.jpa.repository.JpaRepository;


public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

   /* Usuario findByTelegramId(int telegramId);
    Usuario save(Usuario person);*/
   List<Usuario> findByTelegramId(int telegramId);
   //List<Usuario> findAllByStatus(int status);
  //  Usuario findByTelegramId(Integer id);
}
