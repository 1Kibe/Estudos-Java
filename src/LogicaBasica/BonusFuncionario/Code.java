package LogicaBasica.BonusFuncionario;

import java.util.Scanner;

public class Code {
     public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        System.out.println("INSIRA A META ANUAL: ");
        Double MetaAnual = scanner.nextDouble();
        Double Meta80 = MetaAnual * 80 / 100;

        System.out.println("INSIRA O FATURAMENTO ANUAL: ");
        Double FaturamentoAnual = scanner.nextDouble();
        Boolean Faturamento80Media = FaturamentoAnual >= Meta80;

        System.out.println("INSIRA A MEDIA SALARIAL DO FUNCIONARIO: ");
        Double FuncionMedia = scanner.nextDouble();


        if(FaturamentoAnual>= MetaAnual){
            System.out.println("Funcionario ganhou bonus salarial");
            Double salario = FuncionMedia * 2;
            System.out.println(salario);
        }else if ((FaturamentoAnual<MetaAnual)&& Faturamento80Media){
            System.out.println("META N ALCANCADA MAS CHEGOU EM 80%");
            Double Funci80 = FuncionMedia + (FuncionMedia * 80 /100);
            System.out.println("SALARIO FUNCIONARIO: "+ Funci80);
        }else{
            System.out.println("NADA ALCANSADO");
        }

        scanner.close();
    }
}
