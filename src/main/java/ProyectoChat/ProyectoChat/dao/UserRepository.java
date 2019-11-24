package ProyectoChat.ProyectoChat.dao;

import ProyectoChat.ProyectoChat.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<Usuario, Integer> {

}