package LogicaBasica.RetornoDeValoresDosMetodos;

import java.util.Scanner;

public class Code {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double[] premissaIncial = new Double[] {50.0,100.0};
        Double proporcao = 20.0;

        String [] CURSOS = new String[] {"Java","C#","Python"};


        Double resultado = REGRA_D3(premissaIncial, proporcao);

        //CHAMA O METODO, PASSA OS PARAMETROS DENTRO DO PARENTESES
        //PARAMETROS SAO VALORES Q O METODO RECEBE__estudar mais
        //PARAMETROS PODEM SER PASSADOS POR VARIVEIS OU POR PROPRIOS METODOS
        //METODO(PARAMETRO1,PARAMETRO2)
        Integer nun = 1;
        Boolean posicaoVALIDA = POSICAO_ESCOLHIDA( nun, CURSOS);
        System.out.println(posicaoVALIDA);
        System.out.println("");
            
        System.out.println("RESULTADO: "+resultado);
        System.out.println("");

        RECEBER_NUMERO("DIGITE UM NUMERO PARA TESTE DE METODO: ", scanner);

        scanner.close();
    }

    static Double REGRA_D3(Double[] premissa, Double proporcao) {
        /*
         * 50 --- 100%
         * X ----- 20%
         * 
         * 50 * 20 = X * 100 
         * X = (50*20) / 100


         * PREMISSA
         * INDICE 0 RECEBE O PRIMEIRO VALOR - 50
         * INDICE 1 RECEBE O SEGUNDO VALOR - 100
         * 
         * PROPORCAO RECEBE O QUARTO VALOR - 20%
         */
        return (premissa[0] * proporcao) / premissa[1];
    }

    static Boolean POSICAO_ESCOLHIDA(Integer posicao, String[] vetor) {
        Boolean valida = posicao >= 0 && posicao < vetor.length;
        return valida;
    }

    static Integer RECEBER_NUMERO(String texto,Scanner scanner) {
        //RECEBE O PARAMETRO INFORMADO NA CHAMADA
        System.out.println(texto);
        Integer TEXTO = scanner.nextInt();

        return TEXTO;
    }
}
