package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Cancion;

@Repository
public interface RepositorioCanciones extends CrudRepository<Cancion, Long>{

	List<Cancion> findAll();
}
