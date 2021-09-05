import java.util.List;

public class ConferirApostas {

    public void conferirApostas(int aposta[][], List<Integer> numSorteados, int quantApostas) {
        int numeroAcertos = 0;
        for (int ap = 0; ap < quantApostas; ap++) {
            System.out.print("\nAcertos Aposta " + (ap + 1) + "\n");
            for (int numSorteado : numSorteados) {
                for (int numApostado : aposta[ap]) {
                    if (numApostado == numSorteado) {
                        System.out.print(numApostado + " ");
                        numeroAcertos++;
                    }
                }
            }
            System.out.println("- Acertou : " + numeroAcertos + " combinações");
            if (numeroAcertos == 11) {
                System.out.println("Você ganhou R$ 5,00");
            } else if (numeroAcertos == 12) {
                System.out.println("Você ganhou R$ 15,00");
            } else if (numeroAcertos == 13) {
                System.out.println("Você ganhou R$ 25,00");
            } else if (numeroAcertos == 14) {
                System.out.println("Você ganhou R$ 1100,00");
                break;
            } else if (numeroAcertos == 15) {
                System.out.println("Você ganhou o prêmio máximo... Parabéns!!!");
                break;
            }
            numeroAcertos = 0;
        }
    }
}
