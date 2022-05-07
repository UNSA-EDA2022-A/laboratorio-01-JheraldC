package com.example.project;

import java.util.*;

public class Exercise2 {

	public static void main(final String[] args) {

		Exercise2 obj = new Exercise2();
		Scanner sc = new Scanner(System.in);
		while (true) {

            int a [] = new int [7];
            for(int i = 0; i < 7; i++){
                int n = sc.nextInt();
                a[i] = n;
            }		
			System.out.println(obj.getMenorNumeroSaltos(a));			
		}
	}

	public Integer getMenorNumeroSaltos(int a []) {
		
		//Convertir el arreglo en un ArrayList
		 ArrayList<Integer> piedras = new ArrayList<Integer>();
		 for (int i = 0; i < a.length; i++) {
			piedras.add(a[i]);
		}
		 
		 int ult_posicion = 0, max_salto = 50, saltos = 0;
		 
		 while(true) {
			 for (int i = 0; i < piedras.size(); i++) {
				if(piedras.get(i) <= (ult_posicion + max_salto)) {} 
				else {
					ult_posicion = piedras.get(i-1);		
					if(Math.abs(piedras.get(i) - ult_posicion) <= max_salto && Math.abs(piedras.get(i) - ult_posicion) >= 0) {
						saltos++;
					} else {
						return -1;
					}
				}
			 }
			 return saltos+1;
		 }
	}
}
