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
    <title>Dojos and Ninjas</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/jquery/jquery.min.js"></script>
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
   <div class="container">
   		<h1 class="text-center">Welcome to Dojos and Ninjas</h1>
   		<div class="row justify-content-between">
   			<div class="bg-light p-3 col-md-5">
   				<div class="d-flex justify-content-between">
		   			<h2>Dojos</h2>
					<a href="/dojos/new" class="btn btn-primary"> Add New Dojo</a>
   				</div>
				<c:forEach items="${dojos}" var="dojo">
					<a href="/dojos/${dojo.id}" class="d-block"> <c:out value="${dojo.name}" /></a>
				</c:forEach>
			</div>
   			<div class="bg-light p-3 col-md-5">
   				<div class="d-flex justify-content-between">
	   				<h2>Ninjas</h2>	
	   				<a href="/ninjas/new" class="btn btn-primary"> Add New Ninja</a>
   				</div>
   				<c:forEach items="${ninjas}" var="ninja">
   					<p class="d-block">
		   				<c:out value="${ninja.firstName}"/> <c:out value="${ninja.lastName}"/> (<c:out value="${ninja.dojo.name}"/>)
   					</p>
		   		</c:forEach>
   			</div>
   		</div>
   </div>
</body>
</html>