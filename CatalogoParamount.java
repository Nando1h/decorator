import java.util.List;

public class CatalogoParamount implements CatalogoPeliculas {
    @Override
    public ServicioStreaming getServicio() {
        return ServicioStreaming.PARAMOUNT;
    }

    @Override
    public List<String> obtenerPeliculas() {
        return List.of("Top Gun: Maverick", "Sonic", "Un lugar en silencio");
    }
}