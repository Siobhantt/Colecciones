package ejercicios;

import java.util.HashMap;
import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		Scanner lee = new Scanner(System.in);
		//Tengo que acordarme que los tipos que se le pongan a las listas y mapas deben empezar en mayuscula
		HashMap <String, Double> productos = new HashMap<>(); 
		String nombre="";
		double precioP=0;
		int opc=0;
		
		do {
		menu();
		opc=lee.nextInt();
		switch(opc) {
		case 1:
			
			break;
		case 2:
			break;
		case 3:
			break;
		case 0:
			break;	
		default:
			System.out.println("Opcion no contemplada");
			break;	
		}
		}while(opc!=0);
	}
public static void menu() {
	System.out.println("/////////////////////////////////////////////////////////////");
	System.out.println("||                               PRODUCTOS                            ||");
	
	System.out.println("1.Alta del producto.");
	System.out.println("2.Baja del producto.");
	System.out.println("3.Lista de existencias.");
	System.out.println("0.Salir.");
}

}
