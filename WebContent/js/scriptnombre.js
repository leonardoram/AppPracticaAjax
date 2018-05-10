//Utilizamos AJAX para nuestras peticiones al server

var xhr = new XMLHttpRequest();

window.onload=function()
{
	document.getElementById("nombre").onclick=inicializa;
}

function inicializa()
{
	
	var valortextboxnombre =document.getElementById("txtNombre").value;
	xhr.open("GET","Nuevonombre?txtNombre="+valortextboxnombre,true);
	xhr.onreadystatechange=funcionCallback;
	xhr.send();
}

function funcionCallback() {
	
	
	if(xhr.readyState ==4 && xhr.status == 200){
		
		document.getElementById("divResultado").innerHTML= xhr.responseText;
	}
	
	
}
