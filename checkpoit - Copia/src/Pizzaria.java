import java.sql.Time;

public class Pizzaria {
        private Time horaPedido;
        private String formaPagamento;
        private String tamanhoPizza;

    public Pizzaria(Double valorPedido, Time horaPedido, String formaPagamento, String tamanhoPizza) {

        this.horaPedido = horaPedido;
        this.formaPagamento = formaPagamento;
        this.tamanhoPizza = tamanhoPizza;
    }



    public static Double calcularEntrega(Double valorPedido) {

        if (valorPedido < 50){
            return Pedido.valorPedido + 4;
        } else {
            return Pedido.valorPedido;
        }

    }

    @Override
    public String toString() {
        return "Produto: " + produto + '\n' +
                "Tamanho da Pizza: " + tamanhoPizza + '\n';
    }
}
