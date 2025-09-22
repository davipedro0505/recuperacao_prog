public class Asteroide extends CorpoCeleste {
    private String tipoOrbital;
    private String grupoOrbital;
    private boolean perigoso;

    public Asteroide(String nome, String localizacao, boolean produzLuz, double massa, double diametro,
                     String[] composicao, String orbita, String tipoOrbital, String grupoOrbital) {
        super(nome, localizacao, produzLuz, massa, diametro, composicao, orbita);
        this.tipoOrbital = tipoOrbital;
        this.grupoOrbital = grupoOrbital;
        this.perigoso = false;
    }

    // Getters e Setters
    public String getTipoOrbital() { return tipoOrbital; }
    public void setTipoOrbital(String tipoOrbital) { this.tipoOrbital = tipoOrbital; }

    public String getGrupoOrbital() { return grupoOrbital; }
    public void setGrupoOrbital(String grupoOrbital) { this.grupoOrbital = grupoOrbital; }

    public boolean isPerigoso() { return perigoso; }
    public void setPerigoso(boolean perigoso) { this.perigoso = perigoso; }

    public void verificarPerigo() {
        if (getDiametro() > 0.14 && getOrbita().contains("Terra")) {
            perigoso = true;
            System.out.println("⚠ ALERTA! O asteroide " + getNome() + " é potencialmente perigoso!");
        } else {
            perigoso = false;
            System.out.println("O asteroide " + getNome() + " não apresenta risco imediato.");
        }
    }
}
