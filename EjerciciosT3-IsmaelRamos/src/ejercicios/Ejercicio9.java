package ejercicios;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// Realiza un programa que nos diga cuántos dígitos tiene un número introducido por teclado. El número introducido debe ser mayor que 0.

		Scanner scan = new Scanner(System.in);
		int num, digitos=0;
		
		System.out.println("Introduce un número: ");
		num = scan.nextInt();
		
		if (num<=0) {
			System.out.println("El número debe ser mayor que 0");
		}
		else {
			while(num!=0){
				num = num/10;
				digitos++;
			}
			System.out.println("El numero tiene "+digitos+" dígitos");
			
		}
		
		
	}

}
