public enum ServicioStreaming {
    DISNEY("Disney"),
    PARAMOUNT("Paramount"),
    WARNER("Warner");

    private final String nombre;

    ServicioStreaming(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}