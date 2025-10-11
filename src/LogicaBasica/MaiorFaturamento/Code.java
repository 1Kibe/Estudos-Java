package LogicaBasica.MaiorFaturamento;

public class Code {
    public static void main(String[] args) {
        Double[] semanaUm = new Double[]{ 1000.0, 1500.0, 1250.0, 2100.0, 1350.0, 970.0, 0.0 };
        Double[] semanaDois = new Double[]{ 1050.0, 2500.0, 3250.0, 1100.0, 1430.0, 900.0, 0.0 };
        Double[] semanaTres = new Double[]{ 1700.0, 1300.0, 1450.0, 2000.0, 1390.0, 800.0, 0.0 };
        Double[] semanaQuatro = new Double[]{ 2100.0, 1600.0, 1850.0, 2100.0, 1220.0, 998.0, 0.0 };

        Double[][] mes = new Double[][] { semanaUm, semanaDois, semanaTres, semanaQuatro };

        System.out.println("");

        Double MAIORFATURAMENTO = 0.0;
        Integer SEMANAganhadora = null;

        //arrey[i][f]
        for (int i = 0; i< mes.length;i++){

            Double semana = 0.0;
            
            for(int f = 0; f < mes[i].length; f++){
                semana += mes[i][f];
                System.out.println("SEMANA: " + (i + 1) + ": VALOR ATUAL: " + semana);
            
            }

            //VERIFICA SE É O FATURAMENTO DA SEMANA É MAIOR QUE O ATUAL
            Boolean eoMaioFaturamento = semana > MAIORFATURAMENTO;

            // SE SIM DEIXA O FATURAMENTO DA SEMANA EM UMA VARIAVEL EXTERNA
            if(eoMaioFaturamento){
                MAIORFATURAMENTO = semana;
                SEMANAganhadora = i + 1;
            }
        }
        System.out.println("SEMANA GANHADORA: " + SEMANAganhadora + ", MAIOR VALOR: " + MAIORFATURAMENTO);
        System.out.println("");
    }
}
