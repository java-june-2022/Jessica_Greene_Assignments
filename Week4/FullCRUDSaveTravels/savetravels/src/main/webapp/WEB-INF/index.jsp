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
    <title>Read Share</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/jquery/jquery.min.js"></script>
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>

 	<div class="container">
		<h1 class="text-primary">Save Travels</h1>
		<table class="table table-striped table-bordered mb-5">
			<tr>
				<th scope="col" class="text-center">Expense</th>
				<th scope="col" class="text-center">Vendor</th>
				<th scope="col" class="text-center">Amount</th>
				<th scope="col" class="text-center">Actions</th>
			</tr>
			<c:forEach items="${expenses}" var="expense">
				<tr>
					<td class="text-center"><c:out value="${expense.name}"/></td>
					<td class="text-center"><c:out value="${expense.vendor}"/></td>
					<td class="text-center">
						<fmt:setLocale value = "en_US"/>
         				<fmt:formatNumber value = "${expense.amount}" type = "currency"/>
         			</td>
         			<td class="text-center">
         				<a href="/expenses/edit/${expense.id}">edit</a>
         			</td>
				</tr>
			</c:forEach>
		</table>

		<form:form action="/expenses" method="post" modelAttribute="expense">
			<div class="w-50 mb-3 mx-auto">
				<h2 class="text-primary">Add an expense:</h2>
				<ul class="list-unstyled">
					<li ><form:errors path="name" class="text-danger"/></li>
					<li ><form:errors path="vendor" class="text-danger"/></li>
					<li ><form:errors path="amount" class="text-danger"/></li>
					<li ><form:errors path="description" class="text-danger"/></li>
				</ul>
			</div>
			<div class="w-50 mb-3 mx-auto d-flex justify-content-between">
				<form:label path="name">Expense Name</form:label>
				<form:input path="name"/>
			</div>
			<div class="w-50 mb-3 mx-auto d-flex justify-content-between">
				<form:label path="vendor">Vendor</form:label>
				<form:input path="vendor"/>
			</div>
			<div class="w-50 mb-3 mx-auto d-flex justify-content-between">
				<form:label path="amount">Amount</form:label>
				<form:input type="number" step="0.01" path="amount"/>
			</div>
			<div class="w-50 mb-3 mx-auto d-flex justify-content-between">
				<form:label path="description">Description</form:label>
				<form:textarea path="description"/>
			</div>
			<div class="w-50 mb-3 mx-auto d-flex justify-content-end">
				<input type="submit" value="Submit" />
			</div>
		</form:form>
		
		
<%--		
		<form action="/expenses" method="post">
			<h2>Add an expense:</h2>
			<div class="mb-3">
				<label>Expense Name
					<input type="text" name="name" class="form-control"/>
				</label>
			</div>
			<div class="mb-3">
				<label>Vendor
					<input type="text" name="vendor" class="form-control"/>
				</label>
			</div>
			<div class="mb-3">
				<label>Amount
					<input type="number" step="0.01" name="amount" class="form-control"/>
				</label>
			</div>
			<div class="mb-3">
				<label>Description
					<input type="text" name="description" class="form-control"/>
				</label>
			</div>
			<input type="submit" value="Submit"/>
		</form>
--%>
	</div>
</body>
</html>