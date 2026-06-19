<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*, java.text.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="/css/styles.css">
    <title>Recetas</title>
</head>
<body>

	<h1>Lista de Recetas</h1>
	<table border="1">
	        <thead>
	            <tr>
	                <th>Receta</th>
	            </tr>
	        </thead>
	        <tbody>
	            <c:forEach items="${recetasConIngredientes}" var="entrada">
	                <tr>
	                    <td>
	                        <a href="/recetas/${entrada.key}">${entrada.key}</a>
	                    </td>
	                </tr>
	            </c:forEach>
	        </tbody>
	   </table>
	
</body>
</html>