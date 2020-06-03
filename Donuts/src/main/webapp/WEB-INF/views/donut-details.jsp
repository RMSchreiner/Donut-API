<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Donut-Details</title>
</head>
<body>

<h3>Type of Donut</h3>
<p>${name}</p>
<h4>Character of Donut</h4>
<c:forEach var="extras" items="${extras}"> 
 <a>${extras}</a> 
 <br>
</c:forEach> 
<h4>Number of Calories</h4>
<p>${calories}</p>
<img alt="${name}" src="${photo}" width="200">



</body>
</html>