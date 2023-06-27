package Ejercicios04;

import java.util.Scanner;

import funciones.FuncionesVectores;

public class Ejercicio_08 {

	public static void main(String[] args) {
		// 8. Dado un array de enteros de tamaño N, decir si es capicúa o no, es decir, si por 
		//ejemplo el array es: 5 2 1 2 5, el resultado debe ser “verdad”(se debe tener en cuenta 
		//	que el tamaño el array puede ser par o impar).
		
		
		Scanner teclado =new Scanner(System.in);
		
		
		System.out.println("Introduce el tamaño del vector ");
		int tamañoVector=teclado.nextInt();
		int vector[]=new int[tamañoVector ];
		FuncionesVectores.pedirVector(vector);
		
		if(FuncionesVectores.esCapicua(vector)) {
			System.out.println("Es capicua");
		}
		else {
			System.out.println("No es capicua");
		}
		
		teclado.close();
	}

}
