package mesa20;

public class Conteiner{

    public Integer id;
    public String descricao;
    public Boolean materialPerigoso;
    public static String paisOrigem;

    public Conteiner(Integer id, String descricao, Boolean materialPerigoso, String paisOrigem) {
        this.id = id;
        this.descricao = descricao;
        this.materialPerigoso = materialPerigoso;
        Conteiner.paisOrigem = paisOrigem;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Boolean getMaterialPerigoso() {
        return materialPerigoso;
    }

    public void setMaterialPerigoso(Boolean materialPerigoso) {
        this.materialPerigoso = materialPerigoso;
    }

    public static String getPaisOrigem() {
        return paisOrigem;
    }

    public static void setPaisOrigem(String paisOrigem) {
        Conteiner.paisOrigem = paisOrigem;
    }

    @Override
    public String toString() {
        return "ID: " + id + " Descriao: " + descricao + " Material Perigoso: " + materialPerigoso + " Pais de Origem: " +paisOrigem +'\n';
    }
}
