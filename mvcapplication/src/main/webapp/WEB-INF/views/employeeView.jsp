<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <h2>Submitted Employee Information</h2>
    <table>
        <tr>
            <td>Name :</td>
            <td>${name}</td>
        </tr>
        <tr>
            <td>ID :</td>
            <td>${id}</td>
        </tr>
        <tr>
            <td>Department :</td>
            <td>${dept}</td>
        </tr>
    </table>
    
     <table>
        <tr>
            <td>Name :</td>
            <td>${employee.name}</td>
        </tr>
        <tr>
            <td>ID :</td>
            <td>${employee.id}</td>
        </tr>
        <tr>
            <td>Department :</td>
            <td>${employee.dept}</td>
        </tr>
    </table>
</body>
</html>