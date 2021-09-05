public class App {
    public static void main(String[] args) throws Exception {
        Sorteio sorteio = new Sorteio();
        // sorteio.numerosSorteados();
        ApostasFeitas apostas = new ApostasFeitas();
        // apostas.apostaFeitaSurpresinha();
        ConferirApostas confApostas = new ConferirApostas();
        confApostas.conferirApostas(apostas.apostaFeitaSurpresinha(15, 5), sorteio.numerosSorteados(), 5);
    }
}