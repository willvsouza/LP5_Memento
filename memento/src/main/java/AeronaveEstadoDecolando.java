public class AeronaveEstadoDecolando implements AeronaveEstado {

    private AeronaveEstadoDecolando() {};
    private static AeronaveEstadoDecolando instance = new AeronaveEstadoDecolando();
    public static AeronaveEstadoDecolando getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Decolando";
    }
}
