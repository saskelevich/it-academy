<%@page import="by.itacademy.java.yaskelevich.home.practic7.datalayer.db.ModelDBDaoImpl"%>
<%@page import="java.util.List"%>
<%@page import="by.itacademy.java.yaskelevich.home.practic7.datalayer.entity.Model"%>
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

<%!IDao<Model, List<Model>> dao = ModelDBDaoImpl.getInstance();%>

<%
    String id = request.getParameter("id");
    if (id != null && id != "") {
    	Model model = dao.get(Integer.valueOf(id));
        request.setAttribute("idValue", model.getId());
        request.setAttribute("nameValue", model.getName());
        request.setAttribute("brandId", model.getBrandId());
    }
%>

<form action="/servlet/models" method="post">
	<input type="hidden" name="id" value="${idValue}">
	<table>
		<tr>
			<td>NAME</td>
			<td><input type="text" name="name" title="name" value="${nameValue}"></td>
			<td><input type="text" name="brandId" title="brandId" value="${brandId}"></td>
		</tr>
	</table>
	<input type="submit" value="SAVE">
</form>
</body>
</html>