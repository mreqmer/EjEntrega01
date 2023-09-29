package ejentrega01;

import java.util.Scanner;

public class Ejercicio003 {

	public static void main(String[] args) {
		// Variables
		Scanner sc = new Scanner(System.in); //Scanner
		int numero1; //numero dado por el usuario para que sea multiplo de numero2
		int numero2;//numero que se usará como multiplo
		int resta; // restará a numero2 al modulo del numero / numero2
		int multiplo; //guardará el calculo del modulo del numero / numero2
		//Pedir numero al usuario
		System.out.println("Introduce un número para convertirlo en múltiplo del siguiente número introducido:");
		numero1 = sc.nextInt(); //recogida del numero1
		System.out.println("Introduce otr numero para calcular si el anterior es múltiplo:");
		numero2 = sc.nextInt();//recogida del numero2
		//Calculo para convertirlo en multiplo de numero2
		multiplo =( numero1 % numero2);
		resta = numero2 - multiplo;
		//Ternario para que si no es multiplo de numero2 realice la variable resta
		String multiploCalc =(numero1%numero2==0) ? "Su número ya es múltiplo de " + numero2 : "Para que su número sea múltiplo de " + numero2 + "hay que sumar " + resta ;
		//mensaje del calculo para el usuario
		System.out.println(multiploCalc);
		sc.close();//cerrar escaner
		
		
	}

}
