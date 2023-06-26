package Ejercicios04;

import java.util.Scanner;

import funciones.FuncionesVectores;

public class Ejercicio_05 {

	public static void main(String[] args) {
		//5. Dado un array de enteros de tamaño N, rotar sus valores una posición a la derecha, es 
		//decir, si tenemos un array como el siguiente: 5 -1 -3 15 4, el resultado deberá ser el 
		//array rotado a la derecha: 4 5 -1 -3 15.

		
		
		
		Scanner teclado =new Scanner(System.in);
		
		
		
		System.out.println("Introduce el tamaño del vector ");
		int tamañoVector=teclado.nextInt();
		int vector[]=new int[tamañoVector ];
		
		FuncionesVectores.pedirVector(vector);
		
		System.out.println("El vector es");
		FuncionesVectores.mostrarVector(vector);
		
		System.out.println("Rotando ....");
		FuncionesVectores.rotarDerecha(vector);
		
		System.out.println("El vector es");
		FuncionesVectores.mostrarVector(vector);
		
		teclado.close();
	}

}
