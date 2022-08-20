<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. -->
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- form tag library -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Read Share</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/style.css">
    <script src="/webjars/jquery/jquery.min.js"></script>
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container my-3 mx-auto d-flex">
	    <div class="col bg-light p-3 mb-5 w-25 me-5">
	    	<div class= "d-flex justify-content-between">
				<h1>Add a Book to Your Shelf! </h1>
				<a href="/dashboard">back to the shelves</a>
	    	</div>
			<form:form action="/books/create" method="post" modelAttribute="book">
				<!-- New Book Flash Messages -->
				<div class="text-danger mb-3">
					<form:errors path="title" class="text-danger d-block" />
					<form:errors path="author" class="text-danger d-block" />
					<form:errors path="thoughts" class="text-danger d-block" />
					<form:errors path="postedBy" class="text-danger d-block" />
				</div>
				<div class="mb-3">
					<form:label path="title" class="col-md-3">Title: </form:label>
					<form:input path="title" class="col-md-8" />
				</div>
				<div class="mb-3">
					<form:label path="author" class="col-md-3">Author: </form:label>
					<form:input path="author" class="col-md-8" />
				</div>
				<div class="mb-3">
					<form:label path="thoughts" class="col-md-3">My thoughts: </form:label>
					<form:textarea path="thoughts" class="col-md-8" />
				</div>
				<form:hidden path="postedBy" value="${userId}" />
				<button type="submit" class="btn btn-info d-block">Submit</button>
			</form:form>
		</div>
	</div>
</body>
</html>