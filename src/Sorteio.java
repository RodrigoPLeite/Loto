import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorteio {

    public List<Integer> numerosDisponiveis() {
        int[] numeros = new int[25];
        List<Integer> lista = new ArrayList<>();
        for (int i = 0; i < 25; i++) {
            numeros[i] = i + 1;
            lista.add(numeros[i]);
        }
        return lista;
    }

    public List<Integer> numerosSorteados() {
        int contador = 0;
        List<Integer> numerosSorteados = new ArrayList<>();
        List<Integer> lista = numerosDisponiveis();
        Collections.shuffle(lista);
        System.out.print("Números Sorteados: ");
        while (contador < 15) {
            System.out.print(lista.get(contador) + " - ");
            numerosSorteados.add(lista.get(contador));
            contador++;
        }
        System.out.println("\n");
        return numerosSorteados;
    }
}