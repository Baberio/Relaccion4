package funciones;

import java.util.Scanner;

public class FuncionesVectores {

	
//	public static int[] pedirVector(int num) {
//		int[] vector = new int[num];
//		Scanner teclado = new Scanner(System.in);
//		for(int i=0;i<vector.length;i++) {
//			System.out.printf("Introduce el elemento %d: ",i+1);
//			vector[i]=teclado.nextInt();
//		}
//		return vector;
//	}
//	
//	public static int[] pedirVector() {
//		return pedirVector(10);
//	}
	
	/* no se puede sobrecargar si sólo cambia en el parametro de devolución
	public static double[] pedirVectorDouble(int num) {
		double[] vector = new double[num];
		Scanner teclado = new Scanner(System.in);
		for(int i=0;i<vector.length;i++) {
			System.out.printf("Introduce el elemento %d: ",i+1);
			vector[i]=teclado.nextDouble();
		}
		return vector;
	}*/
	
	public static void pedirVector(int [] vector) {
		Scanner teclado = new Scanner(System.in);
		for(int i=0;i<vector.length;i++) {
			System.out.printf("Introduce el elemento %d: ",i+1);
			vector[i]=teclado.nextInt();
		}
	}
	public static void pedirVector(double[] vector) {
		Scanner teclado = new Scanner(System.in);
		for(int i=0;i<vector.length;i++) {
			System.out.printf("Introduce el elemento %d: ",i+1);
			vector[i]=teclado.nextDouble();
		}
		
	}
	
	public static void mostrarVector(int vector[]) {
		for (int i = 0; i < vector.length; i++) {
			System.out.printf("%d ",vector[i]);
		}
		System.out.println();
	}
	
	public static void mostrarVector(double vector[]) {
		for (int i = 0; i < vector.length; i++) {
			System.out.printf("%.2f ",vector[i]);
		}
		System.out.println();
	}
	
	
	public static int cuentaPositivos(int vector[]) {
		int contador=0;
		for (int i=0;i<vector.length;i++) {
			if (vector[i]>0) contador++;
		}
		return contador;
	}

	/**
	 * Función que calcula la media de los elementos de un vector
	 * @param vector double[] con los datos cuya media se quiere calcular
	 * @return double con la media de los elementos del vector
	 */
	public static double media(double[] vector) {
		double suma = 0;
		for (int i = 0; i < vector.length; i++) {
			suma = suma+vector[i];
		}
		return suma/vector.length;
	}

	
	public static void menor(int[] vector,int menor) {
		for (int i = 0; i < vector.length; i++) {
			if (menor>vector[i]){
				System.out.print(vector[i]+" ");
			}
		}
	}

	public static void entre(double[] vector,double a, double b) {
		for(int i = 0; i<vector.length; i++) {
			if (vector[i]>=a && vector[i]<b || vector[i]>=b && vector[i]<a)
				System.out.print(vector[i]+" ");
		}
	}

	



	public static void rotarIzq(int[] vector) {
		 int aux=vector[0];
		for(int i = 0; i<vector.length-1; i++) {
			vector[i]=vector[i+1];
		}
		vector[vector.length-1]=aux;
			
		}
	


	public static void rotarDerecha(int[] vector) {
		int aux=vector[vector.length-1];
		for (int i=vector.length-1; i>0; i--) {
			vector[i]=vector[i-1];
		}
		vector[0]=aux;
	}


		



	public static void mostrarDesde(int vector[], int auxiliar) {
		boolean encontrado=false;
		//int pos=vector.length;
		int i=0;
		for (i = 0; i < vector.length; i++) {
			if(vector[i]==auxiliar) {
				break;
			}
		}
		for (int j=i;j<vector.length;j++) {
			System.out.print(vector[j]+ " ");
		}
	}



	public static boolean sonParalelos(int vector[], int vector2[]) {
		boolean paralelo=true;
		if (vector.length!=vector2.length) {
			return false;
		}
		double factor=vector[0]/(double)vector[0];
		for(int i=1;i< vector.length && paralelo==true; i++) {
			if (vector[i]/(double)vector2[i]!=factor) {
				paralelo=false;
			}
		}
		return paralelo;
	}

	public static boolean esCapicua(int vector[]) {
		boolean capicua=true;
		for(int i=0; i<vector.length/2 && capicua==true; i++) {
			if (vector[i]!=vector[vector.length-1-i]) {
				capicua=false;				
			}
		}
		return capicua;
	}
	
/*	Esta es otra forma de ahcer lo mismo que el de arriba pero mas sencilla
 * 
 * public static boolean esCapicua(int vector[]) {
	boolean capicua=true;
	for(int i=0, j=vector.length-1; i<j; i++ , j--) {
		if (vector[i]!=vector[j]) {
			capicua=false;
	}
	}
	return capicua;
	} */
	

	
}


