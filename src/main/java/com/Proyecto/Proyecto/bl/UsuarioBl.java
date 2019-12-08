package com.Proyecto.Proyecto.bl;

import com.Proyecto.Proyecto.domain.Usuario;
import com.Proyecto.Proyecto.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.objects.Update;

import java.util.List;

@Service

public class UsuarioBl {

    UsuarioRepository repository;
    @Autowired
    public UsuarioBl(UsuarioRepository repository) {

        this.repository = repository;
    }

    public UsuarioBl() {

    }

    public Usuario findByTelegramId(Update update){
        Usuario usuario = repository.findByTelegramId(update.getMessage().getFrom().getId());
        return usuario;
    }

    public Usuario findByPersonId(Integer id){
        return repository.findById(id).get();
    }
    public Usuario create(Usuario person) {

        return repository.save(person);
    }
}