package parte2;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Introducimos las variables
		int num1;
		int num2;
		int contador;
		int resto;
		// Creamos el escáner
		Scanner sc = new Scanner(System.in);
		// Pedimos al usuario los números
		System.out.println("Introduzca  primer número entero ");
		// Leemos el número
		num1 = sc.nextInt();
		System.out.println("Introduzca segundo número entero ");
		// Leemos el número
		num2 = sc.nextInt();
		// Vemos si es múltiplo de 
		resto = num1 % num2;
		// si el resto es 0 no se le suma nada al contador
		if (resto == 0) {
			contador = 0;
		}
		// Si el resto no es 0 le restamos el resto a num2
		else {
			contador = num2 - resto;
		}
		// Lo mostramos por pantalla y cerramos el escáner
		System.out.println("Debes sumar " + contador + " a " + num1 + " para que sea múltiplo de "+ num2);
		sc.close();
	}

}

