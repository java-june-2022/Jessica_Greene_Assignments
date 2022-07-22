<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
</head>
<body>
	<div class="container text-center">
		<p class="mt-5">You have visited <a href="/your_server">http:your_server</a> ${visitCount} times.</p>
		<a type="button" class="btn btn-primary" href="/your_server">Test Another Visit</a>
		<a type="button" class="btn btn-danger" href="/your_server/reset">Reset Visit Count</a>
	</div>
</body>
</html>