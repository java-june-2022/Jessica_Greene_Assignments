<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Simple Receipt</title>
</head>
<body>
	<h1>Customer Name: <c:out value="${customerName}"/></h1>
	<h2>Item name: <c:out value="${itemName}"/></h2>
	<h2>Price: $<c:out value="${price}"/></h2>
	<h2>Description: <c:out value="${description}"/></h2>
	<h2>Vendor: <c:out value="${vendor}"/></h2>
	
</body>
</html>