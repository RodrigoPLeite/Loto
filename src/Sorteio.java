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
        System.out.print("\n\nNúmeros Sorteados: \n");

        while (contador < 15) { // System.out.print(lista.get(contador) + " - ");
            numerosSorteados.add(lista.get(contador));
            contador++;
        }

        /*
         * numerosSorteados.add(2); numerosSorteados.add(3); numerosSorteados.add(8);
         * numerosSorteados.add(12); numerosSorteados.add(13); numerosSorteados.add(14);
         * numerosSorteados.add(15); numerosSorteados.add(16); numerosSorteados.add(17);
         * numerosSorteados.add(19); numerosSorteados.add(21); numerosSorteados.add(22);
         * numerosSorteados.add(23); numerosSorteados.add(24); numerosSorteados.add(25);
         */
        Collections.sort(numerosSorteados); // coloca na ordem crescente
        for (int i = 0; i < 15; i++) {
            System.out.print(numerosSorteados.get(i) + " - ");
        }
        System.out.print("\n");
        return numerosSorteados;
    }
}