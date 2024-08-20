public class AeronaveEstadoPousando implements AeronaveEstado {

    private AeronaveEstadoPousando() {};
    private static AeronaveEstadoPousando instance = new AeronaveEstadoPousando();
    public static AeronaveEstadoPousando getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Pousando";
    }
}
