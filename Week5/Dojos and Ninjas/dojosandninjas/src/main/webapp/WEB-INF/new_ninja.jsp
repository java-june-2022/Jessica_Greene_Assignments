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
    <title>New Ninja</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/jquery/jquery.min.js"></script>
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<div class="d-flex">
			<h1>New Ninja</h1>
			<a href="/dojos">Home</a>
		</div>
		<form:form action="/ninjas" method="post" modelAttribute="ninja">
			<div class="row g-3 w-75">
				<div>
					<form:label path="dojo" class="col-md-2">Dojo: </form:label>
					<form:select path="dojo" class="col-md-4">
						<form:option value="${null}" label="Please select..."/>
						<form:options items="${dojos}" itemValue="id" itemLabel="name"/>
					</form:select>
					<form:errors path="dojo" class="text-danger col-md-4"/>
				</div>
				
				<div>
					<form:label path="firstName" class="col-md-2">First Name: </form:label>
					<form:input path="firstName" class="col-md-4"/>
					<form:errors path="firstName" class="text-danger col-md-4"/>
				</div>
				<div>
					<form:label path="lastName" class="col-md-2">Last Name: </form:label>
					<form:input path="lastName" class="col-md-4"/>
					<form:errors path="lastName" class="text-danger col-md-4"/>
				</div>
				<div>
					<form:label path="age" class="col-md-2">Age: </form:label>
					<form:input type="number" path="age" class="col-md-4"/>
					<form:errors path="age" class="text-danger col-md-4"/>
				</div>
			</div>
			<input type="submit" value="Create" class="btn btn-primary mt-3" />
		</form:form>
	</div>
</body>
</html>