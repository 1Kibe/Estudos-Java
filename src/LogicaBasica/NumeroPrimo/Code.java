package LogicaBasica.NumeroPrimo;

import java.util.Scanner;

public class Code {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        Integer nun = scanner.nextInt();
        scanner.close();

        Boolean ehPrimo = Util.verificarPrimo(nun);
        System.out.println(ehPrimo);
        
    }
}
