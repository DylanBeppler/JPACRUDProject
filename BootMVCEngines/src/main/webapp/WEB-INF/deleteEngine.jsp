<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
    <title>Engine Deletion</title>
</head>
<body>
    <h2>Engine Deletion Status</h2>
    <c:choose>
        <c:when test="${isDeleted}">
            <p>Engine with ID ${engineId} has been successfully deleted.</p>
        </c:when>
        <c:otherwise>
            <p>Engine with ID ${engineId} could not be deleted or was not found.</p>
        </c:otherwise>
    </c:choose>

</body>
</html>