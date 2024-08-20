import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AeronaveTeste {

    @Test
    void deveArmazenarEstados() {
        Aeronave aeronave = new Aeronave();
        aeronave.setEstado(AeronaveEstadoEstacionando.getInstance());
        aeronave.setEstado(AeronaveEstadoTaxiando.getInstance());
        assertEquals(2, aeronave.getEstados().size());
    }

    @Test
    void deveRetornarEstadoInicial() {
        Aeronave aeronave = new Aeronave();
        aeronave.setEstado(AeronaveEstadoPousando.getInstance());
        aeronave.setEstado(AeronaveEstadoTaxiando.getInstance());
        aeronave.setEstado(AeronaveEstadoDecolando.getInstance());
        aeronave.restauraEstado(0);
        assertEquals(AeronaveEstadoPousando.getInstance(), aeronave.getEstado());
    }

    @Test
    void deveRetornarEstadoAnterior() {
        Aeronave aeronave = new Aeronave();
        aeronave.setEstado(AeronaveEstadoEstacionando.getInstance());
        aeronave.setEstado(AeronaveEstadoTaxiando.getInstance());
        aeronave.setEstado(AeronaveEstadoDecolando.getInstance());
        aeronave.setEstado(AeronaveEstadoVoando.getInstance());
        aeronave.restauraEstado(2);
        assertEquals(AeronaveEstadoDecolando.getInstance(), aeronave.getEstado());
    }

    @Test
    void deveRetornarExcecaoIndiceInvalido() {
        try {
            Aeronave aeronave = new Aeronave();
            aeronave.restauraEstado(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Índice inválido", e.getMessage());
        }
    }
}
