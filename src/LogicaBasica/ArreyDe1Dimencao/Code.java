package LogicaBasica.ArreyDe1Dimencao;

import java.util.Scanner;

public class Code {
     public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] cardapio = new String[] {
            "Atum","calabresa","queijo","presunto"
        };
        System.out.println("ESCOLHA O SABOR DA SUA PIZZA");

        for(int i = 0; i < cardapio.length; i++){
            System.out.println("[" + i + "]" + cardapio[i]);
        } 
        
        Integer sabor = scanner.nextInt();
        System.out.println("SABOR ESCOLHIDO: " + cardapio[sabor]); //ARREY[INDICE]
        
        //ALTERACAO DE ARREY__ ARREY[INDICE] = VALOR;
        //cardapio[3] = "FRANGO";


        //CRIANDO ARREY VASIO__ COLOQUE O TAMANHO DO ARREY 
        //String[] ARREY-NOME = new String[4];
        //ARREY-NOME[0] = VALOR;

        scanner.close();
    }
}
