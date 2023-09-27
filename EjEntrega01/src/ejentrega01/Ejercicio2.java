package ejentrega01;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Variables
		Scanner sc = new Scanner(System.in); //Scanner
		int numero; //numero dado por el ususario
		int resta; // restará 7 al modulo del numero / 7
		int multiplo; //guardará el calculo del modulo del numero / 7
		//Pedir numero al usuario
		System.out.println("Introduce un número para convertirlo en múltiplo de 7:");
		numero = sc.nextInt(); //recogida del numero
		//Calculo para convertirlo en multiplo de 7
		multiplo =( numero % 7);
		resta = 7 - multiplo;
		//Ternario para que si no es multiplo de 7 realice la variable resta
		String multiploCalc =(numero%7==0) ? "Su número ya es múltiplo de 7" : "Para que su número sea múltiplo de 7 hay que sumar " + resta ;
		System.out.println(multiploCalc);
		sc.close();
		
		
	}

}
