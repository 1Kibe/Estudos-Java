package LogicaBasica.Encapsulamento.Cliente;

public class Main {
    public static void main(String[] args) {
        Cliente CLIENTE = new Cliente();

        //CLIENTE.nome = "Alexande Afonso";
        //CLIENTE.telefone = "89237497";
        //
        //System.out.println(CLIENTE.nome);


        //USANDO O ENCAPSULAMETO
        CLIENTE.setNome("Jorge da Silva");
        CLIENTE.setTelefone("872346876");

        //PASSE OS METODOS get
        System.out.println(CLIENTE.getNome() + " tel: " + CLIENTE.getTelefone());
    }
}
