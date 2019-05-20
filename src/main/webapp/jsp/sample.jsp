<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Hello JSP</h1>
	
	<%-- Exception - <%= System.out.println() %> --%>
	
	Current time - <%=new Date()%><br>
	
	<%= request %><br>
	
	<%= request.getParameter("title") %><br>
	
	<%= request.getRemoteHost() %><br>
	
	<%! private int accesCount = 0; %>
	<%= ++accesCount %><br>
	
	<% 
		String queryData = request.getQueryString();
		out.println("request data: " + queryData);
	%><br>

</body>
</html>