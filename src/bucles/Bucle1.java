package bucles;

import java.util.Scanner;

public class Bucle1 {

	public static void main(String[] args) {
		Scanner skibidi = new Scanner(System.in);
		System.out.println("-----------------LINEA-----------------");
		int n = skibidi.nextInt();
		System.out.println("-----------------CON FOR-----------------\n\n");

		for (int i = 0; i < n; i++) {
			System.out.print("* ");
		}

		System.out.println("\n\n-----------------CON WHILE-----------------\n\n");

		int i = 0;
		while (i < n) {
			System.out.print("* ");
			i++;
		}

		System.out.println("\n\n-----------------CON DO WHILE-----------------\n\n");
		i = 0;
		do {
			System.out.print("* ");
			i++;
		} while (i < n);

		System.out.println("\n\n-----------------CUADRO-----------------\n\n");
		System.out.println("-----------------CON FOR-----------------\n\n");
		int a = skibidi.nextInt();
		for (i = 0; i < a; i++) {
			for (int j = 0; j < a; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}

		System.out.println("\n\n-----------------CON WHILE-----------------\n\n");
		i = 0;
		int j = 0;
		while (i < a) {
			j = 0;
			while (j < a) {
				System.out.print("* ");
				j++;
			}
			System.out.println("");
			i++;

		}
		System.out.println("\n\n-----------------RECTANGULO-----------------");
		int ancho = skibidi.nextInt();
		int alto = skibidi.nextInt();
		for (i = 0; i < alto; i++) {// filas
			for (j = 0; j < ancho; j++) {// columnas
				System.out.print("* ");
			}
			System.out.println("");
		}

		System.out.println("\n\n-----------------TRIANGULO 1-----------------");
		alto = skibidi.nextInt();
		for (i = 0; i < alto; i++) {// filas
			for (j = 0; j < i + 1; j++) {// columnas
				System.out.print("* ");
			}
			System.out.println("");
		}
		System.out.println("\n\n-----------------TRIANGULO 2-----------------");
		alto = skibidi.nextInt();
		for (i = 0; i < alto; i++) {// filas
			for (j = 0; j < alto - i - 1; j++) {// columnas
				System.out.print(" ");
			}
			for (j = 0; j < i + 1; j++) {// columnas
				System.out.print("* ");
			}
			System.out.println("");
		}
		System.out.println("\n\n-----------------CUADRO CONTORNO-----------------");
		int lado = skibidi.nextInt();
		for (i = 0; i < lado; i++) {
			System.out.print("* ");
		}
		System.out.println("");
		for (i = 0; i < lado - 2; i++) {// filas
			System.out.print("* ");
			for (j = 0; j < lado - 2; j++) {// columnas
				System.out.print("  ");
			}
			System.out.println("*");
		}

		for (i = 0; i < lado; i++) {
			System.out.print("* ");
		}
		System.out.println("\n\n-----------------ROMBO-----------------");
		int r = skibidi.nextInt();

		// Arriba
		for (i = 0; i < r; i++) {
			for (j = 0; j < r - i - 1; j++) {
				System.out.print("  ");
			}
			for (j = 0; j < 2 * i + 1; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		// Abajo
		for (i = r - 2; i >= 0; i--) {
			for (j = 0; j < r - i - 1; j++) {
				System.out.print("  ");
			}
			for (j = 0; j < 2 * i + 1; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		System.out.println("\n\n-----------------ROMBO CONTORNO-----------------");
		int ladoHueco = skibidi.nextInt();

		// Parte de arriba
		for (i = 0; i < ladoHueco; i++) {
			for (j = 0; j < ladoHueco - i - 1; j++) {
				System.out.print("  ");
			}
			for (j = 0; j < 2 * i + 1; j++) {
				if (j == 0 || j == 2 * i) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println("");
		}
		// Parte de abajo
		for (i = ladoHueco - 2; i >= 0; i--) {
			for (j = 0; j < ladoHueco - i - 1; j++) {
				System.out.print("  ");
			}
			for (j = 0; j < 2 * i + 1; j++) {
				if (j == 0 || j == 2 * i) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println("");
		}
	}
}