package LogicaBasica.CalculadoraSimples;

import java.util.Scanner;

public class Code {
        public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("CALCULADORA");
        System.out.println("Escolha dois numeros, e o operador");

        System.out.print("NUMERO A: ");
        Double nunA = scanner.nextDouble();

        System.out.print("NUMERO B: ");
        Double nunB = scanner.nextDouble();

        System.out.println("OPERADOR: ");
        System.out.println("ADIÇÃO:---------[1]");
        System.out.println("SUBTRAÇÃO:------[2]");
        System.out.println("MULTIPLICAÇÃO:--[3]");
        System.out.println("DIVISÃO:--------[4]");
        System.out.print(": ");
        Integer operador = scanner.nextInt();

        if(operador == 1){

            Double TOTAL = nunA + nunB;
            System.out.println("TOTAL: "+ TOTAL);

        }else if(operador == 2){

            Double TOTAL = nunA - nunB;
            System.out.println("TOTAL: "+ TOTAL);

        }else if(operador == 3){

            Double TOTAL = nunA * nunB;
            System.out.println("TOTAL: "+ TOTAL);

        }else if(operador == 4){

            Double TOTAL = nunA / nunB;
            System.out.println("TOTAL: "+ TOTAL);

        }

        scanner.close();
    }
}
