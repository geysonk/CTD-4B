import java.sql.Time;

public class main {
    public static void main(String[] args) {

        System.out.println("Faca seu pedido: " + '\n');

//        //Será o cadastro do cliente (OK)
//        Cliente.inserirCliente();
//        Cliente cliente = new Cliente();
//        System.out.println(cliente);

        //Cliente novo
        ClienteNovo.inserirCliente();
        ClienteNovo clienteNovo = new ClienteNovo();
        System.out.println(clienteNovo);


        //Será o cadastro do pedido (OK)
        Pedido.fazerPedido();
        Pedido pedido = new Pedido();

//        Será o resumo do pedido
        System.out.println("Dados do cliente: " + '\n' + clienteNovo);
        System.out.println("Dados do pedido: " + '\n' + pedido);

        //Será os dados do entregador (OK)
        Entregador entregador = new Entregador("Jorge", "894563", "AbH5683");
        System.out.println("Dados do entregador: " + '\n' + entregador);

        //Pizzaria



    }

}