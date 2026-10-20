//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        Enlace enlace1 = new Enlace();
        Enlace enlace2 = new Enlace();
        Enlace enlace3 = new Enlace();

        enlace1.nombre = "Enlace Central-Norte";
        enlace1.velocidadMbps = 500;
        enlace1.origen = "Oficina Central";
        enlace1.destino = "Sucursal Norte";
        enlace1.activo = false;

        enlace2.nombre = "Enlace Central-Sur";
        enlace2.velocidadMbps = 200;
        enlace2.origen = "Oficina Central";
        enlace2.destino = "Sucursal Sur";
        enlace2.activo = false;

        enlace3.nombre = "Enlace Norte-Bodega";
        enlace3.velocidadMbps = 100;
        enlace3.origen = "Sucursal Norte";
        enlace3.destino = "Bodega";
        enlace3.activo = false;

        System.out.println("--- Información de los enlaces ---");
        enlace1.mostrarInformacion();
        enlace2.mostrarInformacion();
        enlace3.mostrarInformacion();

        System.out.println("--- Se activa solo el enlace 2 ---");
        enlace2.activar();

        System.out.println("--- Estado después de activar el enlace 2 ---");
        enlace1.mostrarInformacion();
        enlace2.mostrarInformacion();
        enlace3.mostrarInformacion();

        System.out.println("--- Velocidades ---");
        enlace1.mostrarVelocidad();
        enlace2.mostrarVelocidad();
        enlace3.mostrarVelocidad();

        System.out.println("--- Se desactiva el enlace 2 ---");
        enlace2.desactivar();
    }
}
