public class Sorteio {
    public Sorteio() {

    }

    public void numerosSorteados() {
        int[] numeros = new int[25];
        for (int i = 0; i < 25; i++) {
            numeros[i] = i + 1;
        }

        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}