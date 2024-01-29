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
	</form>
	 <h2>Update Engine:</h2>
	 <form action="updateEngine.do" method="POST">
	 Engine Id: <input type="number" name="id" required/><br>
	 Engine Name: <input type="text" name="name" required/><br>
	 Engine Size: <input type="number" name="size" required/><br>
	 Number of Cylinders: <input type="number" name="cylinders" required/><br>
	 Engine Power: <input type="number" name="power" required/><br>
	 Engine Unit of Power: <input type="text" name="unit" required/><br>
	<input type="submit" value="Update Engine"/>
	</form>
	<br>
	 <h2>Create New Engine:</h2>
	 <form action="createNewEngine.do" method="POST">
	 Engine Name: <input type="text" name="name" required/><br>
	 Engine Size: <input type="number" name="size" required/><br>
	 Number of Cylinders: <input type="number" name="cylinders" required/><br>
	 Engine Power: <input type="number" name="power" required/><br>
	 Engine Unit of Power: <input type="text" name="unit" required/><br>
	<input type="submit" value="Update Engine"/>
	</form>
	
	<br>
	

	
</body>
</html>