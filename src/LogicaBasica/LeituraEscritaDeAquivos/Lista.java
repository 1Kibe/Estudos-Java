package LogicaBasica.LeituraEscritaDeAquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lista {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        List<String> lista = new ArrayList<String>();
        Path arquivo = Paths.get("C:/Java/JavaTeste/src/LeituraEscritaArquivos/arquivo.txt");

        //verifica se o arquio ja existe, le todas as linhas do arquivo com readAllLines, e adciona a minha lista atual
        //Isso garante que, ao abrir o programa, ele recupere as tarefas salvas anteriormente.
        if (Files.exists(arquivo)) {
            lista.addAll(Files.readAllLines(arquivo));
        } else {
            Files.createFile(arquivo);
        }
        
        System.out.println("LISTA DE TAREFAS");
        System.out.println("ADCIONAR A LISTA    : SOMENTE DIGITE A TAREFA");
        System.out.println("PARAR               : DIGITE [x]");
        System.out.println("LIMPAR TUDO         : DIGITE [c]");
        System.out.println("LISTAR TUDO         : DIGITE [l]");
        System.out.println("");
        
        Boolean parada = true;
        while (parada) {
            System.out.print("_");
            String tarefa = scanner.nextLine();
            
            //USANDO .eguals
            if(tarefa.equalsIgnoreCase("x") ){
                //USE breake para quebrar o loop
                break;
            } else if (tarefa.equalsIgnoreCase("c")){
                lista.clear();
                Files.write(arquivo, lista);
                System.out.println("LISTA LIMPA COM SUCESSO");
                
            } else if (tarefa.equalsIgnoreCase("l")){
                List<String> linhas = Files.readAllLines(arquivo);

                System.out.println("");
                if(lista.isEmpty()){
                    System.out.println("LISTA VASIA ");
                    System.out.println("");
                }else{
                    System.out.println("LISTA ATUAL");
                    for(int i = 0; i<linhas.size(); i++){
                    String texto = linhas.get(i);
                    System.out.println("["+i+"] "+texto); 
                    }
                    System.out.println("");
                }
            } else {
                lista.add(tarefa);
                //Files tenq ficar ao final para salvar depois de qq interacao
                //write = escrita
                Files.write(arquivo, lista);
            }
        }
        scanner.close();
    }
}
