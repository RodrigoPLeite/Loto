public class App {
    public static void main(String[] args) throws Exception {
        Sorteio sorteio = new Sorteio();
        // sorteio.numerosSorteados();
        ApostasFeitas apostas = new ApostasFeitas();
        // apostas.apostaFeitaSurpresinha();
        int numeroDeJogos = 10; // quantidade de apostas
        int quantDeNumerosJogados = 15;
        ConferirApostas confApostas = new ConferirApostas();
        confApostas.conferirApostas(apostas.apostaFeitaSurpresinha(quantDeNumerosJogados, numeroDeJogos),
                sorteio.numerosSorteados(), numeroDeJogos);
        apostas.apostaCartao(quantDeNumerosJogados, numeroDeJogos);
    }
}