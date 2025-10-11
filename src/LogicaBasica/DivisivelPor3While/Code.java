package LogicaBasica.DivisivelPor3While;

public class Code {
     public static void main(String[] args) {
        Integer [] NUMEROS = new Integer[] {
            1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20
        };


        System.out.println(" ");
        System.out.println("NUMEROS DIVISIVEIS POR 3 ATE 20");
        int i = 0;
        while(i<NUMEROS.length){

            //if(NUMEROS[i] % 3 == 0){
            //    System.out.print(NUMEROS[i]+" ");
            //    i++;
            //}
            Integer Modulo = NUMEROS[i] % 3;
            if(Modulo.equals(0)){
                System.out.print(NUMEROS[i]+" ");
                i++;
            }
            i++;
        }
        System.out.println(" ");
    }
}
