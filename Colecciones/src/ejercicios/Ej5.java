package ejercicios;

import java.util.HashMap;
import java.util.Scanner;

public class Ej5 {
	static Scanner lee = new Scanner(System.in);
static HashMap <String, Double> productos = new HashMap<>(); 
	public static void main(String[] args) {
		
		//Tengo que acordarme que los tipos que se le pongan a las listas y mapas deben empezar en mayuscula
		
		String nombre="";
		double precioP=0;
		int opc=0;
		
		do {
		menu();
		opc=lee.nextInt();
		switch(opc) {
		case 1:
			añadir(nombre, precioP);
			break;
		case 2:
			quitar(nombre);
			break;
		case 3:
		listado();
			break;
		case 0:
			adios();
			break;	
		default:
			System.out.println("Opcion no contemplada");
			break;	
		}
		}while(opc!=0);
	}
public static void menu() {
	System.out.println("Seleccione la opcion que prefiera.");
	System.out.println("");
	
	System.out.println("1.Alta del producto.");
	System.out.println("2.Baja del producto.");
	System.out.println("3.Lista de existencias.");
	System.out.println("0.Salir.");
}
public static void añadir(String nombre, double precio) {
	System.out.println("Por favor introduzca el nombre del producto al que quiere dar de alta.");
	nombre = lee.next();
	System.out.println("Por favor introduzca el precio del producto.");
	precio=lee.nextDouble();
	productos.put(nombre, precio);
	System.out.println();
}

public static void quitar(String nombre) {
	System.out.println("Por favor introduzca el nombre del producto que desea retirar.");
	nombre = lee.next();
	productos.remove(nombre);
	System.out.println();
}
public static void listado() {
	System.out.println();
	System.out.println("Los productos hasta ahora registrados.");
	System.out.println(productos);
	System.out.println();
}
public static void adios() {
	System.out.println("Hasta luego!!");
}
}
