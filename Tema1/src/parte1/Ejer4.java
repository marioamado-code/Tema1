package parte1;

import java.util.Scanner;

public class Ejer4 {

	public static void main(String[] args) {
		// Definimos las dos variables notas y la media
		double nota1;
		double nota2;
		double media;
		// Creamos el escáner
		Scanner sc = new Scanner(System.in);

		// Pedimos al usuario que nos de la nota 1
		System.out.println("Introduzca nota 1");
		// Damos la nota a la consola
		nota1 = sc.nextDouble();
		// Pedimos al usuario la segunda nota
		System.out.println("Introduzca nota 2");
		nota2 = sc.nextDouble();

		// Hacemos el cálculo
		media = (nota1 + nota2) / 2;

		// Mostramos el resultado
		System.out.println("La media es " + media);
		// Introducimos el valor en la consola
		media = sc.nextDouble();
		// Cerramos el escáner
		sc.close();

	}

}
