import java.util.Scanner;

public class aula3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o nome do cachorro: ");
        String nome = scanner.next();
        System.out.println("Informe a quantidade de comida em KG: ");
        int come = scanner.nextInt();

        if (come < 3){
            System.out.println("Comida menor que 3KG");
        } else {
            int totalPacotes = quantosPacotes(come);
            System.out.println(nome + " precisa de "+ totalPacotes + " pacotes");
        }
    }
    private static int quantosPacotes(int kg){
        int quantidadePacotes = 0;
        double somaPeso = 0;

        while (somaPeso < kg) {
            quantidadePacotes++;

            Scanner scanner = new Scanner(System.in);

            System.out.println("Informe o peso do pacote: ");
            double peso = scanner.nextDouble();
            somaPeso = peso + somaPeso;
        }




        return quantidadePacotes;
    }
}
