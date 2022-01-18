import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Número a ser verificado: ");
        int n = sc.nextInt();
        boolean numeroEncontrado = false;

        int penultimoNumero = 0;
        int ultimoNumero = 1;

        if (n == penultimoNumero || n == ultimoNumero)  {
            System.out.println("O número faz parte do Fibonacci.");
            return;
        }

        while(!numeroEncontrado) {
            int novoNumero = penultimoNumero + ultimoNumero;
            penultimoNumero = ultimoNumero;
            ultimoNumero = novoNumero;

            if(novoNumero == n) {
                numeroEncontrado = true;
            } else if (novoNumero > n) break;
        }

        if(numeroEncontrado) {
            System.out.println("O número " + n + " faz parte de Fibonacci");
        } else {
            System.out.println("O número " + n + " não faz parte de Fibonacci");
        }
    }
}
