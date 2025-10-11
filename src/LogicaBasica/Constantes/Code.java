package LogicaBasica.Constantes;

import java.util.Scanner;

public class Code {
    static final Integer PADRONIZACAO_DE_ESTATICA = 1; // forma mais usada

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       System.out.println("Idade?: ");
        Integer idade = scanner.nextInt();

        final Integer IDADE_MIN = 18; //so colocar final na variavel
        Boolean decisaoCART = idade >= IDADE_MIN;

        if (decisaoCART){
          System.out.println("Sim, pode tirar");
        }else{
          System.out.println("Nao, pode tirar");
        }
        scanner.close();
    }
}
