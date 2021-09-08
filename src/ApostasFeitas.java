import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class ApostasFeitas {

    public int[][] apostaFeitaSurpresinha(int quantDeNumerosJogados, int quantApostas) {
        int[][] apostas = new int[quantApostas][quantDeNumerosJogados];
        int contador = 0;
        Sorteio s = new Sorteio();
        List<Integer> lista = s.numerosDisponiveis();
        Collections.shuffle(lista);
        for (int i = 0; i < quantApostas; i++) {
            System.out.print("\nAposta nº " + (i + 1) + " - ");
            while (contador < quantDeNumerosJogados) {
                apostas[i][contador] = lista.get(contador);
                System.out.print(apostas[i][contador] + " ");
                contador++;
            }
            Collections.shuffle(lista);
            contador = 0;
        }
        return apostas;
    }

    public void apostaCartao(int quantDeNumerosJogados, int quantApostas) {

    }

    public BigDecimal valorTotalDasApostas(int quantosNumeros, int quantApostas) {
        Double valorAposta = 0.00;
        BigDecimal valorApostaTotal = BigDecimal.ZERO;
        NumberFormat df = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

        switch (quantosNumeros) {
            case 15:
                valorAposta = 2.50;
                valorApostaTotal = valorApostaTotal
                        .add(BigDecimal.valueOf(valorAposta).multiply(BigDecimal.valueOf(quantApostas)));
                System.out.print("Valor das apostas de 15 números: " + df.format(valorApostaTotal));
                break;
            case 16:
                valorAposta = 40.00;
                valorApostaTotal = valorApostaTotal
                        .add(BigDecimal.valueOf(valorAposta).multiply(BigDecimal.valueOf(quantApostas)));
                System.out.print("Valor das apostas de 16 números: " + df.format(valorApostaTotal));
                break;
            case 17:
                valorAposta = 340.00;
                valorApostaTotal = valorApostaTotal
                        .add(BigDecimal.valueOf(valorAposta).multiply(BigDecimal.valueOf(quantApostas)));
                System.out.print("Valor das apostas de 17 números: " + df.format(valorApostaTotal));
                break;
            case 18:
                valorAposta = 2040.00;
                valorApostaTotal = valorApostaTotal
                        .add(BigDecimal.valueOf(valorAposta).multiply(BigDecimal.valueOf(quantApostas)));
                System.out.print("Valor das apostas de 18 números: " + df.format(valorApostaTotal));
                break;
            case 19:
                valorAposta = 9690.00;
                valorApostaTotal = valorApostaTotal
                        .add(BigDecimal.valueOf(valorAposta).multiply(BigDecimal.valueOf(quantApostas)));
                System.out.print("Valor das apostas de 19 números: " + df.format(valorApostaTotal));
                break;
            case 20:
                valorAposta = 38760.00;
                valorApostaTotal = valorApostaTotal
                        .add(BigDecimal.valueOf(valorAposta).multiply(BigDecimal.valueOf(quantApostas)));
                System.out.print("Valor das apostas de 20 números: " + df.format(valorApostaTotal));
                break;
        }

        return valorApostaTotal;
    }
}
