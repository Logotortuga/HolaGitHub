package tda;
import java.util.Scanner;
public class Coliseo {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		Ghost caballerito = new Ghost("Espiritu Vengativo", "Salto Desolador", "Espectros Aulladores","Corte rapido","Fuerza fragil");

		System.out.println("--- Arsenal de hechizos ---");
		System.out.println("Hechizo 1: " + caballerito.getHechizoLateral());
		System.out.println("Hechizo 2: " + caballerito.getHechizoAbajo());
		System.out.println("Hechizo 3: " + caballerito.getHechizoArriba());
		
		System.out.println("---  Amuletos equipados ---");
		System.out.println("Amuleto 1: "+ caballerito.getAmuleto1());
		System.out.println("Amuleto 2: "+ caballerito.getAmuleto2());


		// Probamos los setters - cambiamos un atributo
		System.out.println("\nAl salir del santuario de las almas...");
		caballerito.setHechizoLateral("Alma sombría");
		System.out.println("Has consumido: " + caballerito.getHechizoLateral());

		System.out.println("\nAl salir del Montículo Cristalizado...");
		caballerito.setHechizoAbajo("Oscuridad Descendente");
		System.out.println("Has consumido: " + caballerito.getHechizoAbajo());

		System.out.println("\nAl realizar Espectros Aulladores en el Abismo...");
		caballerito.setHechizoArriba("Chillido del Abismo");
		System.out.println("Has consumido: " + caballerito.getHechizoArriba());
		
		System.out.println("\nAl hacer cambios en un banco...");
		caballerito.setAmuleto1("Marca del orgullo");
		System.out.println("Has equipado: " + caballerito.getAmuleto1());
		
		caballerito.setAmuleto2("Concentración rápida");

		System.out.println("Has equipado: " + caballerito.getAmuleto2());
		
		System.out.println("Inventario: "+caballerito.toString());
		
		Ghost vasijaPura= new Ghost();
		vasijaPura.setHechizoLateral("Tentaculos del vacío");
		vasijaPura.setHechizoAbajo("Estocada prominente");
		vasijaPura.setHechizoArriba("Espadas ascendentes");
		vasijaPura.setAmuleto1("Alma del monarca");
		vasijaPura.setAmuleto2("Marca del orgullo");
		
		System.out.println("\n\nContrincante: Vasija Pura");
		System.out.println("Inventario del contrincante: "+vasijaPura.toString());

	}
}