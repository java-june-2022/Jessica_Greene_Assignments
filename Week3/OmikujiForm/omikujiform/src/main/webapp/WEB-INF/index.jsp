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
	<div class="container p-3">
		<h1 class="text-center">Send an Omikuji!</h1>
		<form action="/omikuji/process" method="POST" class="border p-3 w-50 mx-auto">
			<div class="form-group mb-3">
				<label for="numYears">Pick any number from 5 to 25</label> 
				<input type="number"name="numYears" min="5" max="25" placeholder="0">
			</div>
			<div class="form-group mb-3">
				<label for="city">Enter the name of any city:</label>
				<input type="text" name="city" class="form-control">
			</div>
			<div class="form-group mb-3">
				<label for="personName">Enter the name of any real person:</label>
				<input type="text" name="personName" class="form-control">
			</div>
			<div class="form-group mb-3">
				<label for="hobby">Enter professional endeavor or hobby:</label>
				<input type="text" name="hobby" class="form-control">
			</div>
			<div class="form-group mb-3">
				<label for="livingThing">Enter any type of living thing.</label>
				<input type="text" name="livingThing" class="form-control">
			</div>
			<div class="form-group mb-3">
  				<label for="message">Say something nice to someone:</label>
  				<textarea class="form-control" name="message" rows="5"></textarea>
			</div>
			<p>Send and show a friend</p>
			<button type="submit" class="btn btn-primary">Send</button>
		</form>

	</div>
</body>
</html>