package LogicaBasica.InteracaoFOR;

public class Code {
     public static void main(String[] args) {

        String frase = "EXEMPLO DE FOR";

        // (condicao de inicio; limite ; acao em cada volta)
        for (int i = 0; i < 5; i++){
            System.out.println(i+ frase);
        }
        System.out.println("");



        //estrutura do arrey
        //// uma variavel que guarda varios valores
        Double [] carrinho = new Double[]{
            50.0, 
            50.0, 
            50.0
        };

        Double Total = 0.0;
                // accessa a informacao da posicao do arrey  .lenght
        for(int i=0; i< carrinho.length; i++){

            Total = Total + carrinho[i];  //adciona o valor da posicao do arrey na variavel
            System.out.println("posicao : "+ i);

            //Total += Total;
        }
        System.err.println("total "+ Total);
        System.out.println("");




        //exemplo de break em um valor da iteracao
        for(int i =0;i<10;i++){
            if(i==5){
                //break;          //para tudo e sai do for
                //continue;     //pula a volta atual
            }
            System.out.println(i);
        }
        System.out.println("");




        Integer [] produtos = new Integer[]
        {
            100,
            200,
            300
        };

        System.out.println("ENCONTRAR VALOR DO ARREY");
        for(int i =0;i< produtos.length;i++){

            Integer produto = produtos[i];

            if(produto.equals(200)){
                System.err.println("Produto achado");
                break;          //para tudo e sai do for
                //continue;     //pula a volta atual
            }
            
        }

        //ARREY.lenght puxa o tamanho total do arrey
        //ARREY[i] puxa o valor da posicao do loop

        System.out.println("");
    }
}
