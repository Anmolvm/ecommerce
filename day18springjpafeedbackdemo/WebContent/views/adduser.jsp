<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c"%>     
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link type="text/css" rel="stylesheet" href="./styles/user.css">
</head>
<body>
<section>
<form:form id="userForm" method="post" action="adduserdata" modelAttribute="user">
<fieldset>
<legend>User Information</legend>
<form:input type="number" path="mobileNo" placeholder="Mobile No" required="required"/>
<form:input type="text" path="name"  pattern="[a-zA-Z0-9]*" placeholder="User Name" required="required" />

<input type="submit" value="Add"/>
<input type="reset" value="Clear"/>
</fieldset>
</form:form>
</section>
</body>
</html>