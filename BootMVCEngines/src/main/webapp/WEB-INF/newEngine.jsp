<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New Engine</title>
</head>
<body>
<a href="home.do">Home</a>
<h2>New Engine Created:</h2>
<h3>
Engine id: ${engine.id}<br>
Engine name: ${engine.name}<br>
Engine size: ${engine.size}<br>
Number of cylinders: ${engine.cylinders}<br>
Power: ${engine.power}
 ${engine.unit}<br>
</h3>
</body>
</html>