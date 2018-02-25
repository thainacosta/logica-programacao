package exercicios.basico;
import java.util.Scanner;

public class Combinacoes {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de camisas que você tem no guarda roupa");
		int camisas = scanner.nextInt();
		

		System.out.println("Digite a quantidade de calças que você tem no guarda roupa");
		int calcas = scanner.nextInt();
		

		System.out.println("Digite a quantidade de pares de sapatos que você tem no guarda roupa");
		int sapatos = scanner.nextInt();
		
		int combinacoes = camisas * calcas * sapatos;
		System.out.println("Com essa quantidade de roupa você pode fazer " + combinacoes + " combinações!");
		
		
	}
}
