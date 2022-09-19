import java.util.Arrays;

public class App {
    public static int Max_sum(int[] lista) {
        int even = 0, odd = 0;
        Arrays.sort(lista);
        for (int i = lista.length - 1; i >= 0; i--) {
            if (lista[i] % 2 == 0 && lista[i] > even)
                even = lista[i];

            if (lista[i] % 2 != 0 && lista[i] > odd)
                odd = lista[i];
        }
        return odd + even;
    }

    public static void main(String[] args) throws Exception {
        int[] lista = { 1, 9, 4, 3, 6 };
        int result = Max_sum(lista);
        System.out.println(result);

    }
}
