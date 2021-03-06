// JavaScript Document

//Configuración de la app
var premios_maximo = 25;
var porcentaje_ganador = 60;

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

//Busco la variable penal elegido
var penal = window.localStorage.getItem('penal');
	

function chequearPremios() {
	
	//alert('premios');
	
	//Muestro la fecha
	//alert('fecha: '+fecha);
	
	//Muestro el estado de la variable ganador al comenzar
	//alert('ganador al cargar: '+window.localStorage.getItem('ganador'));

	
	//Blanqueo el estado de la variable ganador
	window.localStorage.setItem('ganador', 0);
	//alert('ganador blanqueado: '+window.localStorage.getItem('ganador'));
	
	//Chequeo si no está creado el contador de premios del dia, sino lo creo
	if(window.localStorage.getItem(fecha) == null)
	{
		//alert('creo el contador para fecha:'+fecha);
		window.localStorage.setItem(fecha, 0);
	}
	
	//Traigo la cantidad de premios que se van regalando hoy
	var premios = window.localStorage.getItem(fecha);
	//alert('premios regalados a fecha '+fecha+': '+window.localStorage.getItem(fecha));
	
	//Si ya entregue la cantidad de premios definida, no entrego mas
	//alert(premios+'/'+premios_maximo);
	if(premios<premios_maximo)
	{
		ganador = sortearPremio();
	}else{
		ganador = 0;
	}
	//alert('ganador?: '+ganador);
	window.localStorage.setItem('ganador',ganador);
	//Almaceno para la fecha la cantidad (1 o 0) de premios entregados hoy
	window.localStorage.setItem(fecha, parseInt(premios)+parseInt(ganador));
	premios = window.localStorage.getItem(fecha);
	//alert('premios almacenados: '+premios);
}

function sortearPremio()
{
	var rand = Math.floor((Math.random()*100)+1);
	//alert('rand:'+rand+' / '+porcentaje_ganador);
	if(rand<porcentaje_ganador)
	{
		return 1;
	}
	else
	{
		return 0;
	}
}
function blanquearPremios()
{
	if(confirm('Está a punto de blanquear los '+window.localStorage.getItem(fecha)+' premios entregados hoy ('+fecha+'). \n ¿Está seguro?'))
	{
		window.localStorage.setItem(fecha, 0);
		alert('Los premios para el día '+fecha+' se blanquearon');
	}
}

function getPhoneGapPath() {
    var path = window.location.pathname;
    path = path.substr( path, path.length - 10 );
    //return 'file://' + path;
    return path;
};

/*-------------------------------  AUDIO ---------------------------------*/
var my_media = null;
var mediaTimer = null;
function playAudio(src) {
	if (my_media == null) {
		// Create Media object from src
		my_media = new Media(src, onSuccess, onError);
	} // else play current audio
	// Play audio
	my_media.play();

	// Update my_media position every second
	if (mediaTimer == null) {
		mediaTimer = setInterval(function() {
			// get my_media position
			my_media.getCurrentPosition(
				// success callback
				function(position) {
					if (position > -1) {
						setAudioPosition((position) + " sec");
					}
				},
				// error callback
				function(e) {
					console.log("Error getting pos=" + e);
					setAudioPosition("Error: " + e);
				}
			);
		}, 1000);
	}
}