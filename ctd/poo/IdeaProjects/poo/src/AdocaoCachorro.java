import java.time.LocalDate;

public class AdocaoCachorro {

    private Boolean aptidao;
    private String nome;
    private String raca;
    private Integer anoNascimento;
    private Double peso;
    private Boolean chip;
    private Boolean ferido;

    public AdocaoCachorro(String nome, Integer anoNascimento, Double peso, Boolean aptidao) {

        this.nome = nome;
        this.anoNascimento = anoNascimento;
        this.peso = peso;
        this.aptidao = aptidao;
    }

    public AdocaoCachorro(String nome, Boolean aptidao, String raca, Integer anoNascimento, Double peso, Boolean chip, Boolean ferido) {

        this.nome = nome;
        this.aptidao = aptidao;
        this.raca = raca;
        this.anoNascimento = anoNascimento;
        this.peso = peso;
        this.chip = chip;
        this.ferido = ferido;
    }

    //Encapsulamento

    protected void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }
    protected void setAptidao(Boolean aptidao) {
        this.aptidao = aptidao;
    }
    public Boolean getAptidao() {
        return this.aptidao;
    }
    protected void setRaca(String nome) {
        this.raca = raca;
    }
    public String getRaca() {
        return this.raca;
    }
    protected void setAnoNascimento(Integer anoNascimento) {
        this.anoNascimento = anoNascimento;
    }
    public Integer getAnoNascimento() {
        return this.anoNascimento;
    }
    protected void setPeso(Double peso) {
        this.peso = peso;
    }
    public Double getPeso() {
        return this.peso;
    }
    protected void setChip(Boolean chip) {
        this.chip = chip;
    }
    public Boolean getChip() {
        return this.chip;
    }
    protected void setFerido(Boolean ferido) {
        this.ferido = ferido;
    }
    public Boolean getFerido() {
        return this.ferido;
    }


    //Construcao dos metodos

public void informacoesNecessarias(Integer idade, Boolean chip){

    System.out.println("possui "+( LocalDate.now().getYear() - getAnoNascimento())+" anos");

        if (this.chip = true){
            System.out.println("possui chip");
        }else{
            System.out.println("não possui chip!");
        }
}
public void encaminharAdocao(Boolean ferido, Double peso){

        if (ferido || peso <=5.0){
            System.out.println("não poderá ser adotado");

        }else{
            System.out.println("poderá ser adotado!");

        }
}


}
