import java.util.Scanner;

/**Programa que calcula el número de la suerte de una persona a partir de su fecha de 
nacimiento.
El número de la suerte se calcula sumando el día, mes y año de la fecha de 
nacimiento y a continuación sumando las cifras obtenidas en la suma.
Por ejemplo:
Si la fecha de nacimiento es 12/07/1980
Calculamos el número de la suerte así: 12+7+1980 = 1999 1+9+9+9 = 28
Número de la suerte: 28
*/
public class Ejercicio14 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce el día: ");
		int dia = entrada.nextInt();
		System.out.println("Introduce el mes: ");
		int mes = entrada.nextInt();
		System.out.println("Introduce el año: ");
		int año = entrada.nextInt();
		
		int num = dia+mes+año;
		
		int numsuerte = (num/1000)+((num%1000)/100)+(((num%1000)%100)/10)+(num%10);
		
		System.out.println("Tu numero de la suerte es: "+numsuerte);

	}

}
