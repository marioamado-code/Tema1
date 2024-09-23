package parte1;

import java.util.Scanner;

public class Ejer3 {

	public static void main(String[] args) {
		// Creamos el escáner
		Scanner sc = new Scanner(System.in);
		// Definimos la variable año actual
		int anioActual;
		// Pedimos el año actual
		System.out.println("Introduzca el año actual");
		// Damos el año a la consola
		anioActual = sc.nextInt();
		// Definimos la variable año de nacimiento
		int anioNacimiento;
		System.out.println("Introduzca su año de nacimiento");
		// Damos el año a la consola
		anioNacimiento = sc.nextInt();
		// Añadimos la variable edad
		int edad;
		// Calculamos la edad
		edad = anioActual - anioNacimiento;
		// Enseñamos la edad
		System.out.println("Su edad es de " + edad + " 20años");
		// Damos la edad a la consola
		edad = sc.nextInt();
		// Cerramos el escáner
		sc.close();

	}

}
