package parte1;

import java.util.Scanner;

public class Ejer15 {

	public static void main(String[] args) {
	//Creamos las variables
		int precio;
	    float precioIva;
		//Creamos el escáner
		Scanner sc = new Scanner(System.in);
		//Pedimos un precio al usuario
		System.out.println("Introduzca precio inicial:");
		// Lo leemos en consola
		precio = sc.nextInt();
		//Multiplicamos por 1,21
		precioIva = (float)(precio*1.21);
		//Lo mostramos por pantalla
		System.out.println("El precio con IVA incluido es " + precioIva);
		//Cerramos escáner
		sc.close();
		

	}

}
