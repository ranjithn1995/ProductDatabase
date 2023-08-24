<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored = "false"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>all products</title>
</head>
<body>
<table border="2px">
<tr>
<th>Id</th>
<th>Name</th>
<th>Descreption</th>
<th>Price</th>
<th>Delete</th>
<th>Edit</th>
</tr>


<c:forEach var="emp" items="${products}">

<tr>
<td>${emp.id}</td>
<td>${emp.name}</td>
<td>${emp.descreption}</td>
<td>${emp.price}</td>
<td> <a href="delete?id=${emp.id}">Delete</a></td>
<td> <a href="edit?id=${emp.id}">Edit</a></td>


</tr>






</c:forEach>



</table>

</body>
</html>