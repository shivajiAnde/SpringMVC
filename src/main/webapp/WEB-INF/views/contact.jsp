<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration</title>
</head>
<body>
	<form action="processing" method="post">
		<h1>${Name }</h1>
		<p>${small }</p>
		<pre>
		userName <input type="text" name="name" placeholder="Enter Name">
		Email <input type="email" name="email" placeholder="Enter Email">
		Password <input type="password" name="password" placeholder="Enter Password">
		<input type="submit" text-center> 
		</pre>	
	</form>

</body>
</html>