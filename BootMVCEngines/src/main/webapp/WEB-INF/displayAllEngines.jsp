<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Display All Engines</title>
</head>
<body>
<body>
  <a href="home.do">Home</a>
    <h2>All Engines</h2>
    <ul>
        <c:forEach var="engine" items="${engines}">
            <li>Id: ${engine.id} - Name: ${engine.name} - Size: ${engine.size} - Power: ${engine.power} ${engine.unit}</li>
        </c:forEach>
    </ul>
</body>
</html>