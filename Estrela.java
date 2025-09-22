public class Estrela extends CorpoCeleste {
    private String tipoEspectral;
    private double luminosidade;
    private String estagioEvolutivo;
    private String tipo;
    private int temperatura;

    public Estrela(String nome, String localizacao, boolean produzLuz, double massa, double diametro,
                   String[] composicao, String orbita, String tipoEspectral, double luminosidade,
                   String estagioEvolutivo, String tipo, int temperatura) {
        super(nome, localizacao, produzLuz, massa, diametro, composicao, orbita);
        this.tipoEspectral = tipoEspectral;
        this.luminosidade = luminosidade;
        this.estagioEvolutivo = estagioEvolutivo;
        this.tipo = tipo;
        this.temperatura = temperatura;
    }

    // Getters e Setters
    public String getTipoEspectral() { return tipoEspectral; }
    public void setTipoEspectral(String tipoEspectral) { this.tipoEspectral = tipoEspectral; }

    public double getLuminosidade() { return luminosidade; }
    public void setLuminosidade(double luminosidade) { this.luminosidade = luminosidade; }

    public String getEstagioEvolutivo() { return estagioEvolutivo; }
    public void setEstagioEvolutivo(String estagioEvolutivo) { this.estagioEvolutivo = estagioEvolutivo; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public int getTemperatura() { return temperatura; }
    public void setTemperatura(int temperatura) { this.temperatura = temperatura; }

    public void atualizarTipo() {
        if (getMassa() < 0.5) {
            tipo = "Anã Vermelha";
        } else if (getMassa() < 8) {
            tipo = "Sequência Principal";
        } else {
            tipo = "Supergigante";
        }
        System.out.println("O tipo da estrela " + getNome() + " foi atualizado para: " + tipo);
    }

    public void tempoDeVidaRestante() {
        double vida = 1e10 / Math.pow(getMassa(), 2.5);
        System.out.printf("Tempo de vida restante da estrela %s: %.2e anos%n", getNome(), vida);
    }
}
