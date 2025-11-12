import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Bingo {
    private List<Integer> numerosSorteados = new ArrayList<>();
    private Random random = new Random();

    // Sorteia um número entre 1 e 75 (ou outro intervalo se quiser)
    public int sortearNumero() {
        if (numerosSorteados.size() == 75) {
            return -1; // todos já sorteados
        }

        int numero;
        do {
            numero = random.nextInt(75) + 1;
        } while (numerosSorteados.contains(numero));

        numerosSorteados.add(numero);
        return numero;
    }

    // Retorna os números sorteados em ordem crescente
    public List<Integer> getNumerosSorteados() {
        List<Integer> copia = new ArrayList<>(numerosSorteados);
        Collections.sort(copia);
        return copia;
    }
}
