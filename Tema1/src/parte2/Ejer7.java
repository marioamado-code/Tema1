package parte2;

import java.util.Scanner;

public class Ejer7 {

	public static void main(String[] args) {
	//Introducuimos la variable del número de entradas infantiles y de adulto
		int entradasInf;
		int entradasAdu;
		//Introducimos la variable precio
		double precio;
		
		//Introducimos las constantes de los precios por adulto y por infantil
		final double ADULTO = 20;
		final double INFANTIL = 15.5;
		//Creamos el escáner
		Scanner sc = new Scanner(System.in);
		//Pedimos el número de entradas infantiles
System.out.println("Introduzca número de entradas infantiles: ");
//Lo leemos por pantalla
entradasInf = sc.nextInt();
//Pedimos el número de entradas adulto
System.out.println("Introduzca número de entradas de adulto: ");
//Lo leemos por pantalla
entradasAdu = sc.nextInt();
//Calculamos el precio
precio =( ADULTO*entradasAdu + INFANTIL*entradasInf);
//Si el precio es mayor a 100 se le hace el descuento
 precio = precio>=100 ? precio*0.95 : precio;
 //Imprimimos por pantalla
 System.out.println("El precio es de " + precio + " euros");
 //Cerramos el escáner
 sc.close();
	}

}