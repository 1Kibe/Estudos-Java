package LogicaBasica.ArreyDeMaisDe2Dimencoes;

public class Code {
    public static void main(String[] args) {
        Double [] FATURAMENTO_JANEIRO = new Double[] {30.0,32.0,32.0};
        Double [] FATURAMENTO_FEVEREIRO = new Double[] {3.0,2.0,9.0};
        
        Double [][] FATURAMENTOANUAL = new Double[][] {FATURAMENTO_JANEIRO, FATURAMENTO_FEVEREIRO};

        Double [][][] FATURAMENTO_QUINQUENAL = new Double [][][] {FATURAMENTOANUAL};

        // PODE FAZER QUANTAS DIMENSOES VC QUIZER
        //Double [][][][] FATURAMENTO_DECADA new Double [][][][]{};

        for(int i = 0; i<FATURAMENTOANUAL.length; i++){
            for(int f = 0;f<FATURAMENTOANUAL[i].length; f++){

            }
        }
    }
}
