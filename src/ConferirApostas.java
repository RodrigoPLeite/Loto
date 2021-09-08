import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

public class ConferirApostas {

    public void conferirApostas(int aposta[][], List<Integer> numSorteados, int quantApostas,
            double valorPremioLoteria) {
        NumberFormat df = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        int numeroAcertos = 0;
        double valorPremio = 0.00, totalPremio = 0.00;
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
                valorPremio = 5.00;
            } else if (numeroAcertos == 12) {
                System.out.println("Você ganhou R$ 10,00");
                valorPremio = 10.00;
            } else if (numeroAcertos == 13) {
                System.out.println("Você ganhou R$ 25,00");
                valorPremio = 25.00;
            } else if (numeroAcertos == 14) {
                System.out.println("Você ganhou R$ 1950,00");
                valorPremio = 1950.00;
            } else if (numeroAcertos == 15) {
                System.out.println("Você ganhou o prêmio máximo... Parabéns!!!");
                valorPremio = valorPremioLoteria;
            }
            totalPremio = totalPremio + valorPremio;
            System.out.println("Total Ganho: " + df.format(totalPremio));
            valorPremio = 0.00;
            numeroAcertos = 0;
        }
    }
}
