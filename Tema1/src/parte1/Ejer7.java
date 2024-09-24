package parte1;

import java.util.Scanner;

public class Ejer7 {

	public static void main(String[] args) {
		// Creamos el escáner
		Scanner sc = new Scanner(System.in);
		// Introducimos las variables, pedimos los datos y metemos ese número en consola

		System.out.println("Introduzca nombre");
		String nombre = sc.nextLine();
		System.out.println("Introduzca dirección");
		String direccion = sc.nextLine();
		int tel;
		System.out.println("Introduzca teléfono");
		tel = sc.nextInt();

		// Lo mostramos
		System.out.println("Nombre: " + nombre);
		System.out.println("Dirección: " + direccion);
		System.out.println("Teléfono: " + tel);

		// Cerramos el escáner
		sc.close();

	}

}
