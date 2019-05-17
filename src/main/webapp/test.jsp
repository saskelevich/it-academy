<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="#666">
	<h1>Test JSP</h1>
	
	<table border="1px">
		<tr>
			<th>Key</th>
			<th>Value</th>
		</tr>
		
		<c:forEach var="mapa" items="${ map }">
			<tr>
				<td>
					<c:out value="${mapa.key}"/>
				</td>
				<td>
					<c:out value="${mapa.value}"/>
				</td>
			</tr>
		</c:forEach>
	</table>
	
</body>
</html>