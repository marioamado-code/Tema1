package parte2;

import java.util.Scanner;

public class Ejer2 {

	public static void main(String[] args) {
		// Introducimos las variables
		int num;
		int contador;
		int resto;
		// Creamos el escáner
		Scanner sc = new Scanner(System.in);
		// Pedimos al usuario el número
		System.out.println("Introduzca número entero ");
		// Leemos el número
<<<<<<< HEAD
		num = sc.nextInt();
		//Vemos si es múltiplo de 
=======
		 num = sc.nextInt();
		//Vemos si es múltiplo de 7
        resto = num % 7;
        //si el resto es 0 no se le suma nada al contador
        if (resto==0) {
        	contador = 0;
>>>>>>> branch 'master' of https://github.com/marioamado-code/Tema1.git
	}
        //Si el resto no es 0 le restamos el resto a 7
        else {
        	contador = 7-resto;
        }
        //Lo mostramos por pantalla y cerramos el escáner
        System.out.println("Debes sumar " + contador + " a " + num + " para que sea múltiplo de 7");
      sc.close();
		}
	
}
	


