import java.util.Scanner;

//Programa que lee un número de 3 cifras y muestra sus cifras por separado.

public class Ejercicio11 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Introduce un número de tres cifras: ");
		int num = entrada.nextInt();
		 
		System.out.println("Primera cifra  "+(num/100));
		System.out.println("Segunda cifra  "+((num/10)%10));
		System.out.println("Tercera cifra  "+(num%10));

	}

}
