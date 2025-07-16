public class ResultadoConversao {
    private String de;
    private String para;
    private double valorOriginal;
    private double taxa;
    private double convertido;

    public ResultadoConversao(String de, String para, double valorOriginal, double taxa, double convertido) {
        this.de = de;
        this.para = para;
        this.valorOriginal = valorOriginal;
        this.taxa = taxa;
        this.convertido = convertido;
    }

    // Getters e setters podem ser adicionados se necessário
}
