import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ApostasFeitas {

    public int[][] apostaFeitaSurpresinha(int numerosApostados, int quantApostas) {
        int[][] apostas = new int[quantApostas][numerosApostados];
        int contador = 0;
        Sorteio s = new Sorteio();
        List<Integer> lista = s.numerosDisponiveis();
        Collections.shuffle(lista);
        for (int i = 0; i < quantApostas; i++) {
            while (contador < numerosApostados) {
                apostas[i][contador] = lista.get(contador);
                contador++;
            }
            Collections.shuffle(lista);
            contador = 0;
        }
        return apostas;
    }
}
