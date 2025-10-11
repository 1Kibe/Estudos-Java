package LogicaBasica.NumeroPrimo;

public class Util {
    public static Boolean verificarPrimo(Integer nun){
        if(nun <= 1){
            return false;
        }else if(nun == 2){     //O 2 é o único número primo par
            return true;
        }else if(nun % 2 == 0){ //Elimina todos os números pares maiores que 2
            return false;
        }

        for(int i = 3; i * i <= nun; i += 2){
            if(nun % i == 0){
                return false;
            }
        }

        return true;
    }
}
