package LogicaBasica.OrientacaoObjetos.Produtos;

public class Main {
     public static void main(String[] args) {
        //IGUAL O SCANNER, TENQ CHAMR A CLASSE
        Produto PRODUTO = new Produto();

        //COLOCANDO VALORES NA CLASSE
        PRODUTO.nome = "TV";
        PRODUTO.precoUnitario = 500.0;
        PRODUTO.quantidadeEstoque = 4;

        //CHAMA O METODO E PASSA A VARIVAEL DECLARADA LA EMSIMA COMO PARAMETRO
        exibirQuantidadeEstoque(PRODUTO);
        
    }

    //CLASSE CRIADA SE TORNOU A TIPAGEM DO PARAMETRO
    static void exibirQuantidadeEstoque(Produto produto) {

        //ACESSAR OS ATRIBUTOS DA CLASSE
        //nomeDadoAClasse.atributo
        System.out.println(produto.nome + " :Quantidade em estoque: " + produto.quantidadeEstoque);
    }
}
