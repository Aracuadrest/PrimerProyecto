import java.util.Scanner;

//Programa que calcula el área de un triángulo a partir de la longitud de sus lados.

public class Ejercicio9 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce la longitud de un cateto: ");
		double cateto1 = entrada.nextDouble();
		System.out.println("Introduce la longitud del otro: ");
		double cateto2 = entrada.nextDouble();
		System.out.println("Introduce la longitud del otro: ");
		double cateto3 = entrada.nextDouble();
		
		double s = (cateto1+cateto2+cateto3)/2;
		
		double area = Math.sqrt(s*(s-cateto1)*(s-cateto2)*(s-cateto3));
		
		System.out.println("El area del triangulo es: "+area);

	}

}
