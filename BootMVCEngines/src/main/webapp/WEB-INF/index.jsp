<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<body>
	<h2>Search engine by id:</h2>
	<form action="getJdmEngines.do" method="GET">
	  Engine Id: <input type="text" name="Id" />
	  <input type="submit" value="Show Engines" /><br>
	 <h2>Update Engine:</h2>
	 <form action="" method="GET">
	 Engine Name: <input type="text" name="name" /><br>
	 Engine Size: <input type="text" name="size" /><br>
	 Number of Cylinders: <input type="text" name="cylinders" /><br>
	 Engine Power: <input type="text" name="power" /><br>
	 Engine Unit of Power: <input type="text" name="unit" />
	<input type="submit" value="Update Engine"/>
	</form>
	
	
	<br>
	

	
	</form>
</body>
</html>