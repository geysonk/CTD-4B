import javax.swing.plaf.synth.SynthSpinnerUI;

public class ClienteNovo extends Cliente {

    static Boolean clienteNovo;

    public ClienteNovo(String nome, String sobrenome, String endereco, String telefone,Integer cpf, String email) {
        super(nome, sobrenome, endereco, telefone, cpf, email);
        this.clienteNovo = clienteNovo;
    }

    public ClienteNovo() {

    }
}
//
//    public Boolean getClienteNovo() {
//        return clienteNovo;
//    }
//
//}




