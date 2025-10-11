package LogicaBasica.ClasseInstancia;

public class Main {
     public static void main(String[] args) {
        Produto PRODUTO = new Produto();
        PRODUTO.nome = "caneca";
        Produto.QUANTIDADE_MINIMA_ESTOQUE = 10;
        System.out.println(" 01 "+PRODUTO.nome);
        //PARA VARIAVEIS STATIC USAR A CLASSE
        System.out.println("MINIMO EM ESTOQUE: "+ Produto.QUANTIDADE_MINIMA_ESTOQUE);
        //USANDO O METODO DE OUTRO ARQUIVO
        Impressao.informacao("MINIMO EM ESTOQUE: "+ Produto.QUANTIDADE_MINIMA_ESTOQUE);
        
        Produto PRODUTO2 = new Produto();
        PRODUTO2.nome = "tv";
        Produto.QUANTIDADE_MINIMA_ESTOQUE = 2;
        System.out.println(" 02 "+PRODUTO2.nome);
        //PARA VARIAVEIS STATIC USAR A CLASSE
        System.out.println("MINIMO EM ESTOQUE: "+ Produto.QUANTIDADE_MINIMA_ESTOQUE);
        //USANDO O METODO DE OUTRO ARQUIVO
        Impressao.informacao("MINIMO EM ESTOQUE: "+ Produto.QUANTIDADE_MINIMA_ESTOQUE);
        
    }
}
