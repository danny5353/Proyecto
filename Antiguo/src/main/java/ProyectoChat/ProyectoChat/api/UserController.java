package ProyectoChat.ProyectoChat.api;

import ProyectoChat.ProyectoChat.dao.UserRepository;

import ProyectoChat.ProyectoChat.domain.Usuario;
import ProyectoChat.ProyectoChat.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.http.MediaType;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1/usuario")
public class UserController {

    private UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository){
        this.userRepository = userRepository;
    }


    @RequestMapping(value = "/",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)

    List<UserDto> all() {
        List<UserDto> userDtoList =new ArrayList<>();
        for(Usuario usuario:userRepository.findAll()){
            userDtoList.add(new UserDto(usuario));
        }
        return userDtoList;
    }




}
