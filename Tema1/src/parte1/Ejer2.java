package parte1;

import java.util.Scanner;

public class Ejer2 {

	public static void main(String[] args) {
		// Creamos la variable
				int edad;
		// Creamos el escáner
		Scanner sc = new Scanner(System.in);
		
		// Pedimos al usuario su edad
		System.out.println("Introduzca edad");
		// Introducimos la edad a la consola
		edad = sc.nextInt();
		// Modificamos la variable
		edad = edad + 1;
		// Enseñamos al usuario la edad cambiada
		System.out.println(" Su edad dentro de un año será:" + edad + " años");
		// Cerramos el escáner
		sc.close();

	}

}
