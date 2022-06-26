import java.util.Random;

public class Entregador{

    private String nomeEntregador;
    private String idEntregador;
    private String placaVeiculoEntregador;

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
                "Possuindo a identificao " + idEntregador +
                " e o veiculo com a seguinte placa " + placaVeiculoEntregador;
    }
}
