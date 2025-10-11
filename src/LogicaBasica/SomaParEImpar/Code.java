package LogicaBasica.SomaParEImpar;

public class Code {
    public static void main(String[] args) {
        Integer num[] = {1,2,3,4,5,6,7,8,9,10};
        Integer somaPar = 0;
        Integer somaImpar = 0;

        for(int i = 0; i < num.length; i++){
            Integer nunAtual = num[i];

            if(nunAtual % 2 == 0){
                somaPar += nunAtual;
            }else{
                somaImpar += nunAtual;
            }
        }

        System.out.println("SOMA DOS PARES: " + somaPar);
        System.out.println("SOMA DOS IMPARES: " + somaImpar);
    }
}
