package LogicaBasica.ArraysEMatrizes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import Console.Interacao;

public class Code {
    public static void main(String[] args) throws IOException {

        //CHAMADAS
        ArrayList<String> linhas = new ArrayList<>();
        Path arquivo = Paths.get("C:/Java/JavaTeste/src/EXListaDiminamica/file.txt");

        //VERIFICADOR DE EXISTENCIA DO ARQUIVO
        if(Files.exists(arquivo)){
            linhas.addAll(Files.readAllLines(arquivo));
        }else {
            Files.createFile(arquivo);
        }

        //CHAMA A ORDENACAO
        ordenar(linhas);
        //SALVA TODAS AS LINHAS DO ARRAY NO ARQUIVO
        Files.write(arquivo,linhas);
        //IMPRIME
        impressaoFor(linhas);
        
    }

//-----------------------------------------------------------------------------------------------------------------

    static void impressaoFor(ArrayList<String> Arrey) {
        Interacao bibliotecaPropria = new Interacao();

        for(int i = 0;i < Arrey.size() ; i++){
            bibliotecaPropria.imprimir((i+1)+"_ " + Arrey.get(i));
        }
    }

    //ORDENACAO adaptada para ArrayList
     static void ordenar(ArrayList<String> Arrey) {
        //COMEÇA NA SEGUNDA POSICAO PARA COMPARACAO
        for(int i = 1; i < Arrey.size(); i++){

            //SETANDO VALORES
            String valorPosicaoBase = Arrey.get(i);
            int indicePosicaoBase = i;
            
            while (indicePosicaoBase > 0) {

                //SETANDO VALORES ANTECESSORES
                int indicePosicaoAnterior = indicePosicaoBase - 1;
                String valorPosicaoAnterior = Arrey.get(indicePosicaoAnterior);

                //VERIFICADOR DE ORDENAÇAO
                // Se a anterior vem depois, move ela pra frente
                if(valorPosicaoAnterior.compareTo(valorPosicaoBase) > 0){
                    Arrey.set(indicePosicaoBase,valorPosicaoAnterior);
                    indicePosicaoBase --;
                }else{
                    break; // encontrou posição correta
                }

            }

            // Coloca o valor original na posição certa
            Arrey.set(indicePosicaoBase, valorPosicaoBase);
        }
    }
}
