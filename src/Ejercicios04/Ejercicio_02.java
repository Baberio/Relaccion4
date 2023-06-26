package Ejercicios04;

import java.util.Scanner;

import funciones.FuncionesVectores;

public class Ejercicio_02 {

	public static void main(String[] args) {
		// 2. Dado un array de enteros de tamaño N, visualizar por pantalla todos los elementos del 
		//mismo cuyo valor sea menor que un número A. 
		
		Scanner teclado =new Scanner(System.in);
		
		
		System.out.println("Introduce el tamaño del vector ");
		int tamañoVector=teclado.nextInt();
		int vector[]=new int[tamañoVector];
		FuncionesVectores.pedirVector(vector);
		System.out.println("Introduce un numero para comparar ");
		int num2=teclado.nextInt();
		System.out.println("Los numeros menor que "+num2+ " son");
		FuncionesVectores.menor(vector, num2);
		
		teclado.close();
		
		
		

	}

}
