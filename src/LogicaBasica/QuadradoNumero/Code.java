package LogicaBasica.QuadradoNumero;

import java.util.Scanner;

public class Code {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Insira um numero: ");
		Double Nun = scanner.nextDouble();
		
		Double quadrado = Nun * Nun;
		
		System.out.println("Numero ao quadrado é: " + quadrado);
		
		
		
		scanner.close();
	}
}
