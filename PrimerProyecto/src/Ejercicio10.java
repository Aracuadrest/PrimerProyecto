import java.util.Scanner;

/** Programa que calcule el cambio que se debe devolver al usuario. Se pedirán por 
teclado dos números, el precio del artículo y el importe introducido. Se devolverá el 
número de monedas a entregar óptimo suponiendo que tenemos disponibilidad de 
monedas infinita.
*/
public class Ejercicio10 {

	public static void main(String[] args) {
			
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce el precio del artículo: ");
		double precio = entrada.nextDouble();
		System.out.println("Introduce el importe entregado: ");
		double dinero = entrada.nextDouble();
		
		double resta = dinero-precio;
		
		int entero = (int) resta;
		
		int m2e = entero/2;
		int m1e = entero %2;
		
		int centimos = (int) Math.round((resta-entero)*100);
		
		int m50c = centimos/50;
		int resto = centimos%50;
		
		int m20c = (resto)/20;
		resto = resto%20;
		
		int m10c = resto/10;
		resto = resto%10;
		
		int m5c = resto/5;
		resto = resto%5;
				
		int m2c = resto/2;
		int m1c = resto%2;
		
		System.out.printf("Devolver %.2f \n", resta);
		System.out.println(+m2e+" monedas de 2 euros\n"+m1e+" monedas de 1 euro\n"+m50c+" monedas de 50 centimos\n"+m20c+" monedas de 20 centimos\n"+m10c+" monedas de 10 centimos\n"+m5c+" monedas de 5 centimos\n"+m2c+" monedas de 2 centimos\n"+m1c+" monedas de 1 centimo\n");

	}

}
