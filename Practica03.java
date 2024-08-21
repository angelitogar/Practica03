//Angel Daniel García Espino
//Johnatan Cuauhtémoc Vázquez Arciga
//Equipo14

import java.util.Scanner;
    public class Practica03{
    public static void main(String[] args){

    //Solicitud de datos. Nombre, ocupación, etc.

	
//En este caso primero hago que capture el mensaje, luego lo convierto a una cadena y por último a mayusculas para poder utilizarlo en el programa
	String bienvenida = "Hola!, bienvenidx, para empezar tu carta tienes que indicar los siguientes datos. Empecemos: ¿Cuál es tu nombre?" ;
        System.out.println( bienvenida );
	Scanner name = new Scanner(System.in);
	String names = name.nextLine();

	System.out.println("¿Cuál es tu ocupación?");
	Scanner job = new Scanner(System.in);
	String job1 = job.nextLine();
	String jobs = job1.toUpperCase();

        System.out.println( "¿A quién va dirigido tu mensaje?" );
	Scanner destinatario = new Scanner(System.in);
	String destinatarios = destinatario.nextLine();

	//En este caso primero hago que capture el mensaje, luego lo convierto a una cadena y por último a mayusculas para poder utilizarlo en el programa
	System.out.println( "¿Cuál es la profesión del destinatario?" );
	Scanner destinjob = new Scanner(System.in);
	String dj1 = destinjob.nextLine();
	String destinjobs = dj1.toUpperCase();
      
	System.out.println( "Escribe el contenido de tu mensaje: " );
	Scanner msj = new Scanner(System.in);
	String sms = msj.nextLine();

	//voy a contar de una vez la longitud del mensaje

	int caracteres = sms.length();
	
	System.out.println( "¿Deseas enviar tu telegrama como urgente? (tendría un costo de $4 pesos por letra) escribe \"si\"" );
	Scanner yon  = new Scanner(System.in);  
        String urgente = yon.nextLine();

	//Dividiré la dirección en dos subcadenas para posteriormente trabajarlas más facilmente
	System.out.println( "Por último, ingrese la dirección a la que quiere enviar la carta en el siguiente formato: Calle numero, ciudad CP (es importante que utilices la coma como se indica)" );
	Scanner adress  = new Scanner(System.in);  
        String dir = adress.nextLine();
	int coma = dir.indexOf(',');
	String dir1 = dir.substring(0, coma).trim();
        String dir2 = dir.substring(coma+ 1).trim(); 

       
       

	System.out.println( "Gracias por tu preferencia, a cotinuación está la carta con todos los datos: \n");

	//Empezamos a imprimir los datos:
	System.out.println( "                                           De:  " + jobs.substring(0,3) + ".  " + names.toUpperCase());
	System.out.println( "                                         Para:  " + destinjobs.substring(0,3) + ".  " + destinatarios.toUpperCase());
	System.out.println( sms + "\n" );
	
	//Vamos a calcular el costo de la carta y de cada caracter
	
	int costo = (urgente == "si") ? (caracteres * 2) : (caracteres * 4) ;
	int precio = (urgente == "si") ? 2 : 4 ;

	//Indicamos el costo de la carta

	System.out.println( "El costo de la carta fue: " + costo + " pesos");
	    String estado = (urgente == "si") ? "La carta se realizó con envío estandar" : "La carta se realizó con envío urgente" ;
	System.out.println( estado );
	System.out.println("La cantidad de caracteres de la carta fue de: " + caracteres + " y su costo fue de: $" + precio );
	System.out.println(dir1.toUpperCase());
	System.out.println(dir2.toUpperCase());


    }
    }

			   
