package ejercicios;

import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class Ej4 {
/*Implementa una aplicación donde ir registrando el número de veces que ha salido cada número del euromillón. 
Para ello tendrás que usar dos colecciones, una para los números y otra para las estrellas. 
Al usuario se le debe pedir que introduzca primero los 5 números y a continuación las 2 estrellas del último sorteo. 
El programa comprobará si ya se encuentra el número correspondiente en la colección, si no está, lo añadirá y le pondrá el valor 1. 
Si ya está, incrementará en 1 su valor.
Las colecciones no pueden tener repetidos y deben estar ordenadas.
*/
	public static void main(String[] args) {
		Scanner lee = new Scanner(System.in);
		TreeSet <Integer> estrellas = new TreeSet<>();
		TreeMap <Integer,Integer> numeros = new TreeMap<>();
		int numero =0;
		int estrella=0;
		int contador=1;
		int contadorTurno=5;
		int contadorTurnoEstrellas=2;
		do {
			mensaje();
			for(int i=0;i<contadorTurno;i++) {
				System.out.println("Por favor introduzca el numero de la serie: ");
				numero=lee.nextInt();
				if(numero>=1&&numero<=50) {
					if(!numeros.containsKey(numero)) {
						numeros.put(numero, numeros.get());}
				}else {
					numeros.replace(numero, contador++);
				}
			}
		for(int i=0;i<contadorTurnoEstrellas;i++) {
			System.out.println("Por favor introduzca las estrellas de la serie: ");
			estrella=lee.nextInt();
			if(estrella >=1 && estrella<=12) {
				estrellas.add(estrella);
			}
		}
		

		}while(contador<=5);
	}//fin del main
public static void mensaje() {
	System.out.println("BIENVENIDO AL REGISTRO DEL EUROMILLON (;");
	System.out.println();
}
public static void error() {
	System.err.println("Hay algun valor no valido.");
	System.err.println("Los numeros deben estar entre 1 y 50.");
	System.err.println("Las estrellas deben estar entre 1 y 12");
}
}
