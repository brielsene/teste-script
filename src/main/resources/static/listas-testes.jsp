<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Lista de Testes</title>
</head>
<body>
    <h1>Lista de Testes</h1>
    <table border="1">
        <thead>
            <tr>
                <th>ID</th>
                <th>Nome</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="teste" items="${testes}">
                <tr>
                    <td>${teste.id}</td>
                    <td>${teste.nome}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>