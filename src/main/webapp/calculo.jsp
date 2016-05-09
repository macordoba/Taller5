<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="conceptosAvanzados.CalularIntegral" %>
<%@ page import="conceptosAvanzados.Operaciones" %>

<%
	CalularIntegral objetoPruebas = new CalularIntegral();
	objetoPruebas.setX(Double.parseDouble(request.getParameter("X")));
	objetoPruebas.setDof(Integer.parseInt(request.getParameter("Dof")));
	objetoPruebas.setNumSeg(Integer.parseInt(request.getParameter("NumSeg")));
	objetoPruebas.calcularp();
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
		<title>Taller 5</title>
	</head>
	<body>
		<div class="container">
			<h1 class="text-center">Taller 5</h1>
			<p class="text-center h3">
				Resultado: <%= objetoPruebas.getP() %>
			</p>
			<input type="button" value="Regresar" class="btn btn-default" onclick="history.back()">
		</div>
	</body>
</html>