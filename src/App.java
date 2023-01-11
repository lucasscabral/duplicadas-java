import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> duplicadas = new ArrayList<String>();
        String[] listaFrutas1 = new String[] { "Morango", "Uva", "Acerola", "Manga" };
        String[] listaFrutas2 = new String[] { "Pera", "Caju", "Morango", "Acerola" };

        for (int i = 0; i < listaFrutas1.length; i++) {
            for (int j = 0; j < listaFrutas2.length; j++) {
                if (listaFrutas1[i].equals(listaFrutas2[j])) {
                    duplicadas.add(listaFrutas1[i]);
                }
            }
        }

        for (int d = 0; d < duplicadas.size(); d++) {
            System.out.println(duplicadas.get(d));
        }
    }
}
