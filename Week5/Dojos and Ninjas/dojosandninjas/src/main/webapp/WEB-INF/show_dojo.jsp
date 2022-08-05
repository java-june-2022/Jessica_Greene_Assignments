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
    <title>Dojo Page</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/jquery/jquery.min.js"></script>
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
   	<div class="container">
   		<div class="d-flex justify-content-between">
   			<h1><c:out value="${dojo.name}"/> Location Ninjas</h1>
			<a href="/dojos">Home</a>
		</div>
  		<table class="table table-striped table-bordered">
		  <thead>
		    <tr class="table-secondary">
		      <th scope="col">First Name</th>
		      <th scope="col">Last Name</th>
		      <th scope="col">Age</th>
		    </tr>
		  </thead>
		  <tbody>
		  	<c:forEach items="${dojo.ninjas}" var="ninja">
			    <tr>
			      <td><c:out value="${ninja.firstName}"/></td>
			      <td><c:out value="${ninja.lastName}"/></td>
			      <td><c:out value="${ninja.age}"/></td>
			    </tr>
		    </c:forEach>
		  </tbody>
		</table>
   	</div>
</body>
</html>