<%@page import="by.itacademy.java.yaskelevich.home.practic7.datalayer.db.CarDBDaoImpl"%>
<%@page import="java.util.List"%>
<%@page import="by.itacademy.java.yaskelevich.home.practic7.datalayer.entity.Car"%>
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

	<%!IDao<Car, List<Car>> dao = CarDBDaoImpl.getInstance();%>

	<%
		Integer modelId = Integer.valueOf(request.getParameter("modelId"));
	    List<Car> cars = dao.find(modelId);
	    request.setAttribute("cars", cars);
	%>

	<table border="ipx solid balck" cellpadding="0">
		<tr>
			<th>ID</th>
			<th>VIN</th>
			<th>CREATED</th>
			<th>UPDATED</th>
			<th>MODEL_ID</th>
		</tr>

		<c:forEach items="${cars}" var="item">
			<tr>
				<td>${item.id}</td>
				<td>${item.vin}</td>
				<td>${item.created}</td>
				<td>${item.updated}</td>
				<td>${item.modelId}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>