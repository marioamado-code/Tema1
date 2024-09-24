package parte1;

import java.util.Scanner;

public class Ejer10 {

	public static void main(String[] args) {
		// Creamos el escáner
		Scanner sc = new Scanner(System.in);
		// Introducimos variable
		int num;
		//Pedimos al usuario el número
		System.out.println("Introduzca un número");
		//Lo metemos en la consola
		num = sc.nextInt();
		// Introducimos booleano
		boolean par = num % 2 == 0;
		if (par) {
			System.out.println("El número " + num +" es par");
		}
		else
			System.out.println("El número " + num +" es impar");
		//Cerramos escáner
		sc.close();

	}

}
