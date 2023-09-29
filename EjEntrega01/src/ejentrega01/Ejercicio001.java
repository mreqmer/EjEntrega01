package ejentrega01;
import java.util.Scanner;
public class Ejercicio001 {

	public static void main(String[] args) {
		// Variables
		Scanner sc = new Scanner(System.in);//Escaner
		float numeroA; //recoge el numero decimal introducido por el usuario
		//Pedir numero al usuario
		System.out.println("Introduzca un número decimal para redondearlo:");
		numeroA = sc.nextFloat();//escaner del número
		//Conversion numero introducido por el usuario en entero  
		int numeroAEnt = (int) numeroA; //numeroAEnt es el numeroA pero entero
		//Mira si la parte decimal es mayor o menor que .5 para el posterior redondeo si precisa 
		int calculo =(numeroA - numeroAEnt >= .5) ? ++numeroAEnt  : numeroAEnt ;
		//Devolver numero entero al usuario
		System.out.println("Su número redondeado es " + calculo + ".");
		sc.close();
		

	}

}
