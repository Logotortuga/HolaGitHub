package bucles;

import java.util.Scanner;

public class Pruebas {

	public static void main(String[] args) {

		Scanner skibidi = new Scanner(System.in);
		int opcion;

		do {
			System.out.println("\n\n----------------- MENU -----------------");
			System.out.println("1. Linea (for, while, do while)");
			System.out.println("2. Cuadro");
			System.out.println("3. Rectangulo");
			System.out.println("4. Triangulo 1");
			System.out.println("5. Triangulo 2");
			System.out.println("6. Cuadro Contorno");
			System.out.println("7. Rombo");
			System.out.println("8. Rombo Contorno");
			System.out.println("9. Flecha");
			System.out.println("10. Arbolito de navidad");

			System.out.println("0. Salir");
			System.out.print("Elige: ");
			opcion = skibidi.nextInt();

			switch (opcion) {
			case 1:
				System.out.println("-----------------LINEA-----------------");
			System.out.println("Ingresa la longitud que quieres que tenga tu linea");	
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
				break;

			case 2:
				System.out.println("\n\n-----------------CUADRO-----------------\n\n");
				System.out.println("-----------------CON FOR-----------------\n\n");
				System.out.println("Ingresa el valor de uno de los lados");
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
				break;

			case 3:
				System.out.println("\n\n-----------------RECTANGULO-----------------");
				System.out.println("Ingresa ancho");
				int ancho = skibidi.nextInt();
				System.out.println("Ingresa altura");

				int alto = skibidi.nextInt();
				for (i = 0; i < alto; i++) {
					for (j = 0; j < ancho; j++) {
						System.out.print("* ");
					}
					System.out.println("");
				}
				break;

			case 4:
				System.out.println("\n\n-----------------TRIANGULO 1-----------------");
				System.out.println("Ingresa la medida de uno de los lados");
				alto = skibidi.nextInt();
				for (i = 0; i < alto; i++) {
					for (j = 0; j < i + 1; j++) {
						System.out.print("* ");
					}
					System.out.println("");
				}
				break;

			case 5:
				System.out.println("\n\n-----------------TRIANGULO 2-----------------");
				System.out.println("Ingresa la medida de uno de los lados");

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
				break;

			case 6:
				System.out.println("\n\n-----------------CUADRO CONTORNO-----------------");
				System.out.println("Ingresa el valor de uno de los lados");

				int lado = skibidi.nextInt();
				for (i = 0; i < lado; i++) {
					System.out.print("* ");
				}
				System.out.println("");
				for (i = 0; i < lado - 2; i++) {
					System.out.print("* ");
					for (j = 0; j < lado - 2; j++) {
						System.out.print("  ");
					}
					System.out.println("*");
				}
				for (i = 0; i < lado; i++) {
					System.out.print("* ");
				}
				break;

			case 7:
				System.out.println("\n\n-----------------ROMBO-----------------");
				System.out.println("Ingresa el valor de uno de los lados");

				int r = skibidi.nextInt();
				for (i = 0; i < r; i++) {
					for (j = 0; j < r - i - 1; j++) {
						System.out.print("  ");
					}
					for (j = 0; j < 2 * i + 1; j++) {
						System.out.print("* ");
					}
					System.out.println("");
				}
				for (i = r - 2; i >= 0; i--) {
					for (j = 0; j < r - i - 1; j++) {
						System.out.print("  ");
					}
					for (j = 0; j < 2 * i + 1; j++) {
						System.out.print("* ");
					}
					System.out.println("");
				}
				break;

			case 8:
				System.out.println("\n\n-----------------ROMBO CONTORNO-----------------");
				System.out.println("Ingresa el valor de uno de los lados");

				int ladoHueco = skibidi.nextInt();
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
				break;
			case 9:
				System.out.println("\n\n-------- FLECHA ---------------");
				// ARRIBA
				System.out.println("Ingresa la medida deseada");

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
				for (i = 0; i < alto; i++) {// filas
					for (j = 0; j < alto / 3; j++) {// columnas
						System.out.print("  ");
					}
					for (j = 0; j < alto / 3 + 1; j++) {// columnas
						System.out.print("* ");
					}
					System.out.println("");
				}
				break;
			case 10:
				System.out.println("\n\n-------- ARBOLITO ---------------");

				// ARRIBA
				System.out.println("Ingresa la medida del tronco");

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
				for (i = 0; i < alto; i++) {// filas
					for (j = 0; j < alto - i - 1; j++) {// columnas
						System.out.print(" ");
					}
					for (j = 0; j < i + 1; j++) {// columnas
						System.out.print("* ");
					}
					System.out.println("");
				}
				for (i = 0; i < alto; i++) {// filas
					for (j = 0; j < alto - i - 1; j++) {// columnas
						System.out.print(" ");
					}
					for (j = 0; j < i + 1; j++) {// columnas
						System.out.print("* ");
					}
					System.out.println("");
				}
				for (i = 0; i < alto; i++) {// filas
					for (j = 0; j < alto / 3; j++) {// columnas
						System.out.print("  ");
					}
					for (j = 0; j < alto / 3 + 1; j++) {// columnas
						System.out.print("* ");
					}
					System.out.println("");
				}
				break;
			case 0:
				System.out.println("ADIÓS");
				break;

			default:
				System.out.println("Opcion no valida");
				break;
			}
		} while (opcion != 0);

		skibidi.close();
	}

}
