public class Enlace {

    public String nombre;
    public double velocidadMbps;
    String origen;
    String destino;
    boolean activo;

    public void activar() {
        activo = true;
        System.out.println("Enlace " + nombre + " activado.");
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Origen: " + origen);
        System.out.println("Destino: " + destino);
        System.out.println("Velocidad: " + velocidadMbps + " Mbps");
        System.out.println("Activo: " + activo);
    }

    void desactivar() {
        activo = false;
        System.out.println("Enlace " + nombre + " desactivado.");
    }

    void mostrarVelocidad() {
        System.out.println("Velocidad de " + nombre + ": " + velocidadMbps + " Mbps");
    }

}
