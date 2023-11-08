<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@page isELIgnored="false" %> 
   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Information</title>
</head>
<body>
	<h1>${Name }</h1>
	<p>${small }</p>
	
	<h1>${userId }</h1>
	<hr>
	<h1>welcome: ${user.name }</h1>
	<h1>your email id is: ${user.email }</h1>
	<h1>your password is: ${user.password } be secure ur password</h1>
</body>
</html>