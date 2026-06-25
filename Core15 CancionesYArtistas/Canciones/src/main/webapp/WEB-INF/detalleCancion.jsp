<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*, java.text.*" %> 

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Detalle Canción</title>
	<link rel="stylesheet" href="/css/styles.css">
</head>
<body>
    <nav class="navbar">
    	<div class="logo">
        	<h1>Música</h1>
        </div>
        <div class="barra">
        	<ul class="nav-links">
            	<li><a href="/canciones">Canciones</a></li>
                <li><a href="/artistas">Artistas</a></li>
        	</ul>
     	</div>
     </nav> 
     
    <div class="contenedor-detalle">
		<div>
            <h2>${cancion.titulo}</h2>
			<h3>Artista: ${cancion.artista.nombreArtistico}</h3>
			<h4>Álbum: ${cancion.album}</h4>
		</div>
		
        <hr class="divisor">
        
		<p><strong>Género:</strong> ${cancion.genero}</p>
		<p><strong>Idioma:</strong> ${cancion.idioma}</p>
		<p><strong>Fecha Creación:</strong> ${cancion.fechaCreacion}</p>
		<p><strong>Fecha Actualización:</strong> ${cancion.fechaActualizacion}</p>
	</div>
	
    <a href="/canciones/formulario/editar/${cancion.id}" class="creacion">Editar Canción</a>
	
	<form action="/canciones/eliminar/${cancion.id}" method="POST" class="form-eliminar">
	    <input type="hidden" name="_method" value="DELETE" />
	    <button type="submit" class="btn-eliminar" data-nombre="${cancion.titulo}">Eliminar Canción</button>
	</form>
	
	<a href="/canciones" class="creacion">Volver a lista de Canciones</a>
	
	<script src="/js/script.js"></script>
</body>
</html>