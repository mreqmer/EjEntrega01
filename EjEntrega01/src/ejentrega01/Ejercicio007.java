package ejentrega01;
import java.util.Scanner;
public class Ejercicio007 {

	public static void main(String[] args) {
		// Variables
		Scanner sc = new Scanner(System.in);//escaner
		float mm;//se recoge un numero en mm
		float cm;//se recoge un numero en cm
		float m;//se recoge un numero en m
		float mmCm;//se usa para la conversion de mm a cm
		float mCm;//se usa para la conversion de m a cm
		float suma;//suma de mmCm mCm y cm
		//pedir datos al usuario
		System.out.println("Introduce tres distancias.");
		System.out.println("La primera en mm:");//pide mm
		mm = sc.nextFloat();//escaner
		System.out.println("La segunda en cm:");//pide los cm
		cm = sc.nextFloat();//escaner
		System.out.println("La tercera en m:");//pide los m
		m = sc.nextFloat();//escaner
		//calculo para convertirlo todo en cm
		mmCm = mm / 10;//conversion de mm a cm
		mCm = m * 100;//conversion de m a cm
		suma = cm + mmCm + mCm; //suma de las medidas
		//Dar los datos al usuario
		System.out.println("La suma de sus medidas es de: " + suma + "cm." );
		sc.close();//cerrar escaner
		//Sumar todo en mm
		

	}

}
