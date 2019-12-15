package com.Proyecto.Proyecto.bl;

import com.Proyecto.Proyecto.domain.Ubicacion;
import com.Proyecto.Proyecto.domain.Usuario;
import com.Proyecto.Proyecto.dao.UsuarioRepository;
import com.Proyecto.Proyecto.dto.Status;
import com.Proyecto.Proyecto.dto.UbicacionDto;
import com.Proyecto.Proyecto.dto.UsuarioDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.objects.Update;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service

public class UsuarioBl {
    UsuarioRepository usuarioRepository;
    @Autowired
    public UsuarioBl(UsuarioRepository usuarioRepository) {

        this.usuarioRepository = usuarioRepository;
    }

    public UsuarioBl() {

    }

   /* public Usuario findByTelegramId(Update update){
        Usuario usuario=usuarioRepository.findByTelegramId(update.getMessage().getFrom().getId());
        return Usuario;
    }
*/
    public Usuario findByPersonId(Integer id){
        return usuarioRepository.findById(id).get();
    }
    public Usuario create(Usuario usuario) {

        return usuarioRepository.save(usuario);
    }


}