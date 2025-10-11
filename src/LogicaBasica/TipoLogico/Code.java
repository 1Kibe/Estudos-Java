package LogicaBasica.TipoLogico;

public class Code {
    public static void main(String[] args) {
    Boolean variavelT = true;
    System.out.println("vairavel verdadeira: " + variavelT);

    Boolean variavelF = false;
    System.out.println("vairavel verdadeira: " + variavelF);

    System.out.println("--------------------------");

    Integer idade = 19;
    Boolean podeTirarCarteira = idade >= 18;

    if (podeTirarCarteira){
      System.out.println("Sim, pode tirar");
    }else{
      System.out.println("Nao, pode tirar");
    }

    // System.out.println("Pode tirar carteira?: " + podeTirarCarteira);

 }
}
