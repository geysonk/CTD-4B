import java.sql.Time;
import java.util.Scanner;

public class Pedido {
    private static int quantidade;
    private static String formaPagamento;
    private static Boolean entregaDelivery;
    private static Time horaPedido;
    private static String tamanhoPizza;
    protected static Double valorPedido = 0.0;
    private static String saborPizza;

public Pedido (int quantidade, String formaPagamento, Boolean entregaDelivery, Time horaPedido, String tamanhoPizza, Double valorPedido, String saborPizza) {
    this.quantidade = quantidade;
    this.formaPagamento = formaPagamento;
    this.entregaDelivery = entregaDelivery;
    this.horaPedido = horaPedido;
    this.tamanhoPizza = tamanhoPizza;
    this.valorPedido = valorPedido;
    this.saborPizza = saborPizza;
}

    public Pedido() {

    }

    public static int getQuantidade() {
        return quantidade;
    }

    public static void setQuantidade(int quantidade) {
        Pedido.quantidade = quantidade;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public static void setFormaPagamento(String formaPagamento) {
        Pedido.formaPagamento = formaPagamento;
    }

    public Boolean getEntregaDelivery() {
        return entregaDelivery;
    }

    public static void setEntregaDelivery(Boolean entregaDelivery) {
        Pedido.entregaDelivery = entregaDelivery;
    }

    public Time getHoraPedido() {
        return horaPedido;
    }

    public void setHoraPedido(Time horaPedido) {
        Pedido.horaPedido = horaPedido;
    }

    public static String getTamanhoPizza() {
        return tamanhoPizza;
    }

    public static void setTamanhoPizza(String tamanhoPizza) {
        Pedido.tamanhoPizza = tamanhoPizza;
    }

    public static Double getValorPedido() {
        return valorPedido;
    }

    public static void setValorPedido(Double valorPedido) {
        Pedido.valorPedido = valorPedido;
    }

    public String getSaborPizza() {
        return saborPizza;
    }

    public static void setSaborPizza(String saborPizza) {
        Pedido.saborPizza = saborPizza;
    }

    public static void fazerPedido(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de pizzas: ");
        int quantidade = scanner.nextInt();
        setQuantidade(quantidade);

        System.out.println("Digite a forma de pagamento: ");
        String formaPagamento = scanner.next();
        setFormaPagamento(formaPagamento);

        System.out.println("Digite se deseja entrega (true/false): ");
        Boolean entregaDelivery = scanner.nextBoolean();
        setEntregaDelivery(entregaDelivery);

        System.out.println("Qual o tamanho da pizza? (1 - Pequena, 2 - Media, 3 - Grande)");
        String tamanhoPizza = scanner.next();

        if (tamanhoPizza.equals("1")){
            setTamanhoPizza("Pequena");
            setValorPedido(valorPedido = 20.0 * quantidade);
        } else if (tamanhoPizza.equals("2")){
            setTamanhoPizza("Media");
            setValorPedido(valorPedido = 30.0 * quantidade);
        } else if (tamanhoPizza.equals("3")){
            setTamanhoPizza("Grande");
            setValorPedido(valorPedido = 50.0 * quantidade);
        } else {
            System.out.println("Tamanho inválido");
        }

        System.out.println("Qual o sabor da pizza? (1 - Calabresa, 2 - Mussarela, 3 - Portuguesa)");
        String saborPizza = scanner.next();
        setSaborPizza(saborPizza);
    }


    public static Double valorFinalPedido(){
        return Pizzaria.calcularEntrega(valorPedido);
    }

    public static Double getValorFinalPedido() {
        return valorPedido;
    }
    public static void setValorFinalPedido(Double valorPedido) {
        System.out.println("O valor do pedido é: " + valorPedido);
    }

    @Override
    public String toString() {
        return "Qtd. Pizzas: " + quantidade + "\n" +
                "Forma de pagamento: " + formaPagamento + '\n' +
                "Tamanho da Pizza: " + tamanhoPizza + '\n' +
                "Valor do pedido: " + valorPedido + '\n';
    }
}

