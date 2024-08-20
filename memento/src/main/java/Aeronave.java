import java.util.ArrayList;
import java.util.List;

public class Aeronave {

    private AeronaveEstado estado;
    private List<AeronaveEstado> memento = new ArrayList<AeronaveEstado>();

    public AeronaveEstado getEstado() {
        return estado;
    }

    public void setEstado(AeronaveEstado estado) {
        this.estado = estado;
        this.memento.add(this.estado);
    }

    public void restauraEstado(int indice) {
        if (indice < 0 || indice > this.memento.size() - 1) {
            throw new IllegalArgumentException("Índice inválido");
        }
        this.estado = this.memento.get(indice);
    }

    public List<AeronaveEstado> getEstados() {
        return this.memento;
    }
}