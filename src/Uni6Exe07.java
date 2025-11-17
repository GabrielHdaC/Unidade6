import java.util.Arrays;
import java.util.Scanner;

public class Uni6Exe07 {
    Scanner sc = new Scanner(System.in);

    int[] nVetor = new int[20];
    int valor;

    public static void main(String[] args) {
        new Uni6Exe07();
    }

    Uni6Exe07() {
        lerVetor();
        bubbleSort();
        imprimirVetor();
    }

    private void lerVetor() {
        for (int i = 0; i < nVetor.length; i++) {
            System.out.println("Digite o valor (N): ");
            int novoValor = sc.nextInt();

            if(valorExiste(novoValor)) {
                System.out.println("Valor: " + novoValor + ", já existe");
                i--;
            } else {
                nVetor[i] = novoValor;
                System.out.println("Valor " + novoValor + " adicionado com sucesso!");
            }
        }
    }

    private boolean valorExiste(int novoValor) {
        for (int i = 0; i < nVetor.length; i++) {
            if(nVetor[i] == novoValor) {
                return true;
            }
        }
        return false;
    }

    private void bubbleSort() {
        for (int i = 0; i < nVetor.length; i++) {

            int aux;
            boolean controle = true;

            for (int j = 0; j < nVetor.length - i - 1; j++) {
                if (nVetor[j] > nVetor[j + 1]) {
                    aux = nVetor[j];
                    nVetor[j] = nVetor[j + 1];
                    nVetor[j + 1] = aux;
                    controle = false;
                }
            }

            if (controle) {
                break;
            }
        }
    }

    private void imprimirVetor() {
        System.out.println("\nVetor ordenado:");
        for (int i = 0; i < nVetor.length; i++) {
            System.out.print(nVetor[i] + " ");
        }
        System.out.println();
    }
}