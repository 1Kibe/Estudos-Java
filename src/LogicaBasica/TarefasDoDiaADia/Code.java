package LogicaBasica.TarefasDoDiaADia;

import java.util.Scanner;

public class Code {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] TAREFAS = new String[5];
        
        System.out.println("");
        System.out.println("TAREFAS DO SEU DIA A DIA");
        System.out.println("CITE AS SUAS 5 PRINCIPAIS TAREFAS DO DEU DIA: ");
        System.out.println("");

        for(int i = 0; i<TAREFAS.length; i++){
            System.out.print("TAREFA " + i + ": ");  
            TAREFAS[i] = scanner.nextLine();
        }
        
        System.out.println("");
        System.out.println("SUA LISTA DE TAREFAS ATUAL É: ");
        System.out.println("");

        for(int i = 0; i < TAREFAS.length; i++){
            System.out.println("["+ i + "]" + TAREFAS[i]);
        }
        System.out.println("");


        scanner.close();
    }
}
