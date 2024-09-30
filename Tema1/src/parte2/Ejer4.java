package parte2;

import java.util.Scanner;

public class Ejer4 {

	public static void main(String[] args) {
	//Creamos las variables
		float a;
		float b;
		float c;
		float y;
		float x;
		//Creamos el escáner
		Scanner sc = new Scanner(System.in);
		//Pedimos los valores de a, b, c y x, y lo llemos 
		System.out.println("Introduzca valores para la función y = ax^2 +bx +c");
		System.out.println("a:");
		a = sc.nextFloat();
		System.out.println("b:");
		b = sc.nextFloat();
		System.out.println("c:");
		c = sc.nextFloat();
		System.out.println("x:");
		x = sc.nextFloat();
		//Hacemos el cálculo final
		y = a*x*x +b*x+c;
		//Mostramos el resultado
		System.out.println("El resultado de la ecuación es " + y);
		//Cerramos el escáner
		sc.close();
		

	}

}
