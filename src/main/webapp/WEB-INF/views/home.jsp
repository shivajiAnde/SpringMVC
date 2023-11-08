<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Search Page</title>
<link href="<c:url value="/resources/css/style.css"/>">
</head>
<body>
<img alt="my image" src="/resources/image/shivaji.jpeg">
<div class="one">
	<form action="search">
	<h1>search</h1>
	<input type="text" name="name" placeholder="Enter here">
	<input type="submit">
	</form>
</div>

</body>
</html>