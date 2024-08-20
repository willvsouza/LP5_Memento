public class AeronaveEstadoEstacionando implements AeronaveEstado {

    private AeronaveEstadoEstacionando() {};
    private static AeronaveEstadoEstacionando instance = new AeronaveEstadoEstacionando();
    public static AeronaveEstadoEstacionando getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Estacionando";
    }
}
