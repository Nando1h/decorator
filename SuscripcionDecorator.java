import java.util.List;

public class SuscripcionDecorator extends CatalogoDecorator {
    private final Usuario usuario;

    public SuscripcionDecorator(CatalogoPeliculas catalogo, Usuario usuario) {
        super(catalogo);
        this.usuario = usuario;
    }

    @Override
    public List<String> obtenerPeliculas() {
        ServicioStreaming servicio = getServicio();
        if (!usuario.tieneSuscripcion(servicio)) {
            throw new IllegalStateException(
                    usuario.getNombre() + " no tiene activa la suscripcion de " + servicio.getNombre());
        }

        return super.obtenerPeliculas();
    }
}