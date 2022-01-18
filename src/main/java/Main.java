import com.fasterxml.jackson.databind.ObjectMapper;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Faturamento> faturamentoMensal = montarFaturamentoDeJson();

        double somaTotalFaturamento = 0;
        Faturamento menorFaturamento = null;
        Faturamento maiorFaturamento = null;

        for (Faturamento faturamento : faturamentoMensal) {
            if(faturamento.valor != 0) {
                somaTotalFaturamento += faturamento.valor;
                if (maiorFaturamento == null || faturamento.valor > maiorFaturamento.valor) {
                    maiorFaturamento = new Faturamento(faturamento.dia, faturamento.valor);
                }
                if (menorFaturamento == null || faturamento.valor < menorFaturamento.valor) {
                    menorFaturamento = new Faturamento(faturamento.dia, faturamento.valor);
                }
            }
        }

        final double media = somaTotalFaturamento / faturamentoMensal.size();
        List<Faturamento> faturamentoMaiorQueMedia = faturamentoMensal.stream().filter(f -> f.valor > media).collect(Collectors.toList());

        if (menorFaturamento != null) {
            System.out.println("O menor valor de faturamento foi dia " +
                    menorFaturamento.dia +
                    " com o valor R$" +
                    menorFaturamento.valor
            );
            System.out.println();
            System.out.println("O maior valor de faturamento foi dia " +
                    maiorFaturamento.dia +
                    " com o valor R$" +
                    maiorFaturamento.valor
            );
            System.out.println();
            System.out.println("Em um total de " +
                    faturamentoMaiorQueMedia.size() +
                    " dias tivemos um faturamento maior que a média."
            );
        }
    }

    private static List<Faturamento> montarFaturamentoDeJson() {
        List<Faturamento> faturamentos = null;
        try {
            String json = Files.readString(Paths.get("C:\\Users\\Administrator\\Documents\\source\\TesteBarda\\src\\main\\resources\\dados.json"));

            ObjectMapper objMapper = new ObjectMapper();
            Faturamento[] faturamentosObj = objMapper.readValue(json, Faturamento[].class);

            faturamentos = Arrays.stream(faturamentosObj).collect(Collectors.toList());
        } catch(Exception e) {
            System.out.println("DEU MERDA " + e);
        }

        return faturamentos;
    }
}