<%@page import="by.itacademy.java.yaskelevich.home.practic7.datalayer.db.ModelDBDaoImpl"%>
<%@page import="java.util.List"%>
<%@page import="by.itacademy.java.yaskelevich.home.practic7.datalayer.entity.Model"%>
<%@page import="by.itacademy.java.yaskelevich.home.practic7.datalayer.IDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@include file="/practic7/menu.jsp"%>
	<h1>Models page</h1>

	<%!IDao<Model, List<Model>> dao = ModelDBDaoImpl.getInstance();%>

	<%
		Integer brandId = Integer.valueOf(request.getParameter("brandId"));
	    List<Model> models = dao.find(brandId);
	    request.setAttribute("models", models);
	%>

	<table border="2" cellpadding="2" align="center">
		<tr>
			<th>ID</th>
			<th>NAME</th>
			<th>CREATED</th>
			<th>UPDATED</th>
			<th>BRAND_ID</th>
			<th>CARS</th>
		</tr>

		<c:forEach items="${models}" var="item">
			<tr>
				<td>${item.id}</td>
				<td>${item.name}</td>
				<td>${item.created}</td>
				<td>${item.updated}</td>
				<td>${item.brandId}</td>
				<td>
					<a href="/practic7/search/cars.jsp?modelId=${item.id}">cars</a> 
			</tr>
		</c:forEach>
	</table>
</body>
</html>