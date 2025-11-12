import java.util.Scanner;

public class Uni6Exe10 {

    public static void main(String[] args) {
        new Uni6Exe10();
    }

    Uni6Exe10() {
        Scanner sc = new Scanner(System.in);

        int vet[] = new int[50];
        int posFim = 0;

        System.out.println("\033[H\033[2J");

        int opcao;
        do {
            System.out.println("-- Menu --");
            System.out.println("1 - Incluir valor");
            System.out.println("2 - Pesquisar valor");
            System.out.println("3 - Alterar valor");
            System.out.println("4 - Excluir valor");
            System.out.println("5 - Mostrar valores");
            System.out.println("6 - Ordenar valores");
            System.out.println("7 - Inverter valores");
            System.out.println("8 - Sair do sistema");

            System.out.print("Opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    posFim = incluir(vet, posFim, sc);   // <<< CORRIGIDO
                    break;
                case 2:
                    pesquisar(vet, posFim, sc);
                    break;
                case 3:
                    alterar(vet, posFim, sc);
                    break;
                case 4:
                    posFim = excluir(vet, posFim, sc);
                    break;
                case 5:
                    mostrar(vet, posFim);
                    break;
                case 6:
                    ordenar(vet, posFim);
                    break;
                case 7:
                    inverter(vet, posFim);
                    break;
                case 8:
                    System.out.println("-- FIM --");
                    break;
                default:
                    System.out.println("-- Opção Inválida --");
                    break;
            }
        } while (opcao != 8);
    }

    private int incluir(int vet[], int posFim, Scanner sc) {
        if (posFim < vet.length) {
            System.out.print("valor: ");
            vet[posFim] = sc.nextInt();
            System.out.println("incluindo valor em: " + posFim + ".");
            posFim++;
        } else {
            System.out.println("não incluido, vetor cheio.");
        }
        return posFim;
    }

    private int pesquisar(int vet[], int posFim, Scanner sc) {
        System.out.print("pesquisar: ");
        int valor = sc.nextInt();

        for (int i = 0; i < posFim; i++) {      // <<< CORRIGIDO: só até posFim
            if (valor == vet[i]) {
                System.out.println("Encontrado na posição: " + i + ".");
                return i;
            }
        }

        System.out.println("Não encontrado, pesquisado com valor: " + valor + ".");
        return -1;
    }

    private void alterar(int vet[], int posFim, Scanner sc) {
        int valorID = pesquisar(vet, posFim, sc);

        if (valorID != -1) {                    // <<< CORRIGIDO
            System.out.print("Novo valor: ");
            vet[valorID] = sc.nextInt();
            System.out.println("alterando valor: " + vet[valorID] + ".");
        }
    }

    private int excluir(int vet[], int posFim, Scanner sc) {
        int valorID = pesquisar(vet, posFim, sc);

        if (valorID != -1) {                     // <<< CORRIGIDO
            for (int i = valorID; i < posFim - 1; i++) {
                vet[i] = vet[i + 1];
            }
            posFim--;
            System.out.println("excluido com sucesso.");
        }
        return posFim;                           // <<< CORRIGIDO
    }

    public void mostrar(int vet[], int posFim) {
        for (int i = 0; i < posFim; i++) {
            System.out.println("valor(es): " + vet[i] + ".");
        }
    }

    private void ordenar(int vet[], int posFim) {
        int bolha;
        for (int i = 0; i < posFim - 1; i++) {
            if (vet[i] > vet[i + 1]) {
                bolha = vet[i];
                vet[i] = vet[i + 1];
                vet[i + 1] = bolha;
                i = -1;
            }
        }

        System.out.println("valor(es) ordenado(s).");
    }

    private void inverter(int vet[], int posFim) {
        for (int i = 0; i < posFim; i++) {

            int temp = 0;
            for (int j = 0; j < i; j++) {
                temp = vet[i];
                vet[i] = vet[j];
                vet[j] = temp;
            }
        }

        System.out.println("valores invertidos.");
    }
}
