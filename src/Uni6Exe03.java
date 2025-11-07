import java.util.Scanner;

public class Uni6Exe03 {
    Scanner sc = new Scanner(System.in);

    double[] vetorReal = new double[12];

    public static void main(String[] args) {
        new Uni6Exe03();
    }

    Uni6Exe03() {
        lerVetorReal();
        ajustarValores();
        imprimirValorAtualizado();
    }

    private void lerVetorReal() {
        for (int i = 0; i < vetorReal.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número real: ");
            vetorReal[i] = sc.nextDouble();
        }
        System.out.println();
    }

    private void ajustarValores() {
        for (int i = 0; i < vetorReal.length; i++) {
            if ((i + 1) % 2 != 0) {
                vetorReal[i] *= 1.05;
            } else {
                vetorReal[i] *= 1.02;
            }
        }
    }

    private void imprimirValorAtualizado() {
        System.out.println("Valores atualizados:");
        for (int i = 0; i < vetorReal.length; i++) {
            System.out.printf("Posição %d: %.2f%n", (i + 1), vetorReal[i]);
        }
    }
}
