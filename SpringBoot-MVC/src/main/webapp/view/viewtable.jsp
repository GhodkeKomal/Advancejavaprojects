<%@page import="java.util.List"%>
<%@page import="com.TKAkomal.SpringBoot.MVC.Student" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<center>
		<h1 style="background-color: rgb(255, 99, 71);">Student Table</h1>
	</center>
	<table>
		<tr>
			<th>id</th>
			<th>name</th>
	</tr>
		<%
		List<Student> list= (List<Student>)request.getAttribute("al");
		%>

		<%
		for (Student c1 : list) {
		%>
		<tr>
			<td>
				<%
				out.print(c1.getId());
				%>
			</td>
			<td>
				<%
				out.print(c1.getName());
				%>
			</td>
		</tr>

		<%
		}
		%>
</body>
</html>




<a href="viewtable">View Tables</a>
