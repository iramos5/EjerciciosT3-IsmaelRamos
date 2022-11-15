package ejercicios;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		/* Escribe un programa que incremente la hora de un reloj. Se pedirán por teclado:
		Hora
		Minutos
		Segundos
		Cantidad de segundos a incrementar
		La aplicación debe mostrar la nueva hora. Por ejemplo, si el usuario introduce hora=13, minutos=59 y segundos=51, y se desea incrementar en 10 segundos, el resultado a mostrar es 14:00:01.
		*/
		
		// variables
		Scanner scan = new Scanner (System.in); // abrir escáner
		int horas, minutos, segundos, segundosIncr; // horas son horas, minutos son minutos, segundos son segundos y segundosIncr son los segundos que incrementamos.
		
		// pedir datos
		System.out.println("Introduce las horas: "); // pedir horas
		horas = scan.nextInt(); // guardar horas
		System.out.println("Introduce los minutos: "); // pedir minutos
		minutos = scan.nextInt(); // guardar minutos
		System.out.println("Introduce los segundos: "); // pedir segundos
		segundos = scan.nextInt(); // guardar segundos
		System.out.println("Introduce los segundos que quieres incrementar: "); //pedir segundos a incrementar
		segundosIncr = scan.nextInt(); // guardar segundos a incrementar
		
		// aumentar segundos
		segundos = segundos + segundosIncr; // incrementar los segundos
		
		
		
		
		// resultado
		System.out.println("Son las "+horas+":"+minutos+":"+segundos);
		
		// cerrar escáner
		scan.close();

	}

}
