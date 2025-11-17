import java.util.Scanner;

public class Uni6Exe08 {

    public static void main(String[] args) {
        new Uni6Exe08();
    }

    Uni6Exe08() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe N (máx 20): ");
        int n = sc.nextInt();

        if (n < 1 || n > 20) {
            System.out.println("Valor inválido.");
            sc.close();
            return;
        }

        double vet[] = new double[n];
        lerValores(vet, sc);
        imprimirTabela(vet);

        sc.close();
    }

    private void lerValores(double[] vet, Scanner sc) {
        for (int i = 0; i < vet.length; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            vet[i] = sc.nextDouble();
        }
    }

    private void imprimirTabela(double[] vet) {

        boolean contado[] = new boolean[vet.length];

        System.out.println();
        System.out.println("  VALOR     FREQUÊNCIA");
        System.out.println(" -------------------------");

        for (int i = 0; i < vet.length; i++) {

            if (!contado[i]) {

                double valor = vet[i];
                int qtd = 1;

                for (int j = i + 1; j < vet.length; j++) {
                    if (vet[j] == valor) {
                        qtd++;
                        contado[j] = true;
                    }
                }

                System.out.printf("  %6.2f         %d\n", valor, qtd);
            }
        }

        System.out.println(" -------------------------");
    }
}
