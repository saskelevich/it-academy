<%@page import="by.itacademy.java.yaskelevich.home.practic7.datalayer.db.CarDBDaoImpl"%>
<%@page import="java.util.List"%>
<%@page import="by.itacademy.java.yaskelevich.home.practic7.datalayer.entity.Car"%>
<%@page import="by.itacademy.java.yaskelevich.home.practic7.datalayer.IDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@include file="/practic7/menu.jsp"%>
<h1>Brands page</h1>

<%!IDao<Car, List<Car>> dao = CarDBDaoImpl.getInstance();%>

<%
    String id = request.getParameter("id");
    if (id != null && id != "") {
    	Car car = dao.get(Integer.valueOf(id));
        request.setAttribute("idValue", car.getId());
        request.setAttribute("vin", car.getVin());
        request.setAttribute("modelId", car.getModelId());
    }
%>

<form action="/servlet/cars" method="post">
	<input type="hidden" name="id" value="${idValue}">
	<table>
		<tr>
			<td>NAME</td>
			<td><input type="text" name="vin" title="vin" value="${vin}"></td>
			<td><input type="text" name="modelId" title="modelId" value="${modelId}"></td>
		</tr>
	</table>
	<input type="submit" value="SAVE">
</body>
</html>