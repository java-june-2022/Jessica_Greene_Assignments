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
    <title>Edit My Task</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/jquery/jquery.min.js"></script>
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
    	<div class="container">
    	<div class="header d-flex justify-content-between">
			<h1 class="text-success">Edit Expense </h1>
			<a href="/expenses">Go back</a>
    	</div>
		<form:form action="/expenses/${expense.id}" method="post" modelAttribute="expense">
			<input type="hidden" name="_method" value="put" />
			<div class="w-50 mb-3">
				<ul class="list-unstyled">
					<li ><form:errors path="name" class="text-danger"/></li>
					<li ><form:errors path="vendor" class="text-danger"/></li>
					<li ><form:errors path="amount" class="text-danger"/></li>
					<li ><form:errors path="description" class="text-danger"/></li>
				</ul>
			</div>
			<div class="row mb-3">
				<form:label path="name" class="col-form-label">Expense Name</form:label>
				<form:input path="name" class="form-control"/>
			</div>
			<div class="row mb-3">
				<form:label path="vendor" class="col-sm-2 col-form-label">Vendor</form:label>
				<form:input path="vendor" class="form-control"/>
			</div>
			<div class="row mb-3">
				<form:label path="amount" class="col-sm-2 col-form-label">Amount</form:label>
				<form:input type="number" step="0.01" path="amount" class="form-control"/>
			</div>
			<div class="row mb-3">
				<form:label path="description" class="col-sm-2 col-form-label">Description</form:label>
				<form:textarea path="description" class="form-control"/>
			</div>
			<div class="mb-3 d-flex justify-content-end">
				<input type="submit" value="Submit" />
			</div>
		</form:form>
	</div>
</body>
</html>