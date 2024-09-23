package parte1;

import java.util.Scanner;

public class Ejer5 {

	public static void main(String[] args) {
	// Creamos el escáner
		Scanner sc = new Scanner(System.in);
		//Definimos la variable radio
		double radio;
		// Pedimos al usuario que ponga el radio
		System.out.println("Introduzca radio");
		//Introducimos el número en la consola
		radio = sc.nextDouble();
		// Introducimos la variable longitud
		double longitud;
		// Calculamos la longitud
		longitud = radio*2*Math.PI;
		//Introducimos la variable area
				double area;
				//Calculamos el area
				area = radio*radio*Math.PI;
		//Enseñamos la longitud y el area
		System.out.println("La longitud es "+ longitud +", el área es "+ area);
		//Cerramos el escáner
		sc.close();
		
		
		
		
		

	}

}
