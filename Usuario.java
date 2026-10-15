import java.util.EnumSet;
import java.util.Set;

public class Usuario {
    private final String nombre;
    private final Set<ServicioStreaming> suscripcionesActivas = EnumSet.noneOf(ServicioStreaming.class);

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void activarSuscripcion(ServicioStreaming servicio) {
        suscripcionesActivas.add(servicio);
    }

    public void cancelarSuscripcion(ServicioStreaming servicio) {
        suscripcionesActivas.remove(servicio);
    }

    public boolean tieneSuscripcion(ServicioStreaming servicio) {
        return suscripcionesActivas.contains(servicio);
    }
}