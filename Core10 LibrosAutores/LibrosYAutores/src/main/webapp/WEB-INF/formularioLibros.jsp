<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*, java.text.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Formulario de Libros</title>
</head>
<body>

	<h1>Agregar Libro</h1>
	<form action="/procesa/libro" method="POST">
		<label for="nombreLibro">Nombre:</label>
		<input type="text" name="nombreLibro">
		
		<label for="autor">Autor:</label>
		<input type="text" name="autor">
		
		<input type="submit" value="Crear Libro">
	</form>
	<a href="/libros">Volver</a>
	
</body>
</html>