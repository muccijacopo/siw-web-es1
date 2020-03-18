<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Riepilogo dati</h1>
	Nome: ${studenteForm.nome}
	Cognome: ${studenteForm.cognome}
	<form action="conferma" method="get">
		<input type="submit" value="Conferma">
	</form>
</body>
</html>