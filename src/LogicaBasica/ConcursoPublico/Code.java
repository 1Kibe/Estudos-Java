package LogicaBasica.ConcursoPublico;

import java.util.Scanner;

public class Code {
     public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final Double PROVA_F = 200.0;
        final Double PROVA_F_MINIMA = 150.0;
        final Double PROVA_MINIMA = 60.0;

        System.out.println("");
        System.out.println("IDENTIFICADOR DE APROVAÇÕES");
        System.out.println("");
        System.out.println("PROVA COM 2 MATERIAS: MATEMATICA/PORTUGUES");
        System.out.println("VALOR TOTAL 200         VALOR POR MATERIA: 100 POR MATERIA");
        System.out.println("");

        System.out.print("INSIRA O VALOR DE SUA NOTA NA MATERIA MATEMATICA: ");
        Double Nmatematica = scanner.nextDouble();
        Boolean MATaprov = Nmatematica>=PROVA_MINIMA;
       
        System.out.print("INSIRA O VALOR DE SUA NOTA NA MATERIA PORTUGUES: ");
        Double Nportugues = scanner.nextDouble();
        Boolean PORTaprov = Nportugues>=PROVA_MINIMA;

        String motivo = "REPROVADO, MINIMO NECESSARIO POR MATERIA: 60";
        String motivoB = "REPROVADO, MINIMO NECESSARIO NA NOTA GERAL: 150";

        Double notaTOTAL = Nmatematica + Nportugues;
        
        if(notaTOTAL>=PROVA_F_MINIMA && MATaprov && PORTaprov){
            System.out.println("");
            System.out.println("[APROVADO]");
            System.out.println("");
            System.out.println("NOTAS: ");
            System.out.println("MATEMATICA: "+ Nmatematica);
            System.out.println("PORTUGUES: "+ Nportugues);
            System.out.println("NOTA ALCANCADA: "+notaTOTAL);
            System.out.println("NOTA MAXIMA PERMITIDA: "+ PROVA_F);
            System.out.println("MINIMO PARA APROVAÇÃO: "+ PROVA_F_MINIMA);
            System.out.println("");
        }else if (!MATaprov || !PORTaprov){
            System.out.println("");
            System.out.println("[REPROVADO]");
            System.out.println("");
            System.out.println("NOTAS: ");
            System.out.println("MATEMATICA: "+ Nmatematica);
            System.out.println("PORTUGUES: "+ Nportugues);
            System.out.println("NOTA ALCANCADA: "+notaTOTAL);
            System.out.println("NOTA MAXIMA PERMITIDA: "+ PROVA_F);
            System.out.println("MINIMO PARA APROVAÇÃO: "+ PROVA_F_MINIMA);
            System.out.println("");
            System.out.println("MOTIVO: "+motivo);
            System.out.println("");
        }else{
            System.out.println("");
            System.out.println("[REPROVADO]");
            System.out.println("");
            System.out.println("NOTAS: ");
            System.out.println("MATEMATICA: "+ Nmatematica);
            System.out.println("PORTUGUES: "+ Nportugues);
            System.out.println("NOTA ALCANCADA: "+notaTOTAL);
            System.out.println("NOTA MAXIMA PERMITIDA: "+ PROVA_F);
            System.out.println("MINIMO PARA APROVAÇÃO: "+ PROVA_F_MINIMA);
            System.out.println("");
            System.out.println("MOTIVO: "+motivoB);
            System.out.println("");
        }


        scanner.close();
    }
}
