package LogicaBasica.QuantidadeDesconto;

import java.util.Scanner;

public class Code {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("DIGITE O VALOR DO PRODUTO(exemplo-80,00): ");
        Double valorP = scanner.nextDouble();

        System.out.print("DIGITE A QUANTIDADE DE PRODUTOS: ");
        Integer quantP = scanner.nextInt();

        Double subTOTAL = valorP * quantP;

        Double desconto = 10.0;
        Double percentual = subTOTAL * desconto / 100;
        Double TOTAL = subTOTAL - desconto;

        if (quantP>=10) {
            System.out.println("Seu valor com desconto por quantidade é: " + TOTAL);
        }else{
            System.out.println("Total sem desconto por unidade: "+ subTOTAL);
        }

        scanner.close();
    }
}
