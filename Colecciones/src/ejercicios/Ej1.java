package ejercicios;

import java.util.TreeSet;

public class Ej1 {

	public static void main(String[] args) {
		
		int numX=0;
		TreeSet <Integer> a1 = new TreeSet<>();
		
		while (a1.size()!=20) {
			numX=(int)(Math.random()*100);
			a1.add(numX);
		}
		
		System.out.println(a1);
	}

}
