package parte2copia;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Introducimos las variables
		int horas;
		int minutos;
		int segundos;
		int segundosRestantes;
		// Creamos el escáner
		Scanner sc = new Scanner(System.in);
		// Pedimos al usuario el número de segundos
		System.out.println("Introduzca segundos");
		// Leemos el dato
		segundos = sc.nextInt();
		// Hacemos los cálculos
		horas = segundos / 3600;
		minutos = (segundos % 3600) / 60;
		segundosRestantes = (segundos % 3600) - minutos * 60;
		// Expresamos el resultado
		System.out.println("Los " + segundos + " segundos que pusiste equivalen a " + horas + " horas, " + minutos
				+ " minutos, y " + segundosRestantes + " segundos");
		sc.close();

	}

}
