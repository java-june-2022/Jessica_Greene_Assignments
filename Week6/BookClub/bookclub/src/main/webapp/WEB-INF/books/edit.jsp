<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. -->
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- form tag library -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>

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
<body class=lightgray>
	<div class="container my-3 mx-auto d-flex">
	    <div class="col p-3 mb-5 w-25 me-5">
	    	<div class= "d-flex justify-content-between">
				<h1>Change Your Entry</h1>
				<a href="/dashboard">back to the shelves</a>
	    	</div>
			<form:form action="/books/${book.id}" method="post" modelAttribute="book">
				<input type="hidden" name="_method" value="put">
				<!-- New Book Flash Messages -->
				<div class="text-danger mb-3">
					<form:errors path="title" class="text-danger d-block" />
					<form:errors path="author" class="text-danger d-block" />
					<form:errors path="thoughts" class="text-danger d-block" />
					<form:errors path="postedBy" class="text-danger d-block" />
				</div>
				<div class="mb-3">
					<form:label path="title" class="col-md-3">Title: </form:label>
					<form:input path="title" class="col-md-8" value="${bookInfo.title}"/>
				</div>
				<div class="mb-3">
					<form:label path="author" class="col-md-3">Author: </form:label>
					<form:input path="author" class="col-md-8" value="${bookInfo.author}"/>
				</div>
				<div class="mb-3">
					<form:label path="thoughts" class="col-md-3">My thoughts: </form:label>
					<textarea name="thoughts" class="col-md-8">${bookInfo.thoughts}</textarea>
				</div>
				<form:hidden path="postedBy" value="${userId}" />
				<button type="submit" class="btn btn-info d-block">Submit</button>
			</form:form>
		</div>
	</div>
</body>
</html>