package LogicaBasica.ArreyDuplo_MatrizIdentidade;

import java.util.Scanner;

/*
Descrição: Peça ao usuário um número n e crie uma matriz identidade n x n.
A matriz identidade tem 1 na diagonal principal e 0 no restante.

Entrada: valor n
Saída: matriz formatada no console

 */

public class Code {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("DIGITE A NUMERO DE LINHAS E COLUNAS(SAIDA SERA N*N): ");
        Integer n = scanner.nextInt();

        scanner.close();
        
        Integer ARREY [][] = new Integer[n][n];
        Integer valor = null;

        for(int i = 0; i < ARREY.length; i++){
            for(int f = 0; f < ARREY[i].length; f++){
                System.out.println("[" + i + "] " + " VALOR: " + valor );
            }
        }
        
    }
}
