package LogicaBasica.NotaAluno;

import java.util.Scanner;

public class Code {
     public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);

    System.out.println("Digite a nota no aluno(exemplo, 60): ");
    Double Nota = scanner.nextDouble();

    if (Nota >= 60){
        System.out.println("Aluno aprovado");
    }else{
        System.out.println("Aluno reprovado");
    }
    scanner.close();
 }
}
