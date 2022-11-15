package ejercicios;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		/* Realiza un programa que lea y acepte únicamente aquellos que sean mayores que el último dado. 
		 * La introducción de números finaliza con la introducción de un 0. Al final se mostrará:
		 * El total de números introducidos, excluido el 0.
		 * El total de números fallados.
		 */
		
		// variables
		Scanner scan = new Scanner (System.in); // iniciar escaner
		int inicial, num, fallos = 0, introducidos = 0; // numero inicial, numeros que se van introduciendo, total fallados y total introducidos
		
		// pedir datos
		System.out.println("Introduce un número inicial: "); //pedir numero inicial
		inicial = scan.nextInt(); // guardar numero inicial
		
		do {
			System.out.println("Introduce un número: ");
			num = scan.nextInt();
			if (num>inicial && num!=0) {
				introducidos++;
			}
			else if (num<=inicial && num!=0) {
				System.out.println("El número es menor que el incial");
				fallos++;
				introducidos++;
			}
			inicial=num;
			
		} while (num!=0);
		
		introducidos= introducidos+1;
		
		System.out.println("Numero de fallos: "+fallos);
		System.out.println("Cantidad de numeros introducidos: "+introducidos);
		
		// cerrar escaner
		scan.close();


	}

}
