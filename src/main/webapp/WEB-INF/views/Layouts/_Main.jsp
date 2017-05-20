<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>

<html>
<head>
	
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="CI Monitor">
    <meta name="author" content="Piyush Lashkari">
    
	<title><tiles:insertAttribute name="title" ignore="true" /></title>
	
	<!-- Set the icon for the browser tab -->
	<link type="image/x-icon" rel="shortcut icon" href="${pageContext.request.contextPath}/resources/images/tabIcon.png">
	
	<!-- Java Scripts -->
	<script src="${pageContext.request.contextPath}/resources/js/jquery-1.11.2.js"></script>
	<script src="${pageContext.request.contextPath}/resources/bootstrap/js/bootstrap.min.js"></script>
	<script src="${pageContext.request.contextPath}/resources/bootstrap/js/bootstrap-modal.js"></script>
	
	<!-- CSS -->
	<link href="${pageContext.request.contextPath}/resources/bootstrap/css/bootstrap.min.css" rel="stylesheet">
	

</head>

<body class="padTop53">
	<tiles:insertAttribute name="header" />
	<div class="container-fluid">
		<div style="padding: 10px 7px; text-align: center;">
			<tiles:insertAttribute name="body" />
		</div>
	</div>
	<tiles:insertAttribute name="footer" />
</body>
</html>