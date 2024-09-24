package parte1;

import java.util.Scanner;

public class Ejer8 {

	public static void main(String[] args) {
		// Creamos el escáner
		Scanner sc = new Scanner(System.in);
		// Pedimos al usuario nombre y edad, introducimos las variables y metemos el
		// dato en consola
		System.out.println("¿Cómo te llamas?");
		String nombre = sc.nextLine();
		int edad;
		System.out.println("¿Cúantos años tienes?");
		edad = sc.nextInt();
		// Mostramos los datos
		System.out.println("Enhorabuena " + nombre + ", tienes " + edad + " años, que mayor eres");
		// Cerramos el escáner
		sc.close();

	}

}
