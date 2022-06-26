import java.util.Scanner;

public class Cliente {

    private static String nome;
    private static String sobrenome;
    private static String endereco;
    private static String telefone;
    private static Integer cpf;
    private static String email;
    private static Boolean clienteNovo;

public Cliente(String nome, String sobrenome, String endereco, String telefone, Integer cpf, String email) {
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


    public String getNome() {
        return nome;
    }

    public static void setNome(String nome) {
        Cliente.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public static void setSobrenome(String sobrenome) {
        Cliente.sobrenome = sobrenome;
    }

    public String getEndereco() {
        return endereco;
    }

    public static void setEndereco(String endereco) {
        Cliente.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public static void setTelefone(String telefone) {
        Cliente.telefone = telefone;
    }

    public Integer getCpf() {
        return cpf;
    }

    public static void setCpf(Integer cpf) {
        Cliente.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public static void setEmail(String email) {
        Cliente.email = email;
    }


    // Método para cadastrar o cliente

    public static void inserirCliente() {

        Scanner scanner = new Scanner(System.in);

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
        System.out.println("Digite o telefone do cliente: ");
        telefone = scanner.next();
        setTelefone(telefone);

        Integer cpf;
        System.out.println("Digite o cpf do cliente: ");
        cpf = scanner.nextInt();
        setCpf(cpf);

        String email;
        System.out.println("Digite o email do cliente: ");
        email = scanner.next();
        setEmail(email);



        System.out.println("Dados do cliente: ");
    }

    @Override
    public String toString() {
        return "Nome: " + nome + '\n' +
                "Sobrenome: " + sobrenome + '\n' +
                "Endereco: " + endereco + '\n' +
                "Telefone: " + telefone + '\n' +
                "Cpf: " + cpf + '\n' +
                "E-mail: " + email + '\n';
    }
}





