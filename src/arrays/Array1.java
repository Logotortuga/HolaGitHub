package arrays;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int suma = 0, sumaPares = 0, sumaImpares = 0;
		System.out.println("Dame el tamaño del array");
		int n = in.nextInt();
		long multi = 1;
		int array1[] = new int[n];
		for (int i = 0; i < array1.length; i++) {
			array1[i] = in.nextInt();
		}
		for (int i = 0; i < array1.length; i++) {
			System.out.println("array1[" + i + "] => " + array1[i]);
			suma += array1[i];
			multi *= array1[i];
			if (array1[i] % 2 == 0)
				sumaPares += array1[i];
			if (array1[i] % 2 == 1)
				sumaImpares += array1[i];
		}
		System.out.println("SUMA => " + suma);
		System.out.println("MULTI => " + multi);
		for (int i = 0; i < array1.length - 1; i++) {
			for (int j = 0; j < array1.length - 1 - i; j++) {
				if (array1[j] > array1[j + 1]) {
					int temp = array1[j];
					array1[j] = array1[j + 1];
					array1[j + 1] = temp;
				}
			}
		}
		System.out.println("ARRAY ORDENADO DE MENOR A MAYOR");
		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + " ");
		}
		System.out.println("\nARRAY ORDENADO DE MAYOR A MENOR");
		for (int i = array1.length - 1; i >= 0; i--) {
			System.out.print(array1[i] + " ");
		}
		System.out.println("\nMAYOR => " + array1[array1.length - 1]);
		System.out.println("MENOR => " + array1[0]);
		System.out.println("SUMA DE LOS NUMEROS PARES => " + sumaPares);
		System.out.println("SUMA DE LOS NUMEROS IMPARES => " + sumaImpares);
	}
}