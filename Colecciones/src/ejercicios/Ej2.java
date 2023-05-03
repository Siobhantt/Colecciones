package ejercicios;

import java.util.LinkedHashSet;
import java.util.Scanner;
/*Introduce por teclado, hasta que se introduzca “fin”, una serie de nombres, 
 * que se insertarán en una colección, de forma que se conserve el orden de inserción y que no puedan repetirse. 
 * Al final, la colección se mostrará por pantalla.*/
public class Ej2 {

	public static void main(String[] args) {
		//Utilizamos un linkedhashSet porque nos importa el orden de INSERCION
		LinkedHashSet <String> nombres = new LinkedHashSet<>();
		Scanner lee = new Scanner(System.in);
		String palabra=""; //aqui se van a guardar los nombres
		System.out.println("Por favor introduzca los nombres que prefiera, cuando quiera parar, escriba fin.");
		
		palabra=lee.next();
		while(!palabra.equals("fin")) {//mientras la palabra no sea fin
			nombres.add(palabra);//la añadimos a la lista
			System.out.println(nombres);
			palabra=lee.next();
		}
	lee.close();//años que no cerraba el Scanner xddd
	}
}
