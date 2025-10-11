package LogicaBasica.Fatorial;

public class Util {
    public static Long fatorial(Integer nun){
        if(nun == 0){
            return 1L;
        }
        if(nun<0){
            throw new IllegalArgumentException("Número inválido");
        }

        Long result = 1L;
        for(int i = 1; i <= nun; i++){
            result = result * i;
        }

        return result;
    }
}
