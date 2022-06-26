package mesa24;

enum Escalacao {
    TITULAR("Jogador Titular"),
    RESERVA("Jogador Reserva"),
    SUPLENTE("Jogador Suplente");

    private final String descricao;

    Escalacao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "Descriaoo: " + descricao + '\n';
    }
}