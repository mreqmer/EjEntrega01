package ejentrega01;

import java.util.Scanner;

public class Ejercicio008 {

	public static void main(String[] args) {
		// Variables
		Scanner sc = new Scanner(System.in);//escaner
		final float PRECIO_N = 15.50f;//precio de la entrada de los adultos
		final float PRECIO_A = 20f;//precio de a entrada de los niños
		final float DESCUENTO = 5; //descuento aplicado a compras superiores a 100€
		int entradaN, entradaA; //numero de entradas de los niños y adultos (respectivamente) que introduce el usuario
		float precioT;//aqui se registrara el precio total SIN descuentos
		//introducir el numero de entradas por el usuario
		System.out.println("¡Bienvenido a Aquopolis!");//mensaje de bienvenida
		System.out.println("¿Cuántos adultos vienen?");//entrada de adultos
		entradaA = sc.nextInt();//escaner
		System.out.println("¿Cuántos niños vienen?");//entrada de niños
		entradaN = sc.nextInt();//escaner
		//Calcular el precio
		precioT = (entradaA * PRECIO_A)+(entradaN * PRECIO_N);
		//mirar si el precio es mayor que 100
		float precioDesc = (precioT >= 100) ?  precioT - ((precioT * DESCUENTO) / 100) : precioT ;
		//mensaje si tiene descuento 
		String mensaje = precioT >= 100 ? "Se le ha descontado un 5% por compra superior a 100€" : "";
		//salida del mensaje si tiene descuento
		System.out.println(mensaje);
		//salida del precio total del cliente
		System.out.println("Su precio es de: " + precioDesc + "€");
		sc.close();//cerrar escaner
	}

}
