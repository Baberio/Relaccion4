package Ejercicios04;

import java.util.Scanner;

import funciones.FuncionesVectores;

public class Ejercicio_07 {

	public static void main(String[] args) {
		// 7. Dados dos arrays de reales de tamaño N, suponiendo que modelan dos vectores de un 
		//espacio N-dimensional, decir si son paralelos o no. Son paralelos si todos sus valores 
		//son proporcionales
		
		Scanner teclado =new Scanner(System.in);
		
		
		System.out.println("Introduce el tamaño del vector 1");
		int tamañoVector=teclado.nextInt();
		int vector[]=new int[tamañoVector ];
		int vector2[]=new int[tamañoVector];
		FuncionesVectores.pedirVector(vector);
		FuncionesVectores.pedirVector(vector2);
		
		System.out.println("El vector 1 es");
		FuncionesVectores.mostrarVector(vector);
		
		System.out.println("El vector 2 es");
		FuncionesVectores.mostrarVector(vector2);
		
		FuncionesVectores.sonParalelos(vector, vector2);
		if (FuncionesVectores.sonParalelos(vector, vector2)) {
			System.out.println("Son paralelos");
		}
		else {
			System.out.println("No son paralelos");
		}
		teclado.close();
	}
		
		
		
		
	}


