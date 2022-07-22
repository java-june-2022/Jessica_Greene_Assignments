<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- JSTL -->
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/css/style.css">
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
</head>
<body>
	<div class="container mt-3">
		<h1>Fruit Store</h1>
		<div class="pink-box mt-3 w-50">
			<table class="table bg-white">
				<tbody>
					<tr>
						<th scope="col">Name</th>
						<th scope="col">Price</th>
					</tr>
					<c:forEach var="fruit" items="${fruits}">
						<tr>
							<td>${fruit.name}</td>
							<td>${fruit.price}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</body>
</html>