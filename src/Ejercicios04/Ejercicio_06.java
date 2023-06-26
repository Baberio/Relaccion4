package Ejercicios04;

import java.util.Scanner;

import funciones.FuncionesVectores;

public class Ejercicio_06 {

	public static void main(String[] args) {
		// 6. Dado un array de enteros de tamaño N, se debe buscar el primer elemento del array 
		//mayor que un número A, y a partir de él inclusive, visualizar todos los valores de los 
		//siguientes hasta el último elemento del array
		
		Scanner teclado =new Scanner(System.in);
		
		
		System.out.println("Introduce el tamaño del vector ");
		int tamañoVector=teclado.nextInt();
		int vector[]=new int[tamañoVector ];
		
		FuncionesVectores.pedirVector(vector);
		
		System.out.println("El vector es");
		FuncionesVectores.mostrarVector(vector);
		
		System.out.println("A partir de que númerp quieres mostrar");
		int num = teclado.nextInt();
		System.out.println("Buscando y mostrando");
		FuncionesVectores.mostrarDesde(vector, num);
		teclado.close();

	}

}
