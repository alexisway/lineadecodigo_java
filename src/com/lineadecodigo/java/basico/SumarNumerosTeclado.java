package com.lineadecodigo.java.basico;

import java.util.Scanner;

/**
 * @file SumarNumerosTeclado.java
 * @version 1.1
 * @author Linea de Codigo (http://lineadecodigo.com)
 * @date   29-diciembre-2008
 * @url    http://lineadecodigo.com/2009/01/22/sumar-dos-numeros-con-java/
 * @description Suma dos n�meros insertados por teclado 
 */

public class SumarNumerosTeclado {

	public static void main(String[] args) {
		
		int numero1 = 0;
		int numero2 = 0;
		int resultado;

		Scanner reader = new Scanner(System.in);
		
		System.out.println("Introduce el primer n�mero:");			
		numero1 = reader.nextInt();
			
		System.out.println("Introduce el segundo n�mero:");
		numero2 = reader.nextInt();
			
		// Sumamos
		resultado = numero1+numero2;
		
		System.out.println("La suma es " + numero1 + " + " + numero2 + " = " + resultado);
			
	}

}
