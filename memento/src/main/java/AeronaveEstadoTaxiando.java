public class AeronaveEstadoTaxiando implements AeronaveEstado {

    private AeronaveEstadoTaxiando() {};
    private static AeronaveEstadoTaxiando instance = new AeronaveEstadoTaxiando();
    public static AeronaveEstadoTaxiando getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Taxiando";
    }
}
