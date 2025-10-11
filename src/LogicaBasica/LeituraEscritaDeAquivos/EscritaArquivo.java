package LogicaBasica.LeituraEscritaDeAquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class EscritaArquivo {
    // SE DER ERRO NO FILE ADICIONE throws IOExecption ao main
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
    //CHAMDO DE LISTA
    ArrayList<String> linhas = new ArrayList<String>();

    //ADICIONANDO STRING A LINHA
    //linhas.add("primeira linha");
    //linhas.remove("sugunda linha");

    System.out.println("DIGITE 5 COISAS");
    //ADCIONA O VALOR TEXTO A CADA LINHA DO ARRAYLIST
    for (int i = 0;i<5;i++){
        String texto = scanner.nextLine();
        linhas.add(texto);
    }

    //IMPORTA TUDO QUE ESTIVER NA VARIAVEL
    //Paths.get("C: /Usuarios/Kibe/meuArquivo.txt"); possivel criar com qq estensao
    Path arquivo = Paths.get("C:/Java/JavaTeste/src/LeituraEscritaArquivos/arquivo.txt");
    
    //USAR FILES é uma importacao
    //Files.write(CAMIINHO ,ARREY ED STRING ,OPCOES)
    Files.write (arquivo,linhas); 

    scanner.close();
    }
}
