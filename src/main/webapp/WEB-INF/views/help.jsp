<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>HELP Page</title>
</head>
<body>
	
	<%
	/* 	String name=(String)request.getAttribute("name");
		Integer roll=(Integer)request.getAttribute("rollNo");
		LocalDateTime time=(LocalDateTime)request.getAttribute("dateAndTime"); */
	%>
	
	<!-- using Expression Language to get and print the data -->
	<h1>Name of the student is: ${name }</h1>
	<h1>rollNo of the student is:${rollNo } </h1>
	<h1>Today date and time is: ${dateAndTime}</h1>
	
	<hr>
	
	 <c:forEach var="item" items="${list }">
	 	<%-- <h1>${item }</h1> --%>
	 	<h1><c:out value="${item }"></c:out></h1>
	 </c:forEach>
	
</body>
</html>