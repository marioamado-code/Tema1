package parte1;

import java.util.Scanner;

public class Ejer8 {

	public static void main(String[] args) {
		int edad;

		// Creamos el escáner
		Scanner sc = new Scanner(System.in);
		String nombre = sc.nextLine();
		
		// Pedimos al usuario nombre y edad, introducimos las variables y metemos el
		// dato en consola
		System.out.println("¿Cómo te llamas?");

		System.out.println("¿Cúantos años tienes?");
		edad = sc.nextInt();
		// Mostramos los datos
		System.out.println("Enhorabuena " + nombre + ", tienes " + edad + " años, que mayor eres");
		// Cerramos el escáner
		sc.close();

	}

}
