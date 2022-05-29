import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Digite um numero: ");
        int valor = scanner.nextInt();

        if (valor >=2 && ePrimo(valor)){
            System.out.println("E primo");

        }else{
            System.out.println("Nao e primo");
        }

    };
        private static boolean ePrimo(int valor) {

            boolean primo;

            for (int i = 2; i < valor; i++) {
                if (valor % 2 == 0) {
                    primo = false;
                    break;
                }else{
                    primo = true;
                    System.out.println(i++);
                    break;
                }
            }
            return primo;
        }
    };


