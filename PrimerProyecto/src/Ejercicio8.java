import java.util.Scanner;

//Programa que calcula el volumen de una esfera.
public class Ejercicio8 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce el radio de la esfera: ");
		
		double radio = entrada.nextDouble();
		
		double volumen = Math.PI*Math.pow(radio, 3)*4/3;
		
		System.out.println("El volumen de la esfera es: "+volumen);

	}

}
