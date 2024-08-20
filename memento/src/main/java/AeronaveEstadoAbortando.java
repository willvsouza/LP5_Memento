public class AeronaveEstadoAbortando implements AeronaveEstado {

    private AeronaveEstadoAbortando() {};
    private static AeronaveEstadoAbortando instance = new AeronaveEstadoAbortando();
    public static AeronaveEstadoAbortando getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Abortando decolagem";
    }
}
