package parte1;

import java.util.Scanner;

public class Ejer13 {

	public static void main(String[] args) {
		//Creamos las variable 
	  String respuesta;
		//Creamos el escáner
		Scanner sc = new Scanner(System.in);
		//Preguntamos al usuario si necesita ir a la biblioteca
		System.out.println("¿Necesita ir a la biblioteca? (si o no):");
		//Pasamos el dato a consola
	   String irBiblioteca = sc.next();
	   //Creamos la bifurcación y añadimos la verificación de cadenas por si hay algún error
	   if
	   //Ponemos si entre parentesis al final para no tener que poner true o false
	   (irBiblioteca.equalsIgnoreCase("si")) {
		   //Si es si podrá salir
		   respuesta = "si";
	   }
	   else {
		   // Si no creamos las demás condiciones
		   System.out.println("¿Llueve? (si o no):");
		   String llueve = sc.next();
		   System.out.println("¿Acabó los deberes? (si o no):");
		   String tareasHechas = sc.next();
		   //Hacemos la bifurcación  y añadimos un "y"
		   if (llueve.equalsIgnoreCase("no") && tareasHechas.equalsIgnoreCase("si")) {
			   respuesta = "si";
			   
			   }
		   else 
		   {
			   respuesta = "no";
			  
		   }
		   
	   }
		//Mostramos el resultado
	    System.out.println("¿Puedes salir a la calle?: " + respuesta);
	    //Cerramos el escáner
	    sc.close();
		

	}

}
