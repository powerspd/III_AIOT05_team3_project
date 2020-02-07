<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sign Up Test</title>
</head>
<body>
	<form action="signUp" method="post">
		User Name: <input type="text" name="name" required><br>
		Password: <input type="password" name="password" required><br>
		Email: <input type="text" name="email" required><br>
		Phone number: <input type="tel" name="phonenumber" required pattern="[0-9]{4}-[0-9]{3}-[0-9]{3}"><br>
		phone format: XXXX-XXX-XXX<br>
		Birthday: <input type="date" name="birthday" required><br>
		<input type="submit" value="sign up">
	</form>
</body>
</html>