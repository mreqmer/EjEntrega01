package ejentrega01;
import java.util.Scanner;
public class Ejercicio010 {

	public static void main(String[] args) {
		// Variables
		Scanner sc = new Scanner(System.in);//escaner
		float distM;//se recoge la distancia del participante
		float distCm;//se recoge le distancia anterior en cm
		//Pedir datos del concurso
		System.out.println("Introduzca la distancia en metros:");
		distM = sc.nextFloat();//escaner
		//Pasar la distancia de m a cm
		distCm = distM * 100;
		//conversion float a int
		int distCmEnt = (int) distCm;
		//Devolver valor en cm sin decimales
		System.out.println("La distancia fue de: " + distCmEnt + "cm.");
		sc.close();//cerrar escaner
	}

}
