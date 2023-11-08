<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>this is homePage</h1>
	<h1>this getting from home controller</h1>
	<%
		String name=(String)request.getAttribute("name");
		Integer id=(Integer)request.getAttribute("id");
		List<String> friends=(List)request.getAttribute("friends");
	%>
	
	<h1> <%= name %> </h1>
	<h1> <%= id %></h1>
	
	<% for(String s:friends) 
		{
	%>
	<h1> <%= s %></h1>
	<%
		}
	%>
</body>
</html>