package parte2;

import java.util.Scanner;

public class Ejer1 {

	public static void main(String[] args) {
		// Introducimos variable
		float num;
		final double MITAD = 0.5;
		// Creamos el escáner
		Scanner sc = new Scanner(System.in);
		// Pedimos al usuario el número
		System.out.println("Introduzca número decimal");
		// Leemos el número
		num = sc.nextFloat();
		// Ahora tenemos que redondearlo
		num =(int) (num + MITAD);
		// Mostramos el resultado
		System.out.println("El número redondeado es:"+ (int)num);
		//Cerramos el escáner
		sc.close();

	}

}
