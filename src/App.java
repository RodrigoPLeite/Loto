public class App {
    public static void main(String[] args) throws Exception {
        double premioLoteria = 6000000.00;
        Sorteio sorteio = new Sorteio();
        // sorteio.numerosSorteados();
        ApostasFeitas apostas = new ApostasFeitas();
        // apostas.apostaFeitaSurpresinha();
        int numeroDeJogos = 100; // quantidade de apostas
        int quantDeNumerosJogados = 15;
        ConferirApostas confApostas = new ConferirApostas();
        confApostas.conferirApostas(apostas.apostaFeitaSurpresinha(quantDeNumerosJogados, numeroDeJogos),
                sorteio.numerosSorteados(), numeroDeJogos, premioLoteria);
        apostas.apostaCartao(quantDeNumerosJogados, numeroDeJogos);
        apostas.valorTotalDasApostas(quantDeNumerosJogados, numeroDeJogos);
    }
}