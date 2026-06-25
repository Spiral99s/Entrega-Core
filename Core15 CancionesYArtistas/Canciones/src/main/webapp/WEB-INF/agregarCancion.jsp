<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*, java.text.*" %> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Agregar Canciones</title>
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
	<h1>Agregar Canción</h1>
	<form:form action="/canciones/procesa/agregar" method="POST" modelAttribute="cancion">
	
		<form:label path="titulo">Título:</form:label>
		<form:input type="text" path="titulo"/>
		<form:errors path="titulo"/>
		<br>
		
		<label for="idArtista">Artista:</label>
		<select id="idArtista" name="idArtista" required>
		    <option value="" disabled selected>Selecciona un artista</option>
		    <c:forEach items="${listaArtistas}" var="unArtista">
		        <option value="${unArtista.id}">${unArtista.nombreArtistico}</option>
		    </c:forEach>
		</select>
		<form:errors path="artista" cssStyle="color: red;"/>
		<br>
		
		<form:label path="album">Album:</form:label>
		<form:input type="text" path="album"/>
		<form:errors path="album"/>
		<br>
		
		<form:label path="genero">Género:</form:label>
		<form:input type="text" path="genero"/>
		<form:errors path="genero"/>
		<br>
		
		<form:label path="idioma">Idioma:</form:label>
		<form:input type="text" path="idioma"/>
		<form:errors path="idioma"/>
		<br>
		
		<input type="submit" class="btn-submit" value="Crear Canción">
		
	</form:form>
	<br>
	<a href="/canciones">Volver</a>
</body>
</html>