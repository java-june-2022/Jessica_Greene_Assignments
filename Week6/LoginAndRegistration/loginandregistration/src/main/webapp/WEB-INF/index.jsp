<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. --> 
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- form tag library -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>JSP Template</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/style.css">
    <script src="/webjars/jquery/jquery.min.js"></script>
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container mx-auto">
	    <h1 class=text-purple>Welcome!</h1>
		<p class="subheading">Join our growing community.</p>
	    <div class="container my-3 mx-auto d-flex">
	        <!-- Registration -->
	        <div class="col bg-light p-3 mb-5 w-25 me-5">
	            <h2 class="text-info">Registration</h2>
	            <!-- Registration Form -->
	            <form:form action="/register" method="post" modelAttribute="newUser">
	            	<!-- Registration Flash Messages -->
	            	<div class="text-danger mb-3">
	            		<form:errors path="userName" class="text-danger d-block"/>
	            		<form:errors path="email" class="text-danger d-block"/>
	            		<form:errors path="password" class="text-danger d-block"/>
	            		<form:errors path="confirm" class="text-danger d-block"/>
	            	</div>
	            	<div class="mb-3">
						<form:label path="userName" class="col-md-3">User Name: </form:label>
						<form:input path="userName" class="col-md-8"/>
					</div>
					<div class="mb-3">
						<form:label path="email" class="col-md-3">Email: </form:label>
						<form:input path="email" class="col-md-8"/>
					</div>
					<div class="mb-3">
						<form:label type="password" path="password" class="col-md-3">Password: </form:label>
						<form:input type="password" path="password" class="col-md-8"/>
					</div>
					<div class="mb-3">
						<form:label type="password" path="confirm" class="col-md-3">Confirm Password: </form:label>
						<form:input type="password" path="confirm" class="col-md-8"/>
					</div>
	                <button type="submit" class="btn btn-info d-block">Register</button>
	            </form:form>
	        </div>
	        
	        
	        <!-- Login -->
	        <div class="col bg-light p-3 mb-5 w-25 mx-5">
	            <h2 class="text-primary">Login</h2>        
	            <!-- Login Form -->
	            <form:form action="/login" method="post" modelAttribute="newLogin">
	            	<!-- Login Flash Messages -->
	            	<div class="text-danger mb-3">
	            		<form:errors path="email" class="text-danger d-block"/>
	            		<form:errors path="password" class="text-danger d-block"/>
	            	</div>
	            	<div class="mb-3">
						<form:label path="email" class="col-md-3">Email: </form:label>
						<form:input path="email" class="col-md-8"/>
					</div>
					<div class=mb-3>
						<form:label type="password" path="password" class="col-md-3">Password: </form:label>
						<form:input type="password" path="password" class="col-md-8"/>
					</div>
	                <button type="submit" class="d-block btn btn-primary">Login</button>
	            </form:form>
	        </div> 
        </div> 
    </div>
</body>
</html>