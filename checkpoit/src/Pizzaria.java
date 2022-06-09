import java.sql.Time;
import java.time.DateTimeException;
import java.time.format.DateTimeFormatter;

public class Pizzaria {
        private String produto;
        private Double valorPedido;
        private String status;
        private Time horaPedido;
        private Time horaEntrega;

    public Pizzaria(String produto, Double valorPedido, String status, String dataPedido, String dataEntrega) {
        this.produto = produto;
        this.valorPedido = valorPedido;
        this.status = status;
        this.horaPedido = horaPedido;
        this.horaEntrega = horaEntrega;
    }

    public Double calcularEntrega (Double valorPedido) {
        if (valorPedido < 50){
            return valorPedido * 0.5;
        } else {
            return valorPedido;
        }
    }
    public String exibirStatusPedido (String status) {
        return status;
    }

}
