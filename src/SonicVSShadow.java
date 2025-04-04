
import java.util.Scanner;

public class SonicVSShadow {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int pntsEsperanca = 0, pntsMedo = 0, pntsConfianca = 0, pntsDesanimo = 0, pntsDeterminacao = 0, pntsIncerteza = 0;
            int aliados, d1, d2, d3, estrategias;

            // Novos Aliados
            System.out.print("Quantos Aliados o Sonic conseguiu? ");
            aliados = scanner.nextInt();
            if (aliados > 0) {
                pntsEsperanca += (aliados * 15);
            } else {
                pntsMedo += 40;
            }

            // Desafio de Poder
            System.out.print("Digite a pontuação do Desafio 1: ");
            d1 = scanner.nextInt();
            System.out.print("Digite a pontuação do Desafio 2: ");
            d2 = scanner.nextInt();
            System.out.print("Digite a pontuação do Desafio 3: ");
            d3 = scanner.nextInt();

            if (((d1 + d2 + d3) / 3) >= 7) {
                pntsConfianca += 60;
            } else {
                pntsDesanimo += 60;
            }

            // Busca por Soluções
            System.out.print("Das 12 estratégias, quantas estratégias a equipe conseguiu analisar: ");
            estrategias = scanner.nextInt();
            pntsDeterminacao += estrategias * 10;
            pntsIncerteza += (12 - estrategias) * 10;

            // Final do programa
            int somaPositivas = pntsEsperanca + pntsConfianca + pntsDeterminacao;
            int somaNegativas = pntsMedo + pntsDesanimo + pntsIncerteza;

            System.out.printf("""
                    \nResultados Finais
                    ================
                    EMOÇÕES POSITIVAS:
                    Pontos de Esperança = %d
                    Pontos de Confiança = %d
                    Pontos de Determinação = %d
                    ================
                    EMOÇÕES NEGATIVAS:
                    Pontos de Medo = %d
                    Pontos de Desânimo = %d
                    Pontos de Incerteza = %d
                    ================
                    Pontuação Total Positiva = %d
                    Pontuação Total Negativa = %d
                    """, pntsEsperanca, pntsMedo, pntsConfianca, pntsDesanimo, pntsDeterminacao, pntsIncerteza, somaPositivas, somaNegativas);

            if (somaPositivas > somaNegativas) {
                System.out.println("\nSonic venceu a batalha contra Shadow!");
            } else if (somaPositivas < somaNegativas) {
                System.out.println("\nShadow venceu a batalha contra Sonic!");
            } else {
                System.out.println("\nA batalha terminou em empate!");
            }
        }

    }
}
