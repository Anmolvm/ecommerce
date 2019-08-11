<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c"%>     
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link type="text/css" rel="stylesheet" href="./styles/product.css">
</head>
<body>

<table>
<c:forEach var = "product" items = "${products}">
<tr>
<td>${product.productId}</td>
<td>${product.name}</td>
<td>${product.dop}</td>
<td>${product.cost}</td>
<td>${product.inStock}</td>
</tr>
</c:forEach>
</table>


</body>
</html>