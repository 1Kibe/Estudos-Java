package LogicaBasica.IfEncadeado;

import java.util.Scanner;

public class Code {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        

        System.out.println("INSIRA SEU PESO: ");
        Double peso = scanner.nextDouble();

        Boolean peso_L = peso <= 60;
        Boolean peso_M =(peso > 60)&& (peso <= 90);
        Boolean peso_P = peso > 90;

//        if(peso_L){
//            System.out.println("PESO LEVE");
//        }else{
//            if(peso_M){
//                System.out.println("PESO MEDIO");
//            }else{
//                System.out.println("PESO PESADO");
//            }
//        }

        if (peso_L){//opcao 1
            System.out.println("PESO LEVE");
        }else if(peso_M){//opcao 2
            System.out.println("PESO MEDIO");
        }else if(peso_P){//opcao 3
            System.out.println("PESO PESADO");
        }else{//opcao padrao/ eleminatoria
            System.out.println("erro");
        }
        
        scanner.close();
    }
}
