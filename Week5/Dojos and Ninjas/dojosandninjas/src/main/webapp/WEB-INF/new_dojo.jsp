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
    <title>New Dojo</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/jquery/jquery.min.js"></script>
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<div class="d-flex">
			<h1>New Dojo</h1>
			<a href="/dojos">Home</a>
		</div>
		<form:form action="/dojos" method="post" modelAttribute="dojo">
			<div><form:errors path="name" class="text-danger"/></div>
			<div class="row g-3 w-75">
				<form:label path="name" class="col-md-2">Name: </form:label>
				<form:input path="name" class="col-md-4"/>
			</div>
			<input type="submit" value="Create" class="btn btn-primary" />
		</form:form>
	</div>
</body>
</html>