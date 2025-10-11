package LogicaBasica.AlterarVariavel;

import java.util.Scanner;

public class Code {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do produto: ");
        Double valor = scanner.nextDouble();

        System.out.print("Digite tipo do pagamento[1 = a vista / 2 = a prazo]: ");
        Integer pagamento = scanner.nextInt();
        Boolean pagVista = pagamento.equals(1); //esse.equals significal "é igual ao que esta no parenteses?"

        Double juros = 0.0;
        if (!pagVista){ // ! nega o valor no caso ficaria se fosse falso
            juros = 10.0;
        }

        Double acressimo = valor * juros /100;
        Double total = acressimo + valor;

        System.out.print("Valor total será: "+ total);
        
        scanner.close();
    }
}
