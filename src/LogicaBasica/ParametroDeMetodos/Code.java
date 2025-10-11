package LogicaBasica.ParametroDeMetodos;

public class Code {
    public static void main(String[] args) {

        String [] CURSOS = new String[] {"Java","C#","Python"};

        //CHAM O METODO E PASSA O ARREY
        FOR_i(CURSOS);

        //CHAMA O METODO, E ATRIBUI O VALOR
        PRINT("--------");
        PRINT("METODO");
    }

    //RECEBER UM PAREMETRO, PARAMETROS SAO COMO VARIAVEIS
    //               PARAMETRO texto
    static void PRINT(String texto) {

        //               //CHAMA O PARAMETRO PASSADO
        System.out.println(texto);
    }

    //QUANTIDADE DE PARAMETROS PODEM SER VARIADAS
    static void FOR_i(String [] vetor /*,Integer nun, Boolean ativo */) {
        for(int i = 0; i < vetor.length; i++){
            System.out.println("[" + i + "] " + vetor[i]);
        }
    }
}
