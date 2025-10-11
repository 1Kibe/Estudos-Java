package LogicaBasica.EstruturaDecisao;

public class Code {
     public static void main(String[] args) {
        Boolean metadevalor = true;
        Boolean tempoNescessario = true;
        Boolean nomeLimpo = true;

        Boolean liberarEmprestimo = metadevalor && tempoNescessario && nomeLimpo;

        if(liberarEmprestimo){
            System.out.println("Liberado emprestimo");
        }
    }
}
