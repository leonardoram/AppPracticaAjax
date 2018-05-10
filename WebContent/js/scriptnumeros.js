//alert("testitu nombre");
var xhr = new XMLHttpRequest();

window.onload=function()
{
	document.getElementById("suma").onclick=inicializa;
}

function inicializa()
{
	//alert("testitu");
	console.log("estamos en inicializa");
	var parametro1 =document.getElementById("num1").value;
	console.log("el numero 1 es "+parametro1);
	var parametro2 =document.getElementById("num2").value;
	console.log("el numero 2 es "+parametro2);
	var sumita = "num1="+parametro1+"&num2="+parametro2;
	xhr.open("GET","Suma2numeros?"+sumita,true);
	xhr.setRequestHeader('content-type','application/x-www-form-urlencoded');
	xhr.onreadystatechange=funcionCallback;
	xhr.send(sumita);
}
function funcionCallback() {
	
	console.log("estamos en funcion callback");
	if(xhr.readyState ==4 && xhr.status == 200){
		console.log("estamos dentro del if");
		//alert("si funciona")
		document.getElementById("divResultado2").innerHTML= xhr.responseText;
	}
	
	
}
