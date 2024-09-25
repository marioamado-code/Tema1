package parte1;

import java.util.Scanner;

public class Ejer12 {

	public static void main(String[] args) {
		// Introducimos las variables
		double manzanas;
		double peras;
		double importe;
		// Creamos el escáner
		Scanner sc = new Scanner(System.in);
		// Pedimos al usuario el número de kilos vendidos de manzanas
		System.out.println("¿Cúantos kilos de manzanas se han vendido?");
		// Pasamos el número a consola
		manzanas = sc.nextDouble();
		// Pedimos al usuario el número de kilos vendidos de peras
		System.out.println("¿Cúantos kilos de peras se han vendido?");
		// Pasamos el número a consola
		peras = sc.nextDouble();
//Hacemos los cálculos
		importe = 2.35*manzanas + 1.95*peras;
		//Mostramos el resultado
		System.out.println("Ha ganado " + importe + " euros");
		//Cerramos el escáner
		sc.close();
	}

}
