package LogicaBasica.Fatorial;

public class Code {
    public static void main(String[] args) {
        Integer nun[] = {5, 4, 3, 2, 1};
        for(Integer n : nun){
            System.out.println("Fatorial de " + n + " é: " + Util.fatorial(n));
        }
        
    }
}
