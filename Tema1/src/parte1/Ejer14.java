package parte1;

import java.util.Scanner;

public class Ejer14 {

	public static void main(String[] args) {
		// Introducimos variables
		int nota1;
		int nota2;
		int nota3;
		double mediaDecimal;
		int mediaEntera;
		// Creamos el escáner
		Scanner sc = new Scanner(System.in);
		// Pedimos al usuario la nota 1
		System.out.println("Introduzca nota primer trimestre:");
		// Lo metemos en la consola
		nota1 = sc.nextInt();
		// Pedimos al usuario la nota 2
		System.out.println("Introduzca nota segundo trimestre:");
		// Lo metemos en la consola
		nota2 = sc.nextInt();
		// Pedimos al usuario la nota 3
		System.out.println("Introduzca nota tercer trimestre:");
		// Lo metemos en la consola
		nota3 = sc.nextInt();
		//Hacemos los cálculos
		 mediaEntera = (nota1+nota2+nota3)/3;
		 mediaDecimal = (nota1+nota2+nota3)/3.0;
		 //Mostramos el resultado
		 System.out.println("La nota media entera es: " + mediaEntera  + ", la nota media decimal es"+ mediaDecimal);
		 //Cerramos el escáner
		 sc.close();

	}

}
