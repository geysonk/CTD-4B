
import java.sql.Time;
import java.time.LocalTime;

import static sun.awt.util.PerformanceLogger.setTime;

public class Pizzaria {

    private static Time horaPedido = Time.valueOf(LocalTime.now());;
    protected static String formaPagamento;

    public Pizzaria(Time horaPedido, String formaPagamento) {

        this.horaPedido = horaPedido;
        this.formaPagamento = formaPagamento;
    }

    public Pizzaria() {

    }

    public static void setHoraPedido(Time horaPedido) {
        Pizzaria.horaPedido = horaPedido;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public static void setFormaPagamento(String formaPagamento) {
        Pizzaria.formaPagamento = formaPagamento;
    }

    public static Double calcularEntrega(Double valorPedido) {

        if (valorPedido < 100){
            System.out.println("Entrega padrao: R$ 8,00");
            System.out.println('\n');
            return Pedido.valorPedido + 8.0;
        } else {
            System.out.println("Entrega gratuita!");
            return Pedido.valorPedido;
        }

    }

    public Double valorFinalPedido() {
        return Pedido.valorPedido + calcularEntrega(Pedido.valorPedido);
    }

    public static Time previsaoEntrega() {
        return Time.valueOf(LocalTime.now().plusMinutes(30));
    }

    @Override
    public String toString() {
        return "Pedido feito as  " + horaPedido + "\n" +
               "Previsao de entrega: " + previsaoEntrega()+ "\n" +
               "Forma de Pagamento: " + formaPagamento;
    }
}
