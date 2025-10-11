package LogicaBasica.OperadoresLogicos;

public class Code {
     public static void main(String[] args) {
        Boolean carrinhoMaior100 = true;
        Boolean peridoPromo = true;
       
        Boolean aplicarDesconto = carrinhoMaior100 && peridoPromo; //&& significa que os dois lados prescisa ser verdadeiros pra retornar verdade

        if(aplicarDesconto){
            System.out.println(aplicarDesconto);
        }else{
            System.out.println("negado");
        }
    }
}
