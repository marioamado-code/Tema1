package parte1;

import java.util.Scanner;

public class Ejer6 {

	public static void main(String[] args) {
		// Definimos las variables
				int num1;
				int num2;
				//Introducimos las variables de resultados
				int suma;
				int resta;
				int división;
				int multiplicación;
		// Creamos el escáner
		Scanner sc = new Scanner(System.in);
		
		// Pedimos introducir el primer número
		System.out.println("Introduzca primer número");
		// Metemos ese número en consola
		num1 = sc.nextInt();
		// Pedimos el segundo número
		System.out.println("Introduzca segundo número");
		// Metemos ese número en consola
		num2 = sc.nextInt();
		
		//Hacemos el cálculo
		suma = num1+num2;
		resta = num1-num2;
		división = num1/num2;
		multiplicación = num1*num2;
		//Expresamos los resultados
		System.out.println("La suma da " + suma);
		System.out.println("La resta da " + resta);
		System.out.println("La multiplicación da " + multiplicación);
		System.out.println("La división da " + división);
		//Cerramos el escáner
		sc.close();
		

	}

}
