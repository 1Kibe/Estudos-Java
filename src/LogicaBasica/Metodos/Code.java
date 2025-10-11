package LogicaBasica.Metodos;

import java.util.Scanner;

public class Code {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String [] CURSOS = new String[] {"Java","C#","Python"};
        String [] FORMA_PAGAMENTO = new String[] {"Cartão","Boleto","PIX"};

        System.out.println("");
        System.out.println("ESCOLHA O CURSO DESEJADO: ");
        for(int i = 0; i < CURSOS.length; i++){
            System.out.println("[" + i + "] " + CURSOS[i]);
        }
        System.out.println("");
        System.out.print("ESCOLHA: ");
        Integer escolha = scanner.nextInt();
        
        Boolean verificacaoCURSOS = escolha >= 0 && escolha < CURSOS.length;

        if(!verificacaoCURSOS){
            System.err.println("ESCOLHA INVALIDA");
            System.exit(1);
        }

        System.out.println("");
        System.out.println("ESCOLHA A FORMA DE PAGAMENTO: ");
        for(int i = 0; i < FORMA_PAGAMENTO.length; i++){
            System.out.println("[" + i + "] " + FORMA_PAGAMENTO[i]);
        }
        System.out.println("");
        System.out.print("ESCOLHA: ");
        Integer escolha1 = scanner.nextInt();

        Boolean verificacaoFORMAPAGAMENTO = escolha1 >= 0 && escolha1 < FORMA_PAGAMENTO.length;

        if(!verificacaoFORMAPAGAMENTO){
            System.err.println("ESCOLHA INVALIDA");
            System.exit(1);
        }

        
        PRINT_ESPACAMENTO();//CHAMANDO METODO CRIADO
        PRINT_ESPACAMENTO();
        System.out.println("SUA ESCOLHA DE CURSO ATUAL: "+ CURSOS[escolha]+" E SUA FORMA DE PAGAMENTO: "+FORMA_PAGAMENTO[escolha1]);
        PRINT_ESPACAMENTO();

        scanner.close();
    }

    //METODO CRIADO
    static void PRINT_ESPACAMENTO() {
        System.out.println("");
    }
}
