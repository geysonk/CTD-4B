import java.sql.Time;
import java.time.DateTimeException;
import java.time.format.DateTimeFormatter;

public class Pizzaria {
        private String produto;
        private Double valorPedido;
        private Time horaPedido;
        private String formaPagamento;
        private String tamanhoPizza;


    public Pizzaria(String produto, Double valorPedido, Time horaPedido) {
        this.produto = produto;
        this.valorPedido = valorPedido;
        this.horaPedido = horaPedido;

    }

    public Double calcularEntrega (Double valorPedido) {

        if (valorPedido < 50){
            return valorPedido * 0.5;
        } else {
            return valorPedido;
        }

    }

    public Double calcularDesconto(Boolean clienteNovo) {
        if (clienteNovo = true) {
            return valorPedido - 10;
        } else {
            return valorPedido;
        }
    }

    public Double getcalcularDesconto(Boolean clienteNovo) {
        return calcularDesconto(clienteNovo);
    }
}
