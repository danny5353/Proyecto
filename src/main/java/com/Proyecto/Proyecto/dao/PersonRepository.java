package com.Proyecto.Proyecto.dao;


import com.Proyecto.Proyecto.domain.Usuario;
import com.Proyecto.Proyecto.domain.Usuario_;
import com.Proyecto.Proyecto.repository.JpaRepository;

import java.util.List;


public interface PersonRepository extends JpaRepository<Usuario,Integer> {

    List<Usuario> findAllByStatus(int status);
}
