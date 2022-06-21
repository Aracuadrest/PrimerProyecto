import java.util.Scanner;

/** Programa Java que lee un número entero por teclado y 
 * obtiene y muestra por pantalla  el doble y el triple de ese número
*/

public class Ejercicio3 {

	public static void main(String[] args) {
		
		// definimos una variable de tipo int
		int num;
		// definimos el Scanner para leer desde el teclado
		Scanner entrada = new Scanner(System.in);
		
		//Mostramos el mensaje por pantalla
		System.out.println("Introduce un numero: ");
		//Pedimos el numero por teclado
		num = entrada.nextInt();
		/*
		int doble = num*2;
		int triple = num*3;
		
		//Mostrar en pantalla el resultado
		System.out.println("El doble es: "+doble+ " y el triple es: "+triple);*/
		System.out.println("El doble es: "+num*2 +" y el triple es: "+num*3);	
		
		

	}

}
