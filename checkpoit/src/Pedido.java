import java.sql.Time;

public class Pedido {
    private int quantidade;
    private String formaPagamento;
    private Boolean entregaDelivery;
    private Time horaPedido;

    public Pedido(int quantidade, String formaPagamento, Boolean entregaDelivery, Time horaPedido) {
        this.quantidade = quantidade;
        this.formaPagamento = formaPagamento;
        this.entregaDelivery = entregaDelivery;
        this.horaPedido = horaPedido;
    }

    public static void fazerPedido(int quantidade, String formaPagamento, Boolean entregaDelivery, Time horaPedido) {
        Pedido pedido = new Pedido(quantidade, formaPagamento, entregaDelivery, horaPedido);
        System.out.println("Pedido realizado com sucesso!");
        System.out.println("Quantidade: " + pedido.quantidade);
        System.out.println("Forma de pagamento: " + pedido.formaPagamento);
        System.out.println("Entrega: " + pedido.entregaDelivery);
        System.out.println("Hora do pedido: " + pedido.horaPedido);
    }
}
