<%@ page language="java" 
		 contentType="text/html; charset=ISO-8859-1"
    	 pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>

<html>

	<head>
		<meta charset="ISO-8859-1">
		<title>Consulta por CPF</title>
	</head>

	<body>
	
		<form action="identificacao" method="POST">
		
			<h2>Consulta por CPF</h2>
			
			<p>
				<label for="cpf">Digite o CPF</label>
				<input type="text" id="cpf" name="cpf"/>
			</p>		
			
			<input type="submit" value="Buscar" />		
			
		</form>
			
	</body>

</html>