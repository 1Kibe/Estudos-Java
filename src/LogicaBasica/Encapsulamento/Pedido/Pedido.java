package LogicaBasica.Encapsulamento.Pedido;

public class Pedido {
     Double total;
    String codigo; 
    Double subtotal;
    Double desconto;

    // GETS
    public String getCodigo() {
        return codigo;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public Double getDesconto() {
        return desconto;
    }

    public Double getTotal() {
        //return subtotal-(subtotal*desconto);
        return subtotal-(subtotal*desconto/100);
    }


    //SETS
    //setTotal inexistente
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }
    
    public void setDesconto(Double desconto) {
        //this.desconto = desconto /100;
        this.desconto = desconto;
    }
}
