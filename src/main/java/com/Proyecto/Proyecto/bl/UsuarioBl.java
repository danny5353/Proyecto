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
    UsuarioRepository UsuarioRepository;

    @Autowired
    public UsuarioBl(UsuarioRepository UsuarioRepository) {
        this.UsuarioRepository = UsuarioRepository;
    }

    public Usuario findPersonById(Integer pk) {
        Optional<Usuario> optional = this.UsuarioRepository.findById(pk);
        if (optional.isPresent()) {
            return optional.get();
        } else {
            // Otra alternativa podría ser: crear una nueva persona con valores por defecto y retornar este nuevo objeto
            throw new RuntimeException("Record cannot found for Usuario with ID: " + pk);
        }
    }

    public List<UsuarioDto> findAllPeople() {
        List<UsuarioDto> personDtoList = new ArrayList<>();
        for (Usuario Usuario:UsuarioRepository.findAllByStatus(Status.ACTIVE.getStatus())) {
            personDtoList.add(new UsuarioDto(Usuario));
        }
        return personDtoList;
    }

   /* UsuarioRepository repository;
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
        return (Usuario) repository.findById(id).get();
    }
    public Usuario create(Usuario person) {

        return repository.save(person);
    }*/


}