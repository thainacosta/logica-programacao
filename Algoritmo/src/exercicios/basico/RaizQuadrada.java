package exercicios.basico;
import java.util.Scanner;

public class RaizQuadrada {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int numero = 0;
		
		
		System.out.println(" Digite um numero: " );
		numero = scanner.nextInt();
		
		System.out.println("O numero " + numero + "² é " + numero * numero);
	}
}
