package parte2;

import java.util.Scanner;

public class Ejer8 {

	public static void main(String[] args) {
		// Creamos la variable distancia en metros
		float metros;
		// creamos la variable centímetros
		int cents;
		// Creamos el escáner
		Scanner sc = new Scanner(System.in);
		// Pedimos al usuario el número
		System.out.println("Introduzca distancia en metros: ");
//Lo leemos 
		metros = sc.nextFloat();
		// Lo convertimos en centímetros y lo truncamos
		cents = (int) metros * 100;
		// Lo mostramos por pantalla
		System.out.println("La distancia es de " + cents + " centímetros");
		// Cerramos el escáner
		sc.close();
	}

}
