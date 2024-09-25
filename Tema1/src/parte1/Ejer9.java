package parte1;

import java.util.Scanner;

public class Ejer9 {

	public static void main(String[] args) {
		// Introducimos la variable edad
				int edad;
		// Creamos el escáner
		Scanner sc = new Scanner(System.in);
		
		// Pedimos al usuario la edad
		System.out.println("Introduzca edad");
		// La pasamos a la consola
		edad = sc.nextInt();
		// Hacemos el booleano
		boolean mayorDeEdad = edad >= 18;
		if (mayorDeEdad) {
			System.out.println("Eres mayor de edad");
		} else {
			System.out.println("Eres menor de edad");
		}

		// Cerramos el escáner
		sc.close();

	}

}
