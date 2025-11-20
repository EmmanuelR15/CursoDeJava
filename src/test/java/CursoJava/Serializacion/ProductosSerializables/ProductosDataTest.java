package CursoJava.Serializacion.ProductosSerializables;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class ProductosDataTest {

    @Test
    void productosFileExistsAndLoadable() {
        Path p = Path.of("data", "productos.ser");
        assertTrue(Files.exists(p), "El archivo data/productos.ser debe existir para los ejemplos");

        // Verificar que la carga no lanza excepción y devuelve una lista (posiblemente vacía)
        assertDoesNotThrow(() -> {
            var lista = Inventario.cargarProductos(p.toString());
            assertNotNull(lista);
        });
    }
}
