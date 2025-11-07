import java.util.Scanner;

public class Uni6Exe04 {
    Scanner sc = new Scanner(System.in);
    int[] vetor1 = new int[10];
    int[] vetor2 = new int[10];
    int[] vetor3 = new int[10];

    public static void main(String[] args) {
        new Uni6Exe04();
    }

    Uni6Exe04() {
        lerVetores();
        somarVetores();
        imprimirVetores();
    }

    private void lerVetores() {
        System.out.println("Digite os 10 valores do primeiro vetor:");
        for (int i = 0; i < vetor1.length; i++) {
            System.out.print("Vetor1[" + i + "]: ");
            vetor1[i] = sc.nextInt();
        }

        System.out.println("\nDigite os 10 valores do segundo vetor:");
        for (int i = 0; i < vetor2.length; i++) {
            System.out.print("Vetor2[" + i + "]: ");
            vetor2[i] = sc.nextInt();
        }
        System.out.println();
    }

    private void somarVetores() {
        for (int i = 0; i < vetor3.length; i++) {
            vetor3[i] = vetor1[i] + vetor2[i];
        }
    }

    private void imprimirVetores() {
        System.out.println("Vetor 1: ");
        for (int i = 0; i < vetor1.length; i++) {
            System.out.print(vetor1[i] + " ");
        }

        System.out.println("\nVetor 2: ");
        for (int i = 0; i < vetor2.length; i++) {
            System.out.print(vetor2[i] + " ");
        }

        System.out.println("\nVetor 3 (soma): ");
        for (int i = 0; i < vetor3.length; i++) {
            System.out.print(vetor3[i] + " ");
        }
        System.out.println();
    }
}
