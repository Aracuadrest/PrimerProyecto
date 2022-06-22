import java.util.Scanner;

/**  Programa que pase una velocidad en Km/h a m/s.
 *  La velocidad se lee por teclado
 * @author Araceli
 *
 */

public class Ejercicio6 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce km/h: ");
		
		double kmh = entrada.nextDouble();
		double ms = kmh*1000/3600;
		
		System.out.println("La velocidad en m/s es: "+ms);
		
		System.out.printf("%.2f km/h son %.2f m/s ",kmh,ms);
		
	}

}
