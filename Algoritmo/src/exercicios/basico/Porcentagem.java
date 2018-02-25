package exercicios.basico;
import java.util.Scanner;

public class Porcentagem {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double valorProduto = 20.00;
		
		System.out.println("Para descontos digite 1 para aumento digite 2");
		int acao = scanner.nextInt();
		
		if (acao == 1) {
			System.out.println("Digite o percetual à ser aplicado do desconto");
			double desconto = scanner.nextDouble();
			
			double aplicado = valorProduto * desconto / 100;
			
			double novoPreco =  valorProduto - aplicado;
			
			System.out.println("O valor do desconto é " + aplicado + 
					" e o valor atualizado é " + novoPreco);
			
		}else {
			System.out.println("Digite o percentual de aumento do produto");			
			double aumento = scanner.nextDouble();
			
			double aplicado = valorProduto * aumento / 100;
			
			double novoPreco = aplicado + valorProduto;
			
			System.out.println("O valor do aumento é " + aplicado + 
					" e o valor atulizado é " + novoPreco);
			
		}
	}
}
