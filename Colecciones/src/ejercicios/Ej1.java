package ejercicios;

import java.util.TreeSet;

public class Ej1 {

	public static void main(String[] args) {
		//numero "x"
		int numX=0;
		TreeSet <Integer> a1 = new TreeSet<>(); //Creamos un TreeSet porque nos importa la ordenacion
		//Mientras el tamaño sea distinto de 20 
		while (a1.size()!=20) {
			numX=(int)(Math.random()*100); //generamos un numero aleatorio y lo guardamos en numX
			a1.add(numX);//lo agregamos a la lista
		}
		System.out.println(a1);
	}

}
