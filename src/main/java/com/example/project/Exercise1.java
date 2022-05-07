package com.example.project;

import java.util.*;

public class Exercise1 {

	public static void main(final String[] args) {

		Exercise1 obj = new Exercise1();
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			System.out.println(obj.convertirBaseGabriel(n));			
		}
	}

	public String convertirBaseGabriel(int num) {
		
		int menos_signif = 0, resultado = 0;
		boolean es_gabriel = true;
		ArrayList<Integer> digitos = separarDigitos(num);
		
		for (int i = 0; i < digitos.size(); i++) {
			if(digitos.get(i) != 1 && digitos.get(i) != 0 && (digitos.get(i) == 2 && menos_signif == 0)) {
				es_gabriel = false;
			}
			
			if (digitos.get(i) == 1) {
				menos_signif = 1;
			}
			
			resultado += digitos.get(i)*((int) Math.pow(2, digitos.size()-i)-1);
		}
		
		if(es_gabriel == true) {
			return ""+ resultado;
		} else {
			return "El numero proporcionado no esta en base Gabriel.";
		}
		
		
	}
	
	public ArrayList<Integer> separarDigitos(int num){
		
		ArrayList<Integer> digitos = new ArrayList<Integer>();
		String num_string = Integer.toString(num);
		
		for (int i = 0; i < num_string.length(); i++) {
			digitos.add(i, num_string.charAt(i) - '0');
		}
		
		return digitos;
		
	}
}
