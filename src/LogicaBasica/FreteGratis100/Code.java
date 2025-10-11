package LogicaBasica.FreteGratis100;

import java.util.Scanner;

public class Code {
    static final Double freteGratis = 100.0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double frete = 15.0;

        System.out.print("INFORME O VALOR DO PRODUTO: ");
        Double valP = scanner.nextDouble();

        System.out.print("INFORME A QUANTIDADE: ");
        Integer quant = scanner.nextInt();

        Double subTOTAL = valP* quant;

        if(subTOTAL >= freteGratis){
         
            System.out.println("VALOR: "+subTOTAL);
            System.out.println("FRETE: GRATIS ACIMA DE 100,0 ");  
            System.out.println("VALOR TOTAL DE SUA COMPRA: "+subTOTAL);   
        }else{

            Double TOTAL = subTOTAL + frete;
            System.out.println("VALOR: "+subTOTAL);
            System.out.println("FRETE: "+frete);  
            System.out.println("VALOR TOTAL DE SUA COMPRA: "+TOTAL); 
        }

        scanner.close();
    }
}
