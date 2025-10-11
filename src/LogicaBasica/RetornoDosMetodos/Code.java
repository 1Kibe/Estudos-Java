package LogicaBasica.RetornoDosMetodos;

import java.util.Scanner;

public class Code {
    public static void main(String[] args) {
        String [] CURSOS = new String[] {"Java","C#","Python"};
        String [] FORMA_PAGAMENTO = new String[] {"Cartão","Boleto","PIX"};

        System.out.println("ESCOLHA O CURSO DESEJADO: ");
        FOR_i(CURSOS);

        String cursoEscolhido = ESCOLHA();
        System.out.println("Você escolheu: " + cursoEscolhido);
        //vai retornar o valor digitado e nao o valor do array
    }

    static void FOR_i(String [] vetor) {
        for(int i = 0; i < vetor.length; i++){
            System.out.println("[" + i + "] " + vetor[i]);
        }
    }

    static  String ESCOLHA() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("ESCOLHA: ");
        String escolha = scanner.nextLine();

        scanner.close();

        return escolha;
    }
}
