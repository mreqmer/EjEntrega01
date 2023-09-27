package ejentrega01;
import java.util.Scanner;
public class ejercicio4 {

	public static void main(String[] args) {
		// Variables
		Scanner sc = new Scanner(System.in); //Scanner
		double b; //base del triangulo dada por el usuario
		double h; //altura del triangulo dada por el usuario
		double a; //area del triangulo que se calculara despues
		//Pedir datos de base y altura al usuario
		System.out.println("Introduce la base: "); //Pedir base
		b = sc.nextDouble();//Escanear base
		System.out.println("Introduce la altura: ");//Pedir altura
		h = sc.nextDouble();//Escanear altura
		//Calculo del area del triangulo
		a = (b*h) / 2;
		//Devolver resultado al usuario
		System.out.println("El area del triángulo es: " + a);
		sc.close(); //cerrar escaner

	}

}
