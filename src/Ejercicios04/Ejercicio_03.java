package Ejercicios04;

import java.util.Scanner;

import funciones.FuncionesVectores;

public class Ejercicio_03 {

	public static void main(String[] args) {
		// 3. Dado un array de reales del tamaño N, visualizar por pantalla todos los elementos del 
		//mismo cuyo valor pertenezca al intervalo [a,b).
		
		Scanner teclado =new Scanner(System.in);
		
		
		System.out.println("Introduce el tamaño del vector ");
		int tamañoVector=teclado.nextInt();
		double vector[]=new double[tamañoVector ];
		FuncionesVectores.pedirVector(vector);
		
		System.out.println("Introduce el primer numero");
		double num1=teclado.nextDouble();
		System.out.println("Introduce el segundo numero");
		double num2=teclado.nextDouble();
		System.out.println("Los numeros entre "+num1+" y "+num2+" son ");
		FuncionesVectores.entre(vector, num1, num2);
		
		
		teclado.close();
		
		
		
		
		
		

	}

}
