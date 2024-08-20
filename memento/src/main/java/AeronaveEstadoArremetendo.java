public class AeronaveEstadoArremetendo implements AeronaveEstado {

    private AeronaveEstadoArremetendo() {};
    private static AeronaveEstadoArremetendo instance = new AeronaveEstadoArremetendo();
    public static AeronaveEstadoArremetendo getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Arremetendo";
    }
}
