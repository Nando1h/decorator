import java.util.List;import java.util.List;

public interface CatalogoPeliculas {
    ServicioStreaming getServicio();

    List<String> obtenerPeliculas();
}

//TODO: Implementar la clase CatalogoPeliculas que represente un catálogo de películas de un servicio de streaming. Esta clase debe implementar la interfaz CatalogoPeliculas y proporcionar una lista de películas disponibles en el servicio correspondiente.