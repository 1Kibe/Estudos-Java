package LogicaBasica.GastosFamiliares;

import java.util.Scanner;

public class Code {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Double TOTAL = 0.0;

        System.out.println("                  ");
        System.out.println("CONTROLE DE GASTOS");
        System.out.println("                  ");

        System.out.println("INFORME O VALOR EM DINHEIRO DE CADA CONTA A SEGUIR");
        System.out.println("                  ");

        System.out.print("CONTA DE LUZ: ");
        Double luz = scanner.nextDouble();
        TOTAL += luz;

        System.out.print("CONTA DE AGUA: ");
        Double agua = scanner.nextDouble();
        TOTAL += agua;

        System.out.print("CONTA DE TELEFONE: ");
        Double tel = scanner.nextDouble();
        TOTAL += tel;

        System.out.print("ESCOLA DO FILHO: ");
        Double escol = scanner.nextDouble();
        TOTAL += escol;

        System.out.print("FATURA DO CARTÃO: ");
        Double cartao = scanner.nextDouble();
        TOTAL += cartao;

        System.out.print("GASTOS COM SUPERMERCADO: ");
        Double mercado = scanner.nextDouble();
        TOTAL += mercado;


        System.out.printf("TOTAL: %.2f",TOTAL); // no printf usa-se a virgula ao inves do +
        System.out.println("                  ");
        scanner.close();
    }
}
