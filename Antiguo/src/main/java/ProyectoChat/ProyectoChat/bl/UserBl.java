package ProyectoChat.ProyectoChat.bl;

import ProyectoChat.ProyectoChat.dao.UserRepository;
import ProyectoChat.ProyectoChat.domain.Usuario;
import ProyectoChat.ProyectoChat.dto.UserDto;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserBl {

    UserRepository userRepository;

    public UserBl(){
        userRepository = null;
    }

    @Autowired
    public UserBl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Usuario findPersonById(Integer pk) {
        Optional<Usuario> optional = this.userRepository.findById(pk);
        if (optional.isPresent()) {
            return optional.get();
        } else {
            throw new RuntimeException("Record cannot found for CpPerson with ID: " + pk);
        }
    }

    public Usuario findUserByTelegramUserId(Update update){
        Usuario usuario = userRepository.findByBotUserId(update.getMessage().getFrom().getId().toString());
        return usuario;
    }
}