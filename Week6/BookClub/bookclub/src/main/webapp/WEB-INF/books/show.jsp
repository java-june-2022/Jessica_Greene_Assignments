<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. -->
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

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
	<div class="container">
		<div class="d-flex justify-content-between mb-4">
			<h1 class="fst-italic">
				<c:out value="${ book.title }" />
			</h1>
			<a href="/dashboard">back to the shelves</a>
		</div>
		<div class="mb-4">
			<h2>
				<span class="text-danger"><c:out value="${ book.postedBy.userName }" /></span>
				read <span class="text-purple"><c:out value="${ book.title }" /></span>
				by <span class="text-success"><c:out value="${ book.author }" /></span>.			
			</h2>
			<h2>Here are <c:out value="${ book.postedBy.userName }" />'s thoughts:</h2>
		</div>
		<hr>
			<p class="my-4"> <c:out value="${ book.thoughts }" /></p>
		<hr>
		<a href="/books/${book.id}/edit" class="btn btn-light float-end">Edit</a>
	</div>
</body>
</html>