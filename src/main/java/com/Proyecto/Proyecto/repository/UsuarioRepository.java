package com.Proyecto.Proyecto.repository;

import com.Proyecto.Proyecto.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
import java.util.List;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>  {
    Usuario findByTelegramId(int telegramId);

}