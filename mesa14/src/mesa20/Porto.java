package mesa20;

import java.util.ArrayList;
import java.util.List;

public class Porto {
    public String nome;
    protected static List<Conteiner> conteineres;

    public Porto(String nome) {
        this.nome = "Porto de Buenos Aires";
        conteineres = new ArrayList<>();
    }

    public void addConteiner(Conteiner conteiner) {
        conteineres.add(conteiner);
    }

    public static List<Conteiner> getConteineres() {
        return conteineres;
    }
    public void calcularConteinersPerigosos() {
        int cont = 0;
        for (Conteiner conteiner : conteineres) {
            if (conteiner.materialPerigoso && Conteiner.paisOrigem.equals("Desconhecido")) {
                cont++;
            }
        }
        System.out.println("O porto " + this.nome + " possui " + cont + " conteinere (s) perigosos sem origem definida.");
    }

    @Override
    public String toString() {
        return "Porto" + nome + " possui " + conteineres.size() + " conteineres." + '\n';
    }




}
