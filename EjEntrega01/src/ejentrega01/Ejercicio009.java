package ejentrega01;
import java.util.Scanner;
public class Ejercicio009 {

	public static void main(String[] args) {
		// Variables
		Scanner sc = new Scanner(System.in);//escaner
		int num1;//se guarda el primer numero introducido por el usuario
		int num2;//se guarda el segundo numero introducido por el usuario
		//Pedir dos numeros al usuario
		System.out.println("Introduzca un número: ");//pide el primer numero
		num1 = sc.nextInt();//escaner
		System.out.println("Introduzca otro número: ");//pide el segundo numero
		num2 = sc.nextInt();//escaner
		//Comprobación si son iguales los dos numeros
		String mensaje = num1==num2 ? "Ambos números son iguales." : "Los números no son iguales.";
		System.out.println(mensaje);//Le da el resultado al usuario
		sc.close();//cerrar escaner
		
	}

}
