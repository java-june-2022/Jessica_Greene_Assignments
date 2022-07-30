<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. --> 
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- Formatting (dates) --> 
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Tacos</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/jquery/jquery.min.js"></script>
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<div class="d-flex justify-content-between">
			<h1 class="text-primary">Expense Details</h1>
			<a href="/expenses">Go back</a>
		</div>
		<table class="table table-borderless">
			<tr>
				<td>Expense Name:</td>
				<td><c:out value="${expense.name}"/></td>
			</tr>
			<tr>
				<td>Expense Description:</td>
				<td><c:out value="${expense.description}"/></td>
			</tr>
			<tr>
				<td>Vendor:</td>
				<td><c:out value="${expense.vendor}"/></td>
			</tr>
			<tr>
				<td>Amount Spent:</td>
				<td>						
					<fmt:setLocale value = "en_US"/>									<!-- jsp money formatter -->
         			<fmt:formatNumber value = "${expense.amount}" type = "currency"/>
         		</td>
			</tr>
		</table>
	</div>
   
</body>
</html>