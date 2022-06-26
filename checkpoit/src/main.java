import java.sql.Time;

public class main {
    public main(String[] args) {

        System.out.println('\n' + "Pizzaria" + '\n');
        System.out.println("Faca seu pedido: " + '\n');
        System.out.println("+----------------------------------------------------+");



        //Cliente novo
        ClienteNovo.inserirCliente();
        ClienteNovo clienteNovo = new ClienteNovo();

        //Será o cadastro do pedido (OK)
        Pedido.fazerPedido();
        Pedido pedido = new Pedido();

        System.out.println("+----------------------------------------------------+");

        //Pizzaria
        Pizzaria pizzaria = new Pizzaria();
        System.out.println("Dados do pedido: " + '\n' + pizzaria);
        System.out.println(pedido);
        System.out.println("Valor total do pedido: " + '\n' + Pedido.valorFinalPedido());

        //Print resumo pedido
        System.out.println("+----------------------------------------------------+");
        System.out.println(ClienteNovo.brinde());
        System.out.println("Cliente" + '\n' + clienteNovo + '\n');


        //Será os dados do entregador (OK)
        Entregador entregador = new Entregador("Jorge", "894563", "AbH5683");
        System.out.println("Dados do entregador " + '\n' + entregador);
    }
}