import java.util.Collections;
import java.util.List;

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
        int[] numerosEscolhidos = new int[quantDeNumerosJogados];
    }
}
