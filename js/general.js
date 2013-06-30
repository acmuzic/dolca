// JavaScript Document

//Configuración de la app
var debug = 1;
var premios_maximo = 25;
var porcentaje_ganador = 40;

//Premios

//Armo la fecha de hoy
var d = new Date();
var mes = d.getMonth()+1;
if(mes<10){
	mes='0'+mes;
}
var dia = d.getDate();
if(dia<10){
	dia = '0'+dia;
}
var fecha=d.getFullYear()+'-'+mes+'-'+dia;

//Busco la variable ganador
var ganador = window.localStorage.getItem('ganador');

//Busco la variable cachorro elegido
var cachorro = window.localStorage.getItem('cachorro');

function chequearPremios() {
	//Muestro la fecha
	alerta('fecha: '+fecha);
	
	//Muestro el estado de la variable ganador al comenzar
	alerta('ganador onload: '+ganador);

	
	//Blanqueo el estado de la variable ganador
	window.localStorage.setItem('ganador', 0);
	alerta('ganador post chequearPremios(): '+window.localStorage.getItem('ganador'));
	
	//Chequeo si no está creado el contador de premios del dia, sino lo creo
	if(window.localStorage.getItem(fecha) == null)
	{
		window.localStorage.setItem(fecha, 0);
	}
	alerta('premios regalados: '+window.localStorage.getItem(fecha));
	
	//Traigo la cantidad de premios que se van regalando hoy
	var premios = window.localStorage.getItem(fecha);
	
	//Si ya entregue la cantidad de premios definida, no entrego mas
	if(premios<premios_maximo)
	{
		var gana = sortearPremio();
	}else{
		var gana = 0;
	}
	alerta('gana: '+gana);
	
	//Almaceno para la fecha la cantidad (1 o 0) de premios entregados hoy
	window.localStorage.setItem(fecha, parseInt(premios)+parseInt(gana));
	premios = window.localStorage.getItem(fecha);
	alerta('premios: '+premios);
}

function sortearPremio()
{
 var rand = Math.floor((Math.random()*100)+1);
	 if(rand<porcentaje_ganador)
	 {
		 return 0;
	 }
	 else
	 {
		 return 1;
	 }
}

//Modo Debug
function alerta(texto)
{
	if(debug==1)
	{
		alert(texto);
	}
}