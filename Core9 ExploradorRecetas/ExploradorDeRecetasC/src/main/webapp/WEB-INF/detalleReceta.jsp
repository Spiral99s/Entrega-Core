<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*, java.text.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="/css/styles.css">
    <title>Detalle de Receta</title>
</head>
<body>

   <c:if test="${not empty mensajeError}">
        <p>${mensajeError}</p>
    </c:if>

    <c:if test="${not empty nombre}">
        <div class="tarjeta-receta">
            <h1>${nombre}</h1>
            <hr>
            <h3>Ingredientes:</h3>
            
            <ul class="lista">
                <c:forEach items="${ingredientes}" var="ingrediente">
                    <li>${ingrediente}</li>
                </c:forEach>
            </ul>
        </div>
        
        <a href="/recetas">Volver a la lista de recetas</a>
    </c:if>

</body>
</html>