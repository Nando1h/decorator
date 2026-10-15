
import java.util.List;

public class CatalogoDisney implements CatalogoPeliculas {
    @Override
    public ServicioStreaming getServicio() {
        return ServicioStreaming.DISNEY;
    }

    @Override
    public List<String> obtenerPeliculas() {
        return List.of("El rey leon", "Toy Story", "Frozen");
    }
}