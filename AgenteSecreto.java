public class AgenteSecreto {

    private EstrategiaAgente estrategia;

    public AgenteSecreto(EstrategiaAgente estrategia) {
        this.estrategia = estrategia;
    }

    public void mudarEstrategia(EstrategiaAgente estrategia) {
        this.estrategia = estrategia;
    }

    public void combater() {
        estrategia.executar();
    }

}
