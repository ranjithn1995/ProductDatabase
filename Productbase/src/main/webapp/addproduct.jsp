<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action = "saveproduct" modelAttribute="product">
product name:<form:input path="name"/> <br>
product price:<form:input path="price"/> <br>
product description:<form:input path="descreption"/> <br>
<input type="submit">
</form:form>
</body>
</html>