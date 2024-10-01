package parte2;

import java.util.Scanner;

public class Ejer6 {

	public static void main(String[] args) {
		// Definimos la variable para los milímetros
		float mm;
		// Definimos la variable para los centímetros
		int cm;
		// Definimos la variable para los metros
		int m;
		// Creamos la variable resultado
		float resultado;
		// Creamos el escáner
		Scanner sc = new Scanner(System.in);
		// Pedimos al usuario un número de milímetros
		System.out.println("Introduzca distancia en milímetros: ");
		// Lo leemos por pantalla
		mm = sc.nextFloat();
		// Pedimos al usuario un número de centímetros
		System.out.println("Introduzca distancia en centímetros: ");
		// Lo leemos por pantalla
		cm = sc.nextInt();
		// Pedimos al usuario un número de metros
		System.out.println("Introduzca distancia en metros: ");
		// Lo leemos por pantalla
		m = sc.nextInt();
        //Para calcularlo, se dividen los mm por 10 y se multipican los metros por 100 y se suma todo
		resultado = mm / 10 + cm + m * 100;
		// Mostramos el resultado por pantalla
		System.out.println("La distancia total es de " + resultado + " cm");
		// Cerramos el escáner
		sc.close();
	}

}