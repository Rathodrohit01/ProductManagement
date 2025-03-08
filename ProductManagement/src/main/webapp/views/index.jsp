<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>index page</title>
<style>
.jumbotron{
	height:600px;
	width:100%;
	border:1px solid black;
	display:flex;
	justify-content:center;
	justify-items:center;
	background-image:url("https://images3.alphacoders.com/133/1338701.png");
	background-position:center;
	
}
.hello{
	height:100px;
	width:450px;
	color:white;
	
	
}
</style>
</head>
<body>
<jsp:include page="navbar.jsp"></jsp:include> <br> <hr>
<div class="jumbotron">
	<div class="hello">
		<h1>Product Management System</h1> 	
		
		
	</div>
</div>
</body>
</html>