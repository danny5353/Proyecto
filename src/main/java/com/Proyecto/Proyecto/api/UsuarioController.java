package com.Proyecto.Proyecto.api;

import com.Proyecto.Proyecto.bl.UsuarioBl;
import com.Proyecto.Proyecto.dto.UsuarioDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/usuario")
public class UsuarioController {
    private UsuarioBl usuarioBl;

    @Autowired
    public UsuarioController(UsuarioBl usuarioBl){this.usuarioBl = usuarioBl;}

    @RequestMapping(value = "/", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    List<UsuarioDto>all(){return usuarioBl.findAllPeople();}
}
