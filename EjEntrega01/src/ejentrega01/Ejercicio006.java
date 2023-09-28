package ejentrega01;
import java.util.Scanner;
public class Ejercicio006 {

	public static void main(String[] args) {
		// Variable
		Scanner sc = new Scanner(System.in); //Scanne
		int segUser; //segundos introducidos por el usuario
		int seg , min, horas; //tiempo una vez ya convertido
		//pedir tiempo en segundos	
		System.out.println("Conversor. \nIntroduce el tiempo en segundos:  ");
		segUser = sc.nextInt();//escaner
		//calculos
		min = (segUser >= 60 ) ? ((segUser % 3600) / 60)  : 0 ; //calcula cuantos minutos son
		horas = (segUser >= 60) ? (segUser / 3600) : 0 ; //calcula cuantas horas son
		seg = segUser % 60; //calcula cuantos segundos son
		//Devuelve los datos con el tiempo ya convertido
		System.out.println(segUser + "seg son: " + horas + "h " + min + "min " + seg + "seg");
		sc.close();//cerrar escaner
	}
}
