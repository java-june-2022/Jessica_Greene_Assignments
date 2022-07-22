<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="/css/style.css">
</head>
<body>
	<div class="container p-3 text-center">
		<h1>Here's Your Omikuji!</h1>
		<p class="blue w-50 mx-auto">
			In ${numYears} years, you will live
			in ${city} with ${personName} as your roommate, ${hobby} for a
			living. The next time you see a ${livingThing}, you will have good
			luck. Also, ${message}.
		</p>
		<a href="/omikuji">Go Back</a>
	</div>
</body>
</html>