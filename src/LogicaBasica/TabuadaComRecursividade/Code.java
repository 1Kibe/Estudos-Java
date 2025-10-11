package LogicaBasica.TabuadaComRecursividade;

import java.util.Scanner;

public class Code {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("");
        System.out.print("DIGITE UM NUMERO PARA SABER A SUA TABUDADA: ");
        Integer NumeroInserido = scanner.nextInt();
        //Integer NUMERO = 0;

        //VERIFICACAO DE LIMITE
        //if(NumeroInserido > 1 && NumeroInserido <= 10){
        //    NUMERO += NumeroInserido;
        //}else{
        //    System.out.println("");
        //    System.err.println("NUMERO INVALIDO");
        //    System.out.println("REQUISITO: NUMERO MAIOR QUE 1 E MENOR QUE 10");
        //    System.exit(1);
        //}

        //NumeroInserido sendo o que o usuario digitou e o 0 sendo a condicao inicial da iteracao
        PRINT_TABUADA(/*outra forma NUMERO*/NumeroInserido, 0);

        scanner.close();
    }

    static void PRINT_TABUADA(Integer X, Integer i) {

        //OUTRA FORMA DE FAZER
        //Integer[] NUMEROS = new Integer[] {1,2/*... */};
        
        System.out.println(" " + X + " X "+ i + " = " + (X * i));

        //RECURSIVIDADE DO METODO OBRIGATORIA E COM LIMITE
        //ITERCAO USADA COMO MULTIPLICADOR
        if(++i<=100){
            PRINT_TABUADA(X,i);
        }
    }
}
