public class AeronaveEstadoVoando implements AeronaveEstado {

    private AeronaveEstadoVoando() {};
    private static AeronaveEstadoVoando instance = new AeronaveEstadoVoando();
    public static AeronaveEstadoVoando getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Voando";
    }
}
