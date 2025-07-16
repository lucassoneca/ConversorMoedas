import com.google.gson.*;
import java.util.Scanner;

public class Principal {

    static Conversor conversor = new Conversor();
    static Gson gson = new Gson();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("""
                    Bem-vindo ao conversor de moedas!
                    
                    1) Dólar => Real
                    2) Real => Dólar
                    3) Dólar => Peso Argentino
                    4) Peso Argentino => Dólar
                    5) Dólar => Euro
                    6) Euro => Dólar
                    7) Sair
                    
                    Escolha uma opção válida:
                    """);

            int opcao = scanner.nextInt();

            if (opcao == 7) {
                System.out.println("Encerrando...");
                break;
            }

            System.out.print("Digite o valor: ");
            double valor = scanner.nextDouble();

            switch (opcao) {
                case 1 -> converter("USD", "BRL", valor, "dolar_para_real.json");
                case 2 -> converter("BRL", "USD", valor, "real_para_dolar.json");
                case 3 -> converter("USD", "ARS", valor, "dolar_para_peso.json");
                case 4 -> converter("ARS", "USD", valor, "peso_para_dolar.json");
                case 5 -> converter("USD", "EUR", valor, "dolar_para_euro.json");
                case 6 -> converter("EUR", "USD", valor, "euro_para_dolar.json");
                default -> System.out.println("Opção inválida.");
            }
        }

        scanner.close();
    }

    static void converter(String de, String para, double valor, String nomeArquivo) {
        double taxa = obterTaxa(de, para);
        double resultado = valor * taxa;

        System.out.printf("Resultado: %.2f %s\n", resultado, para);

        ResultadoConversao conversao = new ResultadoConversao(de, para, valor, taxa, resultado);
        ExportadorJson.salvarComoJson(conversao, nomeArquivo);
    }

    static double obterTaxa(String base, String destino) {
        String json = conversor.conversorMoeda(base);
        JsonObject obj = gson.fromJson(json, JsonObject.class);
        return obj.getAsJsonObject("conversion_rates").get(destino).getAsDouble();
    }
}