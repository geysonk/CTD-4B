import java.util.Scanner;

public class Cliente {

    private static String nome;
    private static String sobrenome;
    private static String endereco;
    private static String telefone;
    private static String cpf;
    private static String email;

public Cliente(String nome, String sobrenome, String endereco, String telefone, String cpf, String email) {
    this.nome = nome;
    this.sobrenome = sobrenome;
    this.endereco = endereco;
    this.telefone = telefone;
    this.cpf = cpf;
    this.email = email;


    }

    public Cliente() {

    }

//    Pedido pedido = new Pedido();


// Getters and Setters


    public static void setNome(String nome) {
        Cliente.nome = nome;
    }

    public static void setSobrenome(String sobrenome) {
        Cliente.sobrenome = sobrenome;
    }

    public static void setEndereco(String endereco) {
        Cliente.endereco = endereco;
    }

    public static void setTelefone(String telefone) {
        Cliente.telefone = telefone;
    }

    public static void setCpf(String cpf) {
        Cliente.cpf = cpf;
    }

    public static void setEmail(String email) {
        Cliente.email = email;
    }


    // Método para cadastrar o cliente

    public static void inserirCliente() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("E um novo cliente? (true/false)");
        ClienteNovo.clienteNovo = scanner.nextBoolean();
        ClienteNovo.setClienteNovo(ClienteNovo.clienteNovo);

        String nome;
        System.out.println("Digite o nome do cliente: ");
        nome = scanner.next();
        setNome(nome);


        String sobrenome;
        System.out.println("Digite o sobrenome do cliente: ");
        sobrenome = scanner.next();
        setSobrenome(sobrenome);

        String endereco;
        System.out.println("Digite o endereco do cliente: ");
        endereco = scanner.next();
        setEndereco(endereco);

        String telefone;
        System.out.println("Digite o telefone do cliente (Apenas numeros): ");
        telefone = scanner.next();
        setTelefone(telefone);

        String cpf;
        System.out.println("Digite o cpf do cliente (Apenas numeros): ");
        cpf = scanner.next();
        setCpf(cpf);

        String email;
        System.out.println("Digite o email do cliente: ");
        email = scanner.next();
        setEmail(email);
    }

    @Override
    public String toString() {
        return "Nome:  " + nome + " " + sobrenome + '\n' +
               "Endereco: " + endereco + '\n' +
               "Telefone: " + telefone + '\n' +
               "CPF: " + cpf + '\n' +
               "E-mail: " + email;
    }
}





