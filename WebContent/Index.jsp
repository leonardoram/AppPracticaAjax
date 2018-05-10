<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="css/bootstrap-grid.min.css" rel="stylesheet" />
<link href="css/bootstrap.min.css" rel="stylesheet" />
<link href="css/style.css" rel="stylesheet" />
<title>Bienvenido</title>
</head>
<!-- En este proyecto nos enfocamos en utilizar las tecnologias Bootstrap y AJAX para realizar peticiones asincronas a nuestro servidor -->

<body>
<!-- 	<form action="Suma2numeros" method="get" > -->
	<h1 class="container ">Suma de 2 numeros </h1>
	
	<div class="form-group ">
	<p class="container "> 
		<label for ="num1">Numero 1 : </label>
		<input class="form-control " id="num1" name="num1"type="text" >
	</p>
	</div>
	<div class="form-group  ">
	<p class="container "> 
		<label for ="num2">Numero 2 : </label>
		<input class="form-control " id="num2" name="num2" type="text" >
	</p>
	</div>
	<p class="container "> 
		<input  class="btn btn-info" id="suma" type="button" value="sumar" >
	</p>
	<div id="divResultado2"></div>
	
	<p class="container">
		<a href="Index2.jsp" > Ingresar nombre</a>
	</p>
	<p class="container">
		<a href="Index3.jsp" > Ingresar nombre jquery</a>
	</p>
	<p class="container">
		<a href="Index4.jsp" > Ingresar nombre jquery con funcion flecha</a>
	</p>
	<script type="text/javascript" src="js/jquery.js"></script>
	<script type="text/javascript" src="js/bootstrap.min.js"></script>
	<script type="text/javascript" src="js/scriptnombre.js"></script>
	<script type="text/javascript" src="js/scriptnumeros.js"></script>
<!-- 	</form> -->
	
</body>
</html>