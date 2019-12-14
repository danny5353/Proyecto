package com.Proyecto.Proyecto.dao;

import org.springframework.data.jpa.repository.Query;
import com.Proyecto.Proyecto.domain.Ruta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RutaRepository extends JpaRepository<Ruta,Integer> {
    Ruta findByidRuta(int idRuta);
}
