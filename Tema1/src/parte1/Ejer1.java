package parte1;

import java.util.Scanner;

public class Ejer1 {

	public static void main(String[] args) {
		// Definimos la variable
				int numero;
		// Creamos el escáner
		Scanner sc = new Scanner(System.in);
		
		// Pedimos al usuario un número
		System.out.println("Introduzca un número");
		// Introducimos un número a la consola
		numero = sc.nextInt();
		// Enseñamos al usuario el número introducido
		System.out.println("Su número introducido es:" + numero);
		// Cerramos el escáner
		sc.close();

	}

}
