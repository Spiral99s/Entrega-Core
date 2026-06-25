package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Artista;
import com.example.demo.repositories.RepositorioArtistas;

@Service
public class ServicioArtistas {

	@Autowired
	private RepositorioArtistas repositorioArtistas;
	
	public List<Artista> obtenerTodosLosArtistas(){
		return this.repositorioArtistas.findAll();
	}
	
	public Artista obtenerArtistaPorId(Long id) {
		return this.repositorioArtistas.findById(id).orElse(null);
	}
	
	public Artista agregarArtista(Artista artistaNuevo) {
		return this.repositorioArtistas.save(artistaNuevo);
	}
}
