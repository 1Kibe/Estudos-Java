package LogicaBasica.CalcularTroco;

import java.util.Scanner;

public class Code {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o valor do produto: ");
		Double valorProduto = scanner.nextDouble();
		
		System.out.print("Digite quantidade passada pelo cliente: ");
		Double valorPassadoPeloCliente = scanner.nextDouble();
		
		Double resultado = valorProduto - valorPassadoPeloCliente;
		System.out.println("Troco sera de: " + resultado);
		
		scanner.close();
	}
}

