package ejentrega01;

import java.util.Scanner;

public class ejercicio5 {

	public static void main(String[] args) {
		// Variables
		Scanner sc = new Scanner(System.in); //Scanner
		// y=ax^2+bx+c
		double a; //Variable que recoge numero a
		double b;//variable que recoge numero b
		double c;//variable que recoge numero c
		double x;//variable que recoge numero x
		double y;// variable se calculará a partir de los numeros a b c
		//Pedir datos al usuario
		System.out.println("Introduce en el siguiente orden los números a, b, c y x para calcular y");
		a = sc.nextDouble();//recoge el numero a
		b = sc.nextDouble();//recoge el numero b
		c = sc.nextDouble();//recoge el numero c
		x = sc.nextDouble();//recoge el numero x
		//Calculos delñ polinomio
		y = a * (Math.pow(x, 2)) + (b * x) + c; 
		//Devolver datos al usuario
		System.out.println("y equivale a: " + y);
		sc.close();
	}

}
