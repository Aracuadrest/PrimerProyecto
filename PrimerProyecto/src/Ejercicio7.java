import java.util.Scanner;

/** Programa lea la longitud de los catetos de un triángulo rectángulo y calcule la longitud 
de la hipotenusa según el teorema de Pitágoras
*/
public class Ejercicio7 {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce la longitud de un cateto: ");
		double cateto1 = entrada.nextDouble();
		System.out.println("Introduce la longitud del otro: ");
		

		double cateto2 = entrada.nextDouble();
		
		double hipotenusa = Math.sqrt((cateto1*cateto1)+(cateto2*cateto2));
		
		System.out.println("La longitud de la hipotenusa es: "+hipotenusa);
	}

}
