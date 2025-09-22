public class Planeta extends CorpoCeleste {
    private int quantidadeLuas;
    private boolean temAneis;
    private boolean temVida;
    private String sistema;

    public Planeta(String nome, String localizacao, boolean produzLuz, double massa, double diametro,
                   String[] composicao, String orbita, int quantidadeLuas, boolean temAneis,
                   boolean temVida, String sistema) {
        super(nome, localizacao, produzLuz, massa, diametro, composicao, orbita);
        this.quantidadeLuas = quantidadeLuas;
        this.temAneis = temAneis;
        this.temVida = temVida;
        this.sistema = sistema;
    }

    // Getters e Setters
    public int getQuantidadeLuas() { return quantidadeLuas; }
    public void setQuantidadeLuas(int quantidadeLuas) { this.quantidadeLuas = quantidadeLuas; }

    public boolean isTemAneis() { return temAneis; }
    public void setTemAneis(boolean temAneis) { this.temAneis = temAneis; }

    public boolean isTemVida() { return temVida; }
    public void setTemVida(boolean temVida) { this.temVida = temVida; }

    public String getSistema() { return sistema; }
    public void setSistema(String sistema) { this.sistema = sistema; }
}
