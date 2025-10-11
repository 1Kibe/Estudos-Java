package LogicaBasica.Bibliotecas;

// Importa a classe Interacao da biblioteca criada
import Console.Interacao;

public class Main2 {
    public static void main(String[] args) {
        Interacao interacao = new Interacao();

        Double valorCompra = interacao.lerDecimal("Digite o valor da compra: ");
        Double valorPago = interacao.lerDecimal("Digite o valor pago: ");
        Double troco = calcularTroco(valorCompra, valorPago);

        interacao.imprimir("O troco é: " + troco);
    }

    public static Double calcularTroco(Double A, Double B) {
        Double troco = A - B;
        return troco;
    }
}
