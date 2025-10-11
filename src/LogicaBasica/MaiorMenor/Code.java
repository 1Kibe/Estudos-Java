package LogicaBasica.MaiorMenor;

public class Code {
 public static void main(String[] args) {
    Integer numeros [] = {10, 5, 8, 20, 3, 15};
    Integer maior = 0;
    Integer menor = 0;

    for(Integer i=0;i<numeros.length;i++){
        Integer numeroatual = numeros[i];

        if(numeroatual > maior){
            maior = numeroatual;     
        }else if(numeroatual< menor || menor == 0){
            menor = numeroatual;
        }
    }

    System.out.println("MAIOR NUMERO: "+ maior);
    System.out.println("MENOR NUMERO: "+ menor);
    
 }
}
