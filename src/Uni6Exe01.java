import java.util.Scanner;

public class Uni6Exe01 {
    Scanner sc = new Scanner(System.in);
    int[] vetorInverso = new int[10];

    public static void main(String[] args) {
        new Uni6Exe01();
    }

    Uni6Exe01() {
        lerVetor();
        imprimirInverso();
    }

    private void lerVetor() {
        for (int i = 0; i < vetorInverso.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            vetorInverso[i] = sc.nextInt();
        }
    }

    private void imprimirInverso() {
        System.out.println("\nNúmeros na ordem inversa:");
        for (int i = vetorInverso.length - 1; i >= 0; i--) {
            System.out.print(vetorInverso[i] + " ");
        }
        System.out.println();
    }
}
