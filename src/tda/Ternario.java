package tda;

import java.util.Scanner;

public class Ternario {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println(" SIGNO DEL ZODIACO");
		System.out.println("dia");
		int dia = in.nextInt();
		System.out.println("mes");
		int mes = in.nextInt();
		String signo = "";
		switch (mes) {
		case 1:
			signo = dia >= 20 ? "Acuario" : "Capricornio";
			break;
		case 2:
			signo = dia >= 19 ? "Piscis" : "Acuario";
			break;
		case 3:
			signo = dia >= 21 ? "Aries" : "Piscis";
			break;
		case 4:
			signo = dia >= 20 ? "Tauro" : "Aries";
			break;
		case 5:
			signo = dia >= 21 ? "Geminis" : "Tauro";
			break;
		case 6:
			signo = dia >= 21 ? "Cancer" : "Geminis";
			break;
		case 7:
			signo = dia >= 23 ? "Leo" : "Cancer";
			break;
		case 8:
			signo = dia >= 23 ? "Virgo" : "Leo";
			break;
		case 9:
			signo = dia >= 23 ? "Libra" : "Virgo";
			break;
		case 10:
			signo = dia >= 23 ? "Escorpio" : "Libra";
			break;
		case 11:
			signo = dia >= 22 ? "Sagitario" : "Escorpio";
			break;
		case 12:
			signo = dia >= 22 ? "Capricornio" : "Sagitario";
			break;
		default:
			break;
		}
		System.out.println("TU SIGNO ES => " + signo);
	}
}
