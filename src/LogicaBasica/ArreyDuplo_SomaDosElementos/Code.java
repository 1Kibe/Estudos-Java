package LogicaBasica.ArreyDuplo_SomaDosElementos;

import java.util.Scanner;

/*
 Descrição: Leia uma matriz 3x3 de números inteiros, calcule e imprima a soma de todos os elementos. 

 Entrada: valores lidos pelo Scanner
 Saída: soma total

*/

public class Code {
     public static void main(String[] args) {

        //Integer [] sequencia = new Integer[]  {1,2,3};
        //Integer [] sequencia2 = new Integer[] {4,5,6};
        //Integer [] sequencia3 = new Integer[] {7,8,9};//45 total

        Integer [][] NUMEROS = new Integer[3][3] /*{sequencia, sequencia2, sequencia3}*/;
        
        Double Soma = 0.0;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0;i<NUMEROS.length;i++){
            for(int f = 0; f < NUMEROS[i].length; f++){
                System.out.print("DE UM VALOR PARA O ARREI: ");
                NUMEROS[i][f] = scanner.nextInt();

                Soma += NUMEROS[i][f];
                System.out.println("ARREY: "+ i + " -> VALOR: " + NUMEROS[i][f]);
                System.out.println("");
                
            }
        }

        scanner.close();

        System.out.println("");
        System.out.println("SOMA ATUAL: "+Soma);
        System.out.println("");
    }
}
