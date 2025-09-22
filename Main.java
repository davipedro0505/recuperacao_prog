public class Main {
    public static void main(String[] args) {
        // Planetas
        Planeta terra = new Planeta("Terra", "Via Láctea", false, 5.97e24, 12742,
                new String[]{"rochas", "metais"}, "Órbita do Sol", 1, false, true, "Sistema Solar");

        Planeta jupiter = new Planeta("Júpiter", "Via Láctea", false, 1.90e27, 139820,
                new String[]{"gases"}, "Órbita do Sol", 79, true, false, "Sistema Solar");

        // Estrelas
        Estrela sol = new Estrela("Sol", "Via Láctea", true, 1.0, 1392000,
                new String[]{"hidrogênio", "hélio"}, "Centro do Sistema Solar",
                "G2V", 1.0, "massa intermediária", "Sequência Principal", 5778);

        Estrela sirius = new Estrela("Sirius", "Via Láctea", true, 2.02, 1714000,
                new String[]{"hidrogênio", "hélio"}, "Órbita binária com Sirius B",
                "A1V", 25.4, "massa intermediária", "Sequência Principal", 9940);

        // Asteroides
        Asteroide apophis = new Asteroide("Apophis", "Via Láctea", false, 2.7e10, 0.375,
                new String[]{"rochas", "níquel"}, "Órbita próxima da Terra",
                "Aten", "NEO");

        Asteroide ceres = new Asteroide("Ceres", "Cinturão de Asteroides", false, 9.39e20, 946,
                new String[]{"rochas", "gelo"}, "Órbita entre Marte e Júpiter",
                "Cinturão Principal", "Grupo Ceres");

        sol.atualizarTipo();
        sol.tempoDeVidaRestante();

        apophis.verificarPerigo();
        ceres.verificarPerigo();
    }
}
