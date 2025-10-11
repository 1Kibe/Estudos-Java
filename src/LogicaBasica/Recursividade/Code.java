package LogicaBasica.Recursividade;

public class Code {
    public static void main(String[] args) {
        
        String[] ALUNOS = new String[] {"Joao","maria", "cleber", "jorge"};
        
        PRINT_NUMERO(0);

        ITERAR_NOMES_ALUNOS(ALUNOS,0);
    }

    static void PRINT_NUMERO(Integer numero) {
        System.out.println("NUMERO: "+ numero);

        //NESCESSARIO CONDICAO DE PARADA POR ERRO DE INFINIDADE
        if(numero < 10){
            //CHAMA O PROPRIO METODO NOVAMENTE
            PRINT_NUMERO(++numero);
        }
        
    }

    static void ITERAR_NOMES_ALUNOS(String [] alunos, Integer i) {

        System.out.println("aluno: "+ alunos[i]);
        
        //CAHAMA O METODO COM ++ PRA PROXIMA ITERACAO,PADRAO È ISSO 
        if(++i<alunos.length){
            ITERAR_NOMES_ALUNOS(alunos, i);
        }
    }
}
