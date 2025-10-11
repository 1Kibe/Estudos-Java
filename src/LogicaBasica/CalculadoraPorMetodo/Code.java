package LogicaBasica.CalculadoraPorMetodo;

import java.util.Scanner;

public class Code {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] OPERADORES = new String[] {"+","-","*","/"};

        System.out.println("");
        System.out.println("CALCULADORA SIMPLES COM METODO");
        System.out.println("");
        System.out.println("ESCOLHA DOIS NUMEROS E O OPERADOR");
        System.out.println("");
        //NECESSARIO CHAMAR O METODO NO SYOUT PRA SAIDA DO RETORNO 
        Integer Numero_X = INSERCAO_NUMERO("DIGITE NUMERO: ",scanner);
        Integer Numero_Y = INSERCAO_NUMERO("DIGITE OUTRO NUMERO: ",scanner);
        System.out.println("");
        System.out.println("ESCOLHA SEU OPERADOR");

        for (int i = 0; i < OPERADORES.length; i++){
            System.err.println("["+ i +"]: "+OPERADORES[i]);
        }
        Integer OPERADOR = INSERCAO_NUMERO(": ",scanner);

        //VERIFICACA SE OPERADOR TEM O TAMNHO NESCESSARIO
        if(OPERADOR>=0 &&OPERADOR<=OPERADORES.length ){
            //ESCOLHE A AÇÃO
            Integer RESULT = 0;
            switch (OPERADOR) {
                case 0:
                    RESULT += (Numero_X + Numero_Y);
                    break;
                case 1:
                    RESULT += (Numero_X - Numero_Y);
                    break;
                case 2:
                    RESULT += (Numero_X * Numero_Y);
                    break;
                case 3:
                    if (Numero_Y == 0){
                        System.out.println("ERRO DIVIDIR POR 0");
                    }else{
                    RESULT += (Numero_X / Numero_Y);
                    }
                    break;
            
            }
            System.out.println("RESULTADO: " + RESULT);
        }else{
            System.out.println("ESCOLHA INVALIDA");
            System.exit(1);
        }
    }

    //ATRIBUICAO DE NUMERO
    static Integer INSERCAO_NUMERO(String texto,Scanner scanner) {
        //PRINTA O TEXTO INFORMADO COMO PARAMETRO
        System.out.print(texto);
        Integer num = scanner.nextInt();

        return num;
    }
}
