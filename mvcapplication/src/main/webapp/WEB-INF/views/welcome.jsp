<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome to employee App</title>
</head>
<body>
	Employee Management System 
	<form:form method="GET" action="/mvcapplication/employee" >
    <input type="submit" name="employee" value ="Add Employee" /> 
    <input type="submit" name="cancel" value ="Cancel" />
	</form:form>
</body>
</html>


