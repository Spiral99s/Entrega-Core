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
	<h1>Agregar Artista</h1>
	<form:form action="/artistas/procesa/agregar" method="POST" modelAttribute="artista">
	
		<form:label path="nombreArtistico">Artista:</form:label>
		<form:input type="text" path="nombreArtistico"/>
		<form:errors path="nombreArtistico"/>
		<br>
	
		<form:label path="nombre">Nombre del Artista:</form:label>
		<form:input type="text" path="nombre"/>
		<form:errors path="nombre"/>
		<br>
				
		<form:label path="apellido">Apellido del Artista:</form:label>
		<form:input type="text" path="apellido"/>
		<form:errors path="apellido"/>
		<br>
		
		<form:label path="biografia">Biografía:</form:label>
		<form:textarea path="biografia" rows="4"/>
		<form:errors path="biografia"/>
		<br>
		
		
		<input type="submit" class="btn-submit" value="Crear Artista">
		
	</form:form>
	<br>
	<a href="/artistas">Volver</a>
</body>
</html>