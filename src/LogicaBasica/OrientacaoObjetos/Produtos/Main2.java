package LogicaBasica.OrientacaoObjetos.Produtos;

public class Main2 {
    public static void main(String[] args) {
        //CLASSE   NOME 
        Produto produto = new Produto();
        produto.quantidadeEstoque = 10;

        //ATRIBUI O RETORNO DO METODO A VARIAVEL  parametro sendo a varivael produto criada na linha 6
        Boolean estoquBoolean = verificarEstoque(produto);

        if(!estoquBoolean){
            System.out.println("ESTOQUE ABAIXO DO ESPERADO!!: " + produto.quantidadeEstoque );
        }
        
    }

    static Boolean verificarEstoque(Produto produto) {
        if(produto.quantidadeEstoque < 10){
            return false;
        }else{
            return true;
        } 
    }
}
