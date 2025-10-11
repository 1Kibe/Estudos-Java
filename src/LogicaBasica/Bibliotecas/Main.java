package LogicaBasica.Bibliotecas;

// Importa a classe Interacao da biblioteca criada
import Console.Interacao;

public class Main {
    public static void main(String[] args) {

        //COLOQUE OS .JAR NA LIB GLOBAL, SUMA IMPORTANCIA
        Interacao interacao = new Interacao();

        // Exemplo de uso da classe Interacao da blibioteca criada
        Integer numero = interacao.lerNumero("Digite um número: ");
        //chama o método imprimir da classe Interacao dentro da biblioteca criada 
        interacao.imprimir("Você digitou: " + numero);

        // Exemplo de uso da classe Interacao da biblioteca criada
        Double decimal = interacao.lerDecimal("Digite um número decimal: ");
        //chama o método imprimir da classe Interacao dentro da biblioteca criada
        interacao.imprimir("Você digitou: " + decimal);

        // Fecha o scanner para evitar vazamento de recursos
        interacao.fechar();

    }
}
