<%@page import="java.util.List"%>
<%@page import="by.itacademy.java.yaskelevich.home.practic7.datalayer.db.BrandDBDaoImpl"%>
<%@page import="by.itacademy.java.yaskelevich.home.practic7.datalayer.entity.Brand"%>
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
<%-- <%@include file="/practic7/menu.jsp"%> --%>
<jsp:include page="/practic7/menu.jsp"></jsp:include>
	<h1>Brands page</h1>

	<%!IDao<Brand, Brand> dao = BrandDBDaoImpl.getInstance();%>

	<%
	    List<Brand> brands = dao.getAll();
	    request.setAttribute("brands", brands);
	%>

	<table border="ipx solid balck" cellpadding="0">
		<tr>
			<th>ID</th>
			<th>NAME</th>
			<th>CREATED</th>
			<th>UPDATED</th>
			<th>MODELS</th>
		</tr>

		<c:forEach items="${brands}" var="item">
			<tr>
				<td>${item.id}</td>
				<td>${item.name}</td>
				<td>${item.created}</td>
				<td>${item.updated}</td>
				<td>
					<a href="/practic7/search/models.jsp?brandId=${item.id}">models</a> 
			</tr>
		</c:forEach>
	</table>
</body>
</html>