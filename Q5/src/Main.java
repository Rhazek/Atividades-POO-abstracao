import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantos jogos você quer contabilizar?");
        int numJogos = Integer.parseInt(scan.nextLine());

        Jogos[] jogos = new Jogos[numJogos];

        for (int i = 0; i < numJogos; i++) {
            System.out.printf("Digite o nome do time mandante do jogo %d%n", i+1);
            String timeCasa = scan.nextLine();

            System.out.printf("Digite o nome do time visitante do jogo %d%n", i+1);
            String timeVisitante = scan.nextLine();

            System.out.printf("Quantos ingressos foram vendidos no jogo %d?%n", i+1);
            int quantIngressosVendidos = Integer.parseInt(scan.nextLine());

            System.out.printf("E quanto custava cada um desses ingressos do jogo %d?%n", i+1);
            double valorIngresso = Double.parseDouble(scan.nextLine());

            jogos[i] = new Jogos(timeCasa, timeVisitante, quantIngressosVendidos,
                    valorIngresso, 0, 0, 0);
            jogos[i].faturamento = jogos[i].calculaFaturamento(jogos[i].quantIngressosVendidos,
                    jogos[i].valorIngresso);
            jogos[i].parteTimeCasa = jogos[i].calculaParteTimeCasa(jogos[i].faturamento);
            jogos[i].parteTimeVisitante = jogos[i].calculaParteTimeVisitante(jogos[i].faturamento);
        }

        for (int i = 0; i < numJogos; i++) {
            System.out.printf("""
                            *********JOGO %d*********
                            %s  x  %s
                            Quantidade de ingressos vendidos: %d.
                            Valor por ingresso: R$%.2f.
                            Faturamento: R$%.2f
                            Parte do Time Mandante: R$%.2f
                            Parte do Time Visitante: R$%.2f
                            %n""", i+1, jogos[i].timeCasa, jogos[i].timeVisitante,
            jogos[i].quantIngressosVendidos, jogos[i].valorIngresso, jogos[i].faturamento,
            jogos[i].parteTimeCasa, jogos[i].parteTimeVisitante);
        }

    }
}