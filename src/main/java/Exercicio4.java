import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double sp = 67836.43;
        double rj = 36678.66;
        double mg = 29229.88;
        double es = 27165.48;
        double outros = 19849.53;

        double soma = sp + rj + mg + es + outros;
        System.out.printf("Total da soma de todas as regiões: %.2f%n", soma);

        double percentualSP = ((sp / soma) * 100);
        double percentualRJ = ((rj / soma) * 100);
        double percentualMG = ((mg / soma) * 100);
        double percentualES = ((es / soma) * 100);
        double percentualOutros = ((outros / soma) * 100);

        System.out.printf("Percentual de representação do estado de São Paulo: %.2f%n", percentualSP);
        System.out.printf("Percentual de representação do estado de Rio de Janeiro: %.2f%n", percentualRJ);
        System.out.printf("Percentual de representação do estado de Minas Gerais: %.2f%n", percentualMG);
        System.out.printf("Percentual de representação do estado de Espírito Santo: %.2f%n", percentualES );
        System.out.printf("Percentual de representação de outros estados: %.2f%n", percentualOutros);

        sc.close();
    }
}
