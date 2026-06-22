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
	<div id="detalle">
		<div>
			<h1>${cancion.titulo}</h1>
			<h3>Artista: ${cancion.artista}</h3>
			<h4>Album: ${cancion.album}</h4>
		</div>
		<p>Género: ${cancion.genero}</p>
		<p>Idioma: ${cancion.idioma}</p>
		<p>Fecha Creación: ${cancion.fechaCreacion}</p>
		<p>Fecha Actualización: ${cancion.fechaActualizacion}</p>
		<a href="/canciones">Volver</a>
	</div>
	
</body>
</html>