package LogicaBasica.LeituraEscritaDeAquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LeituraArquivo {
    public static void main(String[] args) throws IOException {

        Path arquivo = Paths.get("C:/Java/JavaTeste/src/LeituraEscritaArquivos/arquivo.txt");

        //forma padrao
        //read sendo ler todas a linhas
        List<String> linhas =  Files.readAllLines(arquivo);

        //sendo sendo igual ao lenfh
        for(int i =0;i<linhas.size();i++){
            //System.err.println(linhas);
            
            //linhas.get sendo igual a arrey[i]
            String texto = linhas.get(i);
            System.out.println(texto);
        }
    }
}
