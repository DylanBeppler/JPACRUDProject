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
	  <input type="submit" value="Show Engine" /><br>
	</form>
	 	<h2>Delete engine by id:</h2>
	<form action="deleteEngine.do" method="GET">
	  Engine Id: <input type="number" name="id" />
	  <input type="submit" value="Delete Engine" /><br>
	</form>
	 
	 <h2>Display All Engines</h2>
	 <form action="displayAllEngines.do" method="GET">
	 <input type="submit" value="Display Engines" />
	</form><br>
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
	 <h2>Add New Engine:</h2>
	 <form action="addEngine.do" method="POST">
	 Engine Name: <input type="text" name="name" required/><br>
	 Engine Size: <input type="number" name="size" required/><br>
	 Number of Cylinders: <input type="number" name="cylinders" required/><br>
	 Engine Power: <input type="number" name="power" required/><br>
	 Engine Unit of Power: <input type="text" name="unit" required/><br>
	<input type="submit" value="Add Engine"/>
	</form>
	
	<br>
	
  
	
</body>
</html>