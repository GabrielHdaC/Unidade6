import java.util.Scanner;

public class Uni6Exe02 {
    Scanner sc = new Scanner(System.in);
    double[] vetorReal = new double[12];
    double media = 0;

    public static void main(String[] args) {
        new Uni6Exe02();
    }

    Uni6Exe02() {
        lerVetorReal();
        calcularMedia();
        imprimirMaioresQueMedia();
    }

    private void lerVetorReal() {
        for (int i = 0; i < vetorReal.length; i++) {
            System.out.print("Digite um número real: ");
            vetorReal[i] = sc.nextDouble();
        }
        System.out.println();
    }

    private void calcularMedia() {
        double soma = 0;
        for (int i = 0; i < vetorReal.length; i++) {
            soma += vetorReal[i];
        }
        media = soma / vetorReal.length;
    }

    private void imprimirMaioresQueMedia() {
        System.out.printf("Média dos valores: %.2f%n", media);
        System.out.println("Valores maiores que a média:");
        boolean encontrou = false;

        for (int i = 0; i < vetorReal.length; i++) {
            if (vetorReal[i] > media) {
                System.out.printf("%.2f ", vetorReal[i]);
                encontrou = true;
            }
        }

        if (!encontrou) {
            System.out.println("Nenhum valor é maior que a média.");
        }
    }
}
