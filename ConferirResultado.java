import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class ConferirResultado{
    public void resultados(List numeros, List sorteio){
        int pontos = 0;
        for(int i = 0; i < numeros.size(); i++){
            for(int j = 0; j < sorteio.size(); j++){
                if(numeros.equals(sorteio)){
                    int ponto = 1;
                    pontos += ponto;
                    System.out.println("Acertou o n° " + numeros);
                }
            }
        }
        System.out.println("Pontos: " + pontos);
    }
}
