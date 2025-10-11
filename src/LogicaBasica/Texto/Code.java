package LogicaBasica.Texto;

import java.util.Scanner;

public class Code {
    public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Insira um nome: ");
		
		String nome = scanner.nextLine();
		System.out.println("Ola " + nome + "!");
		
		Character variavelChar = '1';

		scanner.close();
	}
}
