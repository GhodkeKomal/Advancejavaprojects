<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
Home Page

<a href="home.jsp">Home</a>
<a href="service.jsp">Service</a>
<a href="about.jsp">About</a>
<a href="singin.jsp">Logout</a>

<form action="contact" method="post"></form>
name <input type="text" name="name">
adress <input type="text" name="address">
email <input type="text" name="email">
mobile <input type="text" name="mobile">

<input type="submit">
<input type="reset">
</body>
</html>