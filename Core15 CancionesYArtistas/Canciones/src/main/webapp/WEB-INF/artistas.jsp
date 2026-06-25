<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*, java.text.*" %> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Lista de Artistas</title>
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

    <h2>Artistas</h2>

    <table>
		<thead>
			<tr>
		    	<th>Nombre Artístico</th>
		    	<th>Nombre Real</th>
		    	<th>Detalle</th>
		    </tr>
		</thead>
		<tbody>
		    <c:forEach items="${artistas}" var="unArtista">
		    <tr>
		        <td>${unArtista.nombreArtistico}</td>
		        <td>${unArtista.nombre} ${unArtista.apellido}</td>
		        <td>
		            <a href="/artistas/detalle/${unArtista.id}">Ver Perfil</a>
		        </td>
		    </tr>
		    </c:forEach>
		</tbody>
	 </table>
	 
     <a href="/artistas/formulario/agregar" class="creacion">Registrar Artista</a> 
	
	<script src="/js/script.js"></script>
</body>
</html>
