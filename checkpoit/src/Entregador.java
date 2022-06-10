public class Entregador{

    public String idEntregador;
    public String nomeEntregador;
    public String placaVeiculoEntregador;

    public Entregador(String idEntregador, String nomeEntregador, String placaVeiculoEntregador){
        this.idEntregador = idEntregador;
        this.nomeEntregador = nomeEntregador;
        this.placaVeiculoEntregador = placaVeiculoEntregador;
    }

    public String exibirEntregador (){
        return "ID: " + this.idEntregador + "\nNome: " + this.nomeEntregador + "\nPlaca do veículo: " + this.placaVeiculoEntregador;
    }
}
