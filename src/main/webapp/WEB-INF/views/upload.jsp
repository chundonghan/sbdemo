<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Error</title>
<script type="text/javascript" src="assets/jquery-2.2.3.min.js"></script>
</head>
<body>
	<form action="uploadFile" enctype="multipart/form-data" method="post">
		<input type="file" name="file"/>
		<br>
		<input type="submit" value="upload">
	</form> 
</body>
</html>