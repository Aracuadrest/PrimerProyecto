import java.util.Scanner;

// Programa para pasar de grados centígrados a grados Kelvin.
public class Ejercicio15 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce los grados centigrados: ");
		double c = entrada.nextInt();
		
		double k = c+273.15;
		
		System.out.println(c+" grados centígrados son: "+k+" grados Kelvin");

	}

}
