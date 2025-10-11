package LogicaBasica.EstruturaSwitch;

import java.util.Scanner;

public class Code {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("DIGITE O MES: ");
        Integer mes = scanner.nextInt();

        Double desconto = 0.0;

// no switch n entra varivel do tipo DOUBLE
// pode-se usar tipo  INTEGER,  STRING, CHARECTER

        switch (mes) {
            case 1:
                desconto= 0.1;
                break;
                
                case 2:
                desconto= 0.2;
                break;
            case 3:
                desconto= 0.3;
                break;
            case 4:
                desconto= 0.4;
                break;
            case 5:
                desconto= 0.5;
                break;
            case 6:
                desconto= 0.6;
                break;
            case 7:
                desconto= 0.7;
                break;
            case 8:
                desconto= 0.8;
                break;
            case 9:
                desconto= 0.9;
                break;
            case 10:
                desconto= 0.10;
                break;
            case 11:
                desconto= 0.11;
                break;
            case 12:
                desconto= 0.12;
                break;
            default:
            System.err.println("MES INVALIDO");
                System.exit(1);
        
        }
        System.out.println(desconto);

        scanner.close();
    }
}
