<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c"%>     
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link type="text/css" rel="stylesheet" href="./styles/feedback.css">
</head>
<body>
<section>
<form id="feedbackForm" method="post" action="addfeedbackdata">
<fieldset>
<legend>User Information</legend>
<input type="number" name="rating" placeholder="Rating" required="required"/>
<select name="userId">
<c:forEach var = "user" items = "${users}">
<option value="${user.mobileNo}">${user.name}</option>
</c:forEach>
</select>
<input type="submit" value="Add"/>
<input type="reset" value="Clear"/>
</fieldset>
</form>
</section>
</body>
</html>