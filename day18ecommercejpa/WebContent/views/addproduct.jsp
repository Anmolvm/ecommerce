<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c"%>     
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link type="text/css" rel="stylesheet" href="./styles/product.css">
</head>
<body>
<section>
<a href="getproducts">List Products</a>

<form:form id="productForm" method="post" action="addproduct" modelAttribute="product">
<fieldset>
<legend>Product Information</legend>
<form:input type="number" path="productId" placeholder="Product Id" required="required"/>
<form:input type="text" path="name"  pattern="[a-zA-Z0-9]*" placeholder="Product Name" required="required" />
<form:input type="date" path="dop"  placeholder="DOP" required="required"/>
<form:input type="number" path="cost"  placeholder="Cost" required="required"/>
<form:input type="number" path="inStock" placeholder="In Stock" required="required"/>
<input type="submit" value="Add"/>
<input type="reset" value="Clear"/>
</fieldset>
</form:form>
</section>
</body>
</html>