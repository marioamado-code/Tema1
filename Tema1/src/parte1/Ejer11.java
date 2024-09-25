package parte1;

import java.util.Scanner;

public class Ejer11 {

	public static void main(String[] args) {
	//Introducimos las variables
	double euros;
	double pesetas;
	//Creamos el escáner
	Scanner sc = new Scanner(System.in);
	//Pedimos al usuario el número de pesetas
	System.out.println("Introduzca número de pesetas");
	//Pasamos el número a la consola
	pesetas = sc.nextDouble();
	//Lo dividimos
	euros = pesetas/166;
	
	//Lo mostranmos por pantalla
	System.out.println("Tienes " + euros + " euros");
	//Cerramos el escáner
	sc.close();

	}

}
