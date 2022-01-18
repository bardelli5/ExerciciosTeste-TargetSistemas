import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("String a ser invertida: ");
        String palavra = sc.nextLine();
        palavra.trim();
        String[] listaLetras = palavra.split("");

        String[] palavraReversa = new String[listaLetras.length];

        for(int i = 0; i < listaLetras.length; i++) {
            int index = palavraReversa.length - 1 - i;
            palavraReversa[index] = listaLetras[i];
        }

        String str = convertStringArrayToString(palavraReversa);
        System.out.println(str);

        sc.close();
    }

    private static String convertStringArrayToString(String[] palavra) {
        StringBuilder sb = new StringBuilder();
        for(String str : palavra) sb.append(str);
        return sb.substring(0, sb.length());
    }
}