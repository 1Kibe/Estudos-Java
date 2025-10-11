package LogicaBasica.InteracaoWHILE;

public class Code {
     public static void main(String[] args) {

        //for usado quando se tem quantidade de iteracoes conhecidas
        for(int i =0; i<10 ; i++){
            System.out.println("For 10X");
        }
        System.out.println("");



        //while usado para alcancar uma condicao
        //executa enquanto a variavel for verdadeira quando chegar em false ele para
        // se for utilizar if`s colocar primeiro que tudo por erro de duplicacao

        //somente a condicao
        int i=0;
        while (i<10) {         
            if(i == 5){ // lembresse que comeca do 0 imtao i=5 seria a sexta interacao (0, 1, 2, 3, 4, 5)
                System.out.println(i+ ": PULOU O 5");
                i++; //importante colocar dentro do if tbm por problemas de loop infinito
                continue;
            }
            System.out.println(i+": While 10X");
            i++;
            
        }
    }
}   
