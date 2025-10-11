package LogicaBasica.Encapsulamento.Pedido;

public class Main {
    public static void main(String[] args) {
        Pedido PEDIDO = new Pedido();

        PEDIDO.setCodigo("9837");
        PEDIDO.setSubtotal(200.0);
        PEDIDO.setDesconto(20.0);
        

        System.out.println("CODIGO DO PEDIDO: " + PEDIDO.getCodigo());
        System.out.println("VALOR DO PEDIDO: " + PEDIDO.getSubtotal());
        System.out.println("DESCONTO APLICADO: " + PEDIDO.getDesconto()+"%");
        System.out.println("VALOR TOTAL: " + PEDIDO.getTotal());
    }
}
