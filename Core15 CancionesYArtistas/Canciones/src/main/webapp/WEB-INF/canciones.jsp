<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*, java.text.*" %> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Canciones</title>
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
    <h2>Canciones</h2>
	<table>
		<thead>
			<tr>
		    	<th>Canción</th>
		    	<th>Artista</th>
		    	<th>Detalle</th>
		    </tr>
		</thead>
		<tbody>
		    <c:forEach items="${canciones}" var="cancion">
		    <tr>
		        <td>${cancion.titulo}</td>
				<td>${cancion.artista.nombreArtistico}</td>
		        <td>
		            <a href="/canciones/detalle/${cancion.id}">Detalles</a>
		        </td>
		    </tr>
		    </c:forEach>
		</tbody>
	 </table>
	 
	<a href="/canciones/formulario/agregar" class="creacion">Crear Canción</a> 
</body>
</html>