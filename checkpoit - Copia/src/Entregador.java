import java.util.Random;

public class Entregador{

    public String nomeEntregador;
    public String idEntregador;
    public String placaVeiculoEntregador;

    public Entregador(String nomeEntregador, String idEntregador, String placaVeiculoEntregador) {
        this.nomeEntregador = nomeEntregador;
        this.idEntregador = idEntregador;
        this.placaVeiculoEntregador = placaVeiculoEntregador;
    }

    public Entregador() {

    }

    @Override
    public String toString() {
        return "Seu pedido sera entregue pelo (a) " + nomeEntregador + "\n" +
                "Possuindo a identificao " + idEntregador + '\n' +
                "e o veiculo com a seguinte placa " + placaVeiculoEntregador + '\n';
    }
}
