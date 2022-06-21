import java.util.Scanner;

/** Programa que lea una cantidad de grados centígrados y la pase a grados Fahrenheit. La 
fórmula correspondiente es: F = 32 + ( 9 * C / 5)*/

public class Ejercicio4 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce los grados centígrados: ");
		
		float C = entrada.nextFloat();
		
		float F = 32+(9*C/5);
		
		System.out.println("Los grados Fahrenheit son: "+F);
		
		

	}

}
