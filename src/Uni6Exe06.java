import java.util.Scanner;

public class Uni6Exe06 {
    private Scanner sc = new Scanner(System.in);
    private double[] vetor;

    public static void main(String[] args) {
        new Uni6Exe06();
    }

    Uni6Exe06() {
        lerVetor();
        verificarValor();
    }

    private void lerVetor() {
        System.out.println("Digite o tamanho do vetor (N): ");
        int n = sc.nextInt();

        vetor = new double[n];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o valor real para a posição " + (i + 1) + ": ");
            vetor[i] = sc.nextDouble();
        }
    }

    private boolean encontrarValor(double valorProcurado) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == valorProcurado) {
                return true;
            }
        }
        return false;
    }

    private void verificarValor() {
        System.out.println("Digite um valor real para verificar se está cadastrado: ");
        double valorVerificar = sc.nextDouble();

        boolean encontrado = encontrarValor(valorVerificar);

        if (encontrado) {
            System.out.println("O valor " + valorVerificar + " está cadastrado no vetor.");
        } else {
            System.out.println("O valor " + valorVerificar + " NÃO está cadastrado no vetor.");
        }
    }
}