public class ClienteNovo extends Cliente {
    private Boolean novoCliente;

    public ClienteNovo(String nome, String endereco, String telefone, String email, Boolean novoCliente) {
        super(nome, endereco, telefone, email);
        this.novoCliente = novoCliente;
    }

    @Override
    public String toString() {
        return "ClienteNovo{" +
                "novoCliente=" + novoCliente +
                '}';
    }
}

