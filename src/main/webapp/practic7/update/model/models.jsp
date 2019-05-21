<%@page import="by.itacademy.java.yaskelevich.home.practic7.datalayer.db.ModelDBDaoImpl"%>
<%@page import="java.util.List"%>
<%@page import="by.itacademy.java.yaskelevich.home.practic7.datalayer.entity.Model"%>
<%@page import="by.itacademy.java.yaskelevich.home.practic7.datalayer.IDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%-- <%@include file="/practic7/menu.jsp"%> --%>
	<jsp:include page="/practic7/menu.jsp"></jsp:include>
	<h1>Models page</h1>

	<%!IDao<Model, List<Model>> dao = ModelDBDaoImpl.getInstance();%>

	<%
	    List<Model> models = dao.getAll();
	    request.setAttribute("models", models);
	%>

	<table border="ipx solid balck" cellpadding="0">
		<tr>
			<th>ID</th>
			<th>NAME</th>
			<th>CREATED</th>
			<th>UPDATED</th>
			<th>BRAND_ID</th>
			<th>ACTIONS</th>
		</tr>

		<c:forEach items="${models}" var="item">
			<tr>
				<td>${item.id}</td>
				<td>${item.name}</td>
				<td>${item.created}</td>
				<td>${item.updated}</td>
				<td>${item.brandId}</td>
				<td>
					<a href="/practic7/update/model/model-edit.jsp?id=${item.id}">edit | </a> 
					<a href="/servlet/models?action=delete&id=${item.id}">delete</a></td>
			</tr>
		</c:forEach>

	</table>
	<a href="/practic7/update/model/model-edit.jsp">ADD</a>
</body>
</html>