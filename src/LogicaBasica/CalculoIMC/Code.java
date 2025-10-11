package LogicaBasica.CalculoIMC;

import java.util.Scanner;

public class Code {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Insira seu peso(em Kg): ");
		Double peso = scanner.nextDouble();
		
		System.out.println("Insira sua altura(em metros,ex 1,70): ");
		Double altura = scanner.nextDouble();
		
		Double alturaQuadrado = altura * altura;
		Double Total = peso / alturaQuadrado;
		
	    System.out.printf("Seu indice de massa corporal é: %.2f\n",Total);
		
		scanner.close();	
	}
}
