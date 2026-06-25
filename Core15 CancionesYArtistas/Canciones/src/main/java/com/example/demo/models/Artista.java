package com.example.demo.models;

import java.time.LocalDate;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "artistas")
public class Artista {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull(message = "Este campo es obligatorio.")
	@Size(min = 5, message = "Debe contener mínimo 5 caracteres.")
	private String nombreArtistico;
	
	@NotNull(message = "Este campo es obligatorio.")
	@Size(min = 5, message = "Debe contener mínimo 5 caracteres.")
	private String nombre;
	
	@NotNull(message = "Este campo es obligatorio.")
	@Size(min = 3, message = "Debe contener mínimo 3 caracteres.")
	private String apellido;
	
	@NotNull(message = "Este campo es obligatorio.")
	@Size(min = 20, max = 400, message = "Debe contener mínimo 20 caracteres y máximo 400.")
	private String biografia;
	
	@Column(updatable = false)
	@DateTimeFormat(pattern="dd-MM-yyyy")
	private LocalDate fechaCreacion;
	

	@DateTimeFormat(pattern="dd-MM-yyyy")
	private LocalDate fechaActualizacion;
	
	@OneToMany(mappedBy = "artista",fetch = FetchType.LAZY)
	private List<Cancion> canciones;


	public Artista() {
		super();
	}
	


	public Artista(Long id,
				   String nombreArtistico,
				   String nombre,
				   String apellido,
				   String biografia,
				   LocalDate fechaCreacion, 	
				   LocalDate fechaActualizacion, 
				   List<Cancion> canciones) {
		super();
		this.id = id;
		this.nombreArtistico = nombreArtistico;
		this.nombre = nombre;
		this.apellido = apellido;
		this.biografia = biografia;
		this.fechaCreacion = fechaCreacion;
		this.fechaActualizacion = fechaActualizacion;
		this.canciones = canciones;
	}


	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	

	public String getNombreArtistico() {
		return nombreArtistico;
	}



	public void setNombreArtistico(String nombreArtistico) {
		this.nombreArtistico = nombreArtistico;
	}



	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getBiografia() {
		return biografia;
	}

	public void setBiografia(String biografia) {
		this.biografia = biografia;
	}

	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(LocalDate fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public LocalDate getFechaActualizacion() {
		return fechaActualizacion;
	}

	public void setFechaActualizacion(LocalDate fechaActualizacion) {
		this.fechaActualizacion = fechaActualizacion;
	}

	public List<Cancion> getCanciones() {
		return canciones;
	}

	public void setCanciones(List<Cancion> canciones) {
		this.canciones = canciones;
	}

	@PrePersist
    protected void onCreate() {
        this.fechaCreacion = LocalDate.now();
    }

    @PreUpdate
    protected void onUpdate() {
        this.fechaActualizacion = LocalDate.now();
    }



    @Override
    public String toString() {
        return "Artista [id=" + id + ", nombreArtistico=" + nombreArtistico + ", nombre=" + nombre 
                + ", apellido=" + apellido + ", biografia=" + biografia 
                + ", fechaCreacion=" + fechaCreacion + ", fechaActualizacion=" + fechaActualizacion + "]"; 
    }
	
    
	
	
	

}
