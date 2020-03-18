<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registrazione studente</title>
</head>
<body>
	<h1>Registrazione studente</h1>
	<form action="studenteController" method="post">
		<p>Nome: <input type="text" name="nome"></p>
		<p>Cognome: <input type="text" name="cognome"></p>
		<p><input type="submit"></p>
	</form>
</body>
</html>