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
	<div class="container mx-auto">
		<div class="d-flex justify-content-between">
			<h1 class=text-purple>
				Welcome,
				<c:out value="${currentUser.userName}" />
				!
			</h1>
			<a href="/logout">logout</a>
		</div>
		<div class="d-flex justify-content-between">
			<p class="subheading">Books from everyone's shelves:</p>
			<a href="/books/new">+ Add a book to my shelf!</a>
		</div>
		<table class="table table-striped">
			<thead class="table-secondary">
				<tr>
					<th>ID</th>
					<th>Title</th>
					<th>Author Name</th>
					<th>Posted By</th>
				</tr>
			</thead>
			<tbody>
 				<c:forEach items="${books}" var="book">
					<tr>
						<td><c:out value="${book.id}" /></td>
						<td>
							<a href="/books/${book.id}">
								<c:out value="${book.title}" />
							</a>
						</td>
						<td><c:out value="${book.author}" /></td>
						<td><c:out value="${book.postedBy.userName}" /></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>