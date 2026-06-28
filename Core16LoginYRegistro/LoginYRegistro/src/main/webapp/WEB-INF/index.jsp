<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*, java.text.*" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login/Registro</title>
	<link rel="stylesheet" href="/css/styles.css">
</head>
<body>
	<div class="content">
		<form:form action="/procesa/registro" method="POST" modelAttribute="usuario">
			<h2>Registrarse</h2>
			<form:label path="nombreUsuario">Nombre de Usuario:</form:label>
			<form:input type="text" path="nombreUsuario" />
			<form:errors path="nombreUsuario" />
			
			<form:label path="password">Contraseña:</form:label>
			<form:input type="password" path="password" />
			<form:errors path="password" />
			
			<form:label path="confirmarPassword">Confirmar Contraseña:</form:label>
			<form:input type="password" path="confirmarPassword" />
			<form:errors path="confirmarPassword" />
			
			<form:label path="correo">Correo Electrónico:</form:label>
			<form:input type="text" path="correo" />
			<form:errors path="correo" />
			
			<form:label path="nombre">Nombre:</form:label>
			<form:input type="text" path="nombre" />
			<form:errors path="nombre" />
			
			<form:label path="apellido">Apellido:</form:label>
			<form:input type="text" path="apellido" />
			<form:errors path="apellido" />
			
			<form:label path="fechaDeNacimiento">Fecha de Nacimiento:</form:label>
			<form:input type="date" path="fechaDeNacimiento" />
			<form:errors path="fechaDeNacimiento" />
			
			<input type="submit" value="Registrarse" />
		</form:form>
		
		<form:form action="/procesa/login" method="POST" modelAttribute="usuarioLogin">
			<h2>Iniciar Sesión</h2>
			<form:label path="nombreUsuario">Usuario:</form:label>
			<form:input type="text" path="nombreUsuario" />
			<form:errors path="nombreUsuario" />
			
			<form:label path="password">Contraseña:</form:label>
			<form:input type="password" path="password" />
			<form:errors path="password" />
					
			<input type="submit" class="btn-submit" value="Iniciar Sesión">
		</form:form>
	</div>
</body>
</html>