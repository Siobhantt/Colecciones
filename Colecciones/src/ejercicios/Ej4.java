package ejercicios;

import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class Ej4 {
	/*
	 * Implementa una aplicación donde ir registrando el número de veces que ha
	 * salido cada número del euromillón. Para ello tendrás que usar dos
	 * colecciones, una para los números y otra para las estrellas. Al usuario se le
	 * debe pedir que introduzca primero los 5 números y a continuación las 2
	 * estrellas del último sorteo. El programa comprobará si ya se encuentra el
	 * número correspondiente en la colección, si no está, lo añadirá y le pondrá el
	 * valor 1. Si ya está, incrementará en 1 su valor. Las colecciones no pueden
	 * tener repetidos y deben estar ordenadas.
	 */
	public static void main(String[] args) {
		Scanner lee = new Scanner(System.in);
		TreeMap<Integer, Integer> estrellas = new TreeMap<>();
		TreeMap<Integer, Integer> numeros = new TreeMap<>();
		int numero = 0; //El numero que leerá el usuario
		int estrella = 0;//la estrella que introducirá el usuatio
		int turnoN = 5; //la cantidad de numeros totales a introducir
		int turnoE = 2;//la cantidad de estrellas totales a introducir
		String opcion = ""; //opcion para saber si continuar

		do {
			// Establecemos que el turno de lo numero sea 5 porque se deben introducir 5
			// numeros del 1 al 50
			for (int i = 0; i < turnoN; i++) {
				//dentro del for de 5 turnos haremos un bucle para que solo avance a la siguiente parte del for en el momento en que los valores
				//sean correctos
				do {
					System.out.println("Por favor introduzca uno de los numeros que ha obtenido: ");
					numero = lee.nextInt();
					lee.nextLine();
				} while (numero < 1 || numero > 50);

				if (!numeros.containsKey(numero)) { // si el mapa no contiene el numero introducidos
					numeros.put(numero, 1); // lo agregamos con el valor a 1
				} else {
					numeros.replace(numero, numeros.get(numero) + 1);// en caso de que si este, modificamos el valor
																		// y le añadimos 1
				}
			} // fin del for

			System.out.println();
			for (int i = 0; i < turnoE; i++) {
				do {
					System.out.println("Por favor introduzca una de las estrellas que ha obtenido: ");
					estrella = lee.nextInt();// leemos el numero de la estrella
					lee.nextLine();// para que no se vuelva loco esto
				} while (estrella < 1 || estrella > 12);

				if (!estrellas.containsKey(estrella)) {// y si no esta en el mapa
					estrellas.put(estrella, 1);// lo insertamos y el valor lo colocamos a 1
				} else {
					System.out.println("El valor que intenta introducir no esta entre los aceptados.");
				}

			} // fin del for
				// =============================Reiniciamos los valores para la siguiente vuelta
			numero = 0;
			estrella = 0;
			System.out.println();
			System.out.println("Desea introducir otra serie? s/n");
			opcion = lee.nextLine();
		} while (opcion.equalsIgnoreCase("s"));
		// imprimimos ambos mapas
		System.out.println("Los valores de los numeros introducidos son: ");
		System.out.println(numeros);
		System.out.println("Los valores de las estrellas introducidos son: ");
		System.out.println(estrellas);
	}// fin del main

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
