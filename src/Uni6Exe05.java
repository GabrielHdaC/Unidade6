import java.util.Scanner;

public class Uni6Exe05 {
    Scanner sc = new Scanner(System.in);
    String[] rapaz = new String[5];
    String[] moca = new String[5];

    public static void main(String[] args) {
        new Uni6Exe05();
    }

    Uni6Exe05() {
        System.out.println("=== Questionário do rapaz ===");
        lerRespostas(rapaz);

        System.out.println("\n=== Questionário da moça ===");
        lerRespostas(moca);

        int afinidade = calcularAfinidade();
        exibirResultado(afinidade);
    }

    private void lerRespostas(String[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            boolean valido = false;
            while (!valido) {
                System.out.print("Pergunta " + (i + 1) + " (1-SIM, 2-NÃO, 3-IND): ");
                int opcao = sc.nextInt();

                switch (opcao) {
                    case 1:
                        vetor[i] = "SIM";
                        valido = true;
                        break;
                    case 2:
                        vetor[i] = "NÃO";
                        valido = true;
                        break;
                    case 3:
                        vetor[i] = "IND";
                        valido = true;
                        break;
                    default:
                        System.out.println("Opção inválida! Digite 1, 2 ou 3.");
                }
            }
        }
    }

    private int calcularAfinidade() {
        int pontos = 0;

        for (int i = 0; i < rapaz.length; i++) {
            String r = rapaz[i];
            String m = moca[i];

            String combinacao = r + "-" + m;

            switch (combinacao) {
                case "SIM-SIM":
                case "NÃO-NÃO":
                case "IND-IND":
                    pontos += 3;
                    break;
                case "SIM-NÃO":
                case "NÃO-SIM":
                    pontos -= 2;
                    break;
                case "SIM-IND":
                case "NÃO-IND":
                case "IND-SIM":
                case "IND-NÃO":
                    pontos += 1;
                    break;
                default:
                    break;
            }
        }
        return pontos;
    }

    private void exibirResultado(int afinidade) {
        System.out.println("\nÍndice de afinidade: " + afinidade);
        if (afinidade == 15)
            System.out.println("Casem!");
        else if (afinidade >= 10)
            System.out.println("Vocês têm muita coisa em comum!");
        else if (afinidade >= 5)
            System.out.println("Talvez não dê certo :(");
        else if (afinidade >= 0)
            System.out.println("Vale um encontro.");
        else if (afinidade >= -9)
            System.out.println("Melhor não perder tempo.");
        else
            System.out.println("Vocês se odeiam!");
    }
}
