import java.util.Scanner;

public class Operadores {

	public static void main(String[] args) {
		
		float num1, num2;
		float media;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce un número: ");
		num1 = entrada.nextFloat();
		
		System.out.println("Introduce otro número: ");
		num2 = entrada.nextFloat();
		
		media = (num1+num2)/2;
		
		System.out.println("La media es: "+media);
		

	}

}
