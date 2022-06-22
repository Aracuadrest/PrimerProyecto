import java.util.Scanner;

/**. Programa que lea un número entero N de 5 cifras y muestre sus cifras desde el 
principio como en el ejemplo.*/

public class Ejercicio12 {

	public static void main(String[] args) {
	Scanner entrada = new Scanner (System.in);
		
		System.out.println("Introduce un número de 5 cifras: ");
		int N = entrada.nextInt();
		 
		System.out.println(N/10000);
		System.out.println(N/1000);
		System.out.println(N/100);
		System.out.println(N/10);
		System.out.println(N);

	}

}
