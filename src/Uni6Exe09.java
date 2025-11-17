import java.util.Scanner;

public class Uni6Exe09 {

    public static void main(String[] args) {
        new Uni6Exe09();
    }

    Uni6Exe09() {
        Scanner sc = new Scanner(System.in);

        final int N = 30;

        int sexo[] = new int[N];
        int nota[] = new int[N];
        int idade[] = new int[N];

        lerDados(sexo, nota, idade, sc);

        double mediaGeral = calcularMediaGeral(nota);
        double mediaHomens = calcularMediaHomens(sexo, nota);
        int notaMulherMaisJovem = obterNotaMulherMaisJovem(sexo, idade, nota);
        int mulheres50AcimaMaiorMedia = contarMulheres50AcimaMaiorMedia(sexo, idade, nota, mediaGeral);

        System.out.println("\n--- RESULTADOS ---");
        System.out.printf("1) Nota média do cinema: %.2f\n", mediaGeral);
        System.out.printf("2) Nota média dos homens: %.2f\n", mediaHomens);
        System.out.printf("3) Nota da mulher mais jovem: %d\n", notaMulherMaisJovem);
        System.out.printf("4) Mulheres >50 anos com nota > média: %d\n", mulheres50AcimaMaiorMedia);

        sc.close();
    }

    private void lerDados(int[] sexo, int[] nota, int[] idade, Scanner sc) {
        for (int i = 0; i < sexo.length; i++) {
            System.out.println("\nCliente " + (i + 1));

            System.out.print("Sexo (1=fem, 2=masc): ");
            sexo[i] = sc.nextInt();

            System.out.print("Nota (0 a 10): ");
            nota[i] = sc.nextInt();

            System.out.print("Idade: ");
            idade[i] = sc.nextInt();
        }
    }

    private double calcularMediaGeral(int[] nota) {
        int soma = 0;
        for (int n : nota) soma += n;
        return soma / 30.0;
    }

    private double calcularMediaHomens(int[] sexo, int[] nota) {
        int soma = 0;
        int qtd = 0;

        for (int i = 0; i < sexo.length; i++) {
            if (sexo[i] == 2) { // masculino
                soma += nota[i];
                qtd++;
            }
        }

        if (qtd == 0) return 0;
        return soma / (double) qtd;
    }

    // ----------------------------------------------------------
    // 3) NOTA DA MULHER MAIS JOVEM
    // ----------------------------------------------------------
    private int obterNotaMulherMaisJovem(int[] sexo, int[] idade, int[] nota) {
        int menorIdade = Integer.MAX_VALUE;
        int notaDaMaisJovem = -1;

        for (int i = 0; i < sexo.length; i++) {
            if (sexo[i] == 1) { // feminina
                if (idade[i] < menorIdade) {
                    menorIdade = idade[i];
                    notaDaMaisJovem = nota[i];
                }
            }
        }

        return notaDaMaisJovem;
    }

    private int contarMulheres50AcimaMaiorMedia(int[] sexo, int[] idade, int[] nota, double mediaGeral) {
        int cont = 0;

        for (int i = 0; i < sexo.length; i++) {
            if (sexo[i] == 1 && idade[i] > 50 && nota[i] > mediaGeral) {
                cont++;
            }
        }

        return cont;
    }
}
