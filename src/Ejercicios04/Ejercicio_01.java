package Ejercicios04;

import java.util.Scanner;

import funciones.FuncionesVectores;

public class Ejercicio_01 {

	public static void main(String[] args) {
		
		
		
		//1. Rellenar un array de tamaño N con valores enteros dados por el usuario a través del 
		//teclado.
		
		
		Scanner teclado =new Scanner(System.in);
		
		System.out.println("Introduce el tamaño del vector ");
		int numero=teclado.nextInt();
		int tamañoVector[]=new int[numero];
		FuncionesVectores.pedirVector(tamañoVector);
		System.out.println("Tu vector es ");
		FuncionesVectores.mostrarVector(tamañoVector);
		
		teclado.close();
		
		

	}

}
