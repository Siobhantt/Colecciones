package ejercicios;

import java.util.Scanner;
import java.util.TreeSet;

public class Ej3 {

	public static void main(String[] args) {
		TreeSet <String> nombres =  new TreeSet<>();//En este caso si nos importa el criterio de ordenacion entonces usamos un TreeSet
		Scanner lee = new Scanner(System.in);
		String palabra=""; //aqui se van a guardar los nombres
		System.out.println("Por favor introduzca los nombres que prefiera, cuando quiera parar, escriba fin.");
		
		palabra=lee.next();
		while(!palabra.equalsIgnoreCase("fin")) {//mientras la palabra no sea fin
			nombres.add(palabra);//la añadimos a la lista
			System.out.println(nombres);
			palabra=lee.next();
		}
	lee.close();

	}

}
