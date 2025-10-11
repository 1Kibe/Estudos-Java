package LogicaBasica.Encapsulamento.Cliente;

public class Cliente {
     String nome;
    String telefone;
    String primeiroNome;
    String segundoNome;

    //ENCAPSULAMENTO
    //atalho para criar get e set
    //escreva get ou set e escolha
    //ou botao direito->source action-> e escolha
    String getNome(){
        return nome;
        //return primeiroNome + " " + segundoNome;
    }
    void setNome(String nome){
        //PARA REFERENCIAR A A INSTANCIA DA CLASSE NESCESSARIO COLOCAR THIS.INSTANCIA
        //this.instancia = valor;
        this.nome = nome;

        //esse nome.split quebra a string pelo que vc colocar no parenteses
        //String [] nomeCompleto = nome.split(" ");
        //primeiroNome = nomeCompleto[0];
        //segundoNome = nomeCompleto[1];
    }

    String getTelefone(){
        return telefone;
    }
    void setTelefone(String telefone){
        this.telefone = telefone;
    }
}
