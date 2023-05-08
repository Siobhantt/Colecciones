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
		TreeMap <Integer,Integer> estrellas = new TreeMap<>();
		TreeMap <Integer,Integer> numeros = new TreeMap<>();
		int numero =0;

		int estrella=0;
		int turnoN=5;
		int turnoE=2;
		String opcion=""; 
		
		do {
			for(int i=0;i<turnoN;i++) {
			System.out.println("Por favor introduzca uno de los numeros que ha obtenido: ");
			numero = lee.nextInt();
			lee.nextLine();
			if(numero>=1 && numero<=50) {
			 if(!numeros.containsKey(numero)){
				numeros.put(numero, 1);
			}else {
				numeros.replace(numero, numeros.get(numero)+1);
			}
			}else {
				System.out.println("El valor que intenta introducir no esta entre los aceptados.");
			}
			
			}//fin del for
			System.out.println("El mapa de los numeros " + numeros);
			
			for(int i=0;i<turnoE;i++) {
				System.out.println("Por favor introduzca una de las estrellas que ha obtenido: ");
				estrella = lee.nextInt();
				lee.nextLine();
				if(estrella>=1 && estrella<=12) {
					 if(!estrellas.containsKey(estrella)){
						 estrellas.put(estrella, 1);
					}else {
						estrellas.replace(estrella, estrellas.get(estrella) +1);
					}
					}else {
						System.out.println("El valor que intenta introducir no esta entre los aceptados.");
					}
			}//fin del for
			
			numero =0;
			estrella = 0;
			
			System.out.println("Desea introducir otra serie? s/n");
			opcion = lee.nextLine();
		}while(opcion.equalsIgnoreCase("s"));
		
		System.out.println("Los valores de los numeros introducidos son: ");
		System.out.println(numeros);
		System.out.println("Los valores de las estrellas introducidos son: ");
		System.out.println(estrellas);
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
