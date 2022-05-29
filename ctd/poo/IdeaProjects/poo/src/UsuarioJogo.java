public class UsuarioJogo {
    private String nome;
    private String nickname;
    private Integer pontuacao = 0;
    private Integer nivel = 1;

    public UsuarioJogo(String nome, String nickname) {
        this.nome = nome;
        this.nickname = nickname;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNick(String nickname) {
        this.nickname = nickname;
    }

    public String getNick() {
        return this.nickname;
    }

    protected void setPontuacao(int valor) {
        this.pontuacao = valor;
    }

    public int getPontuacao() {
        return this.pontuacao;
    }

    public void aumentarPontuacao(int valor) {
        setPontuacao(this.pontuacao + valor);
    }

    protected void setNivel(int valor) {
        this.nivel = valor;
    }

    public int getNivel() {
        return this.nivel;
    }

    public void subirNivel() {
        setNivel(this.nivel += 1);
    }

    public void bonus(int valor) {
        setPontuacao(this.pontuacao * valor);
    }

}