public class Main {

    public static void main(String[] args) {

        AdocaoCachorro adocao = new AdocaoCachorro("fred", 1999, 20.0, true);
        System.out.println("O cachorro "+adocao.getNome()+" pesa: "+adocao.getPeso()+" Kg");
        adocao.informacoesNecessarias(2, true);
        adocao.encaminharAdocao(true, 5.0);

    }
}