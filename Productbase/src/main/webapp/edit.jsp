<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit product</title>
</head>
<body>
<form:form action = "update" modelAttribute="product">
product id:<form:input path="id" readonly="true"/> <br>
product name:<form:input path="name"/> <br>
product price:<form:input path="price"/> <br>
product description:<form:input path="descreption"/> <br>
<input type="submit">
</form:form>
</body>
</html>