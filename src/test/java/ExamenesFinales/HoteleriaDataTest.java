package ExamenesFinales;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class HoteleriaDataTest {

    @Test
    void reservasFileExistsAndLoadable() {
        Path p = Path.of("data", "reservas.dat");
        assertTrue(Files.exists(p), "El archivo data/reservas.dat debe existir para los ejemplos");

        // Verificar que la carga no lanza excepción
        assertDoesNotThrow(() -> {
            Hotel.cargarReservasDesdeArchivo(p.toString());
        });
    }
}
