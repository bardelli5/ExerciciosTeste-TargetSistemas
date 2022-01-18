import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int indice = 13;
        int soma = 0;
        int k = 0;

        while (k < indice) {
            k += 1;
            soma += k;
        }

        System.out.println("Soma final = " + soma);

        sc.close();
    }
}
