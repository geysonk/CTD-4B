import javax.swing.plaf.synth.SynthSpinnerUI;

public class ClienteNovo extends Cliente {

    protected static Boolean clienteNovo;

    public ClienteNovo(String nome, String sobrenome, String endereco, String telefone,String cpf, String email) {
        super(nome, sobrenome, endereco, telefone, cpf, email);
        this.clienteNovo = clienteNovo;
    }

    public static Boolean getClienteNovo() {
        return clienteNovo;
    }

    public static void setClienteNovo(Boolean clienteNovo) {
        ClienteNovo.clienteNovo = clienteNovo;
    }

    public ClienteNovo() {

    }

    public static String brinde() {
        if (clienteNovo == true) {
            return "Novo cliente, recebera Brinde!" + '\n';
        } else {
            return "Cliente recorrente, não recebera Brinde!" + '\n';
        }
    }
}




