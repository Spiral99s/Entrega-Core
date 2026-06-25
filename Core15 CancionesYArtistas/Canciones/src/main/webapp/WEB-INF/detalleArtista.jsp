<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*, java.text.*" %> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Detalle Artista</title>
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
			<h2>${artista.nombreArtistico}</h2>
			<h3>Nombre Real: ${artista.nombre} ${artista.apellido}</h3>
		</div>
		
        <hr class="divisor">
        
		<p><strong>Biografía:</strong> <br> ${artista.biografia}</p>
		<p><strong>Fecha Creación:</strong> ${artista.fechaCreacion}</p>
		<p><strong>Fecha Actualización:</strong> ${artista.fechaActualizacion}</p>
		
        <hr class="divisor">
        
		<h3>Lista de Canciones</h3>
		
        <ul class="lista">
		    <c:forEach var="cancion" items="${artista.canciones}">
		        <li>
		            <a href="/canciones/detalle/${cancion.id}">${cancion.titulo}</a>
		        </li>
		    </c:forEach>	
		</ul>
	</div>
	
    <a href="/artistas" class="creacion">Volver a lista de Artistas</a>
	
	<script src="/js/script.js"></script>
</body>
</html>