import java.sql.Time;

public class Entrega extends Pedido {

    public Entrega(int quantidade, String formaPagamento, Boolean entregaDelivery, Time horaPedido) {
        super(quantidade, formaPagamento, entregaDelivery, horaPedido);
    }

}
