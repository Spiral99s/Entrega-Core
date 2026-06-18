<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*, java.text.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Detalle de Libro</title>
</head>
<body>

<c:if test="${not empty mensajeError}">
    <p style="color: red;">${mensajeError}</p>
</c:if>

<c:if test="${not empty libro}">
    <h1>Libro: ${libro}</h1>
    <p>Autor: ${autor}</p>
</c:if>

<a href="/libros">Volver a la lista</a>

</body>
</html>