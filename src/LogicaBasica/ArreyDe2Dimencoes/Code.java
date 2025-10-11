package LogicaBasica.ArreyDe2Dimencoes;

public class Code {
    public static void main(String[] args) {
        Double FATURAMENTO = 1000.0;

        Double [] FATURAMENTO_JANEIRO = new Double[] {30.0,32.0,32.0};
        Double [] FATURAMENTO_FEVEREIRO = new Double[] {3.0,2.0,9.0};
        
        

        //CADA POSICAO DE UM ARREY DE DUAS DIMENCOES, PRESCISA SER UM ARREY DE UMA DIMENCAO
        //INDICE DO ARREY COM DUAS TBM SAO CONTABILIZADOS COMO UM ARREY NORMAL__ EXEMPLO 0,1,2,3,4,5..
        Double [][] FATURAMENTOANUAL = new Double[][] {
            //DOIS VALORES, DUAS POSICOES
            //INDICE 0         ,INDICE 1                  SUSSECIVAMENTE..
            FATURAMENTO_JANEIRO, FATURAMENTO_FEVEREIRO
        };


        /*PARA REFERENCIAR ARREY DUPLO PRIMIERO SE REFERENCIA QUAL ARREY UNICO SERCA ACESSADO 
        DEPOIS O INDICE DESEJADO

        EXEMPLO QUERO O ARREY DE FEVEREIRO 
        FATURAMENTOANUAL[1][]

        COM INDICE 3

        FATURAMENTOANUAL[1][2]


        */
        System.out.println("");
        System.out.println("FATURAMENTO DO DIA 1° DE JANEIRO: " + FATURAMENTOANUAL[0][0]);
        System.out.println("FATURAMENTO DO DIA 3° DE FEVEREIRO: " + FATURAMENTOANUAL[1][2]);
        System.out.println("");
        System.out.println("NAVEGANDO ENTRE A ARREY DUPLO");
        System.out.println("");

        //NAVEGANDO ENTRE A ARREY DUPLO
        for (int i = 0;i< FATURAMENTOANUAL.length;i ++){
            System.out.println("MES: " + (i + 1));

            //PEGA O INDICE DO ARREY, QUAL ARREY PRIMARIO IRA SER UTILIZADO
            Double [] mes = FATURAMENTOANUAL[i];

            for (int y = 0; y<mes.length;y++){

                //PEGA O INDICE DO ARREY ESCOLHIDO 
                Double dia = mes[y];
                System.out.println("DIA "+ (y+1) + ":" + dia);

            }
        }

        /* FORMA MAIS RAPIDA
        for (int i = 0;i< FATURAMENTOANUAL.length;i ++){
            System.out.println("MES: " + (i + 1));

            //PEGA O INDICE DO ARREY, QUAL ARREY PRIMARIO IRA SER UTILIZADO
            for (int y = 0; y < FATURAMENTOANUAL[i].length;y++){

                //PEGA O INDICE DO ARREY ESCOLHIDO COM BASE NO ARREY PRIMARIO ESCOLHIDO
                Double dia = FATURAMENTOANUAL[i][y];
                System.out.println("DIA "+ (y+1) + ":" + dia);

            }
        }*/

        System.out.println("");
    }
}
