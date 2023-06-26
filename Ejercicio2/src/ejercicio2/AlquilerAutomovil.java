
package ejercicio2;


public class AlquilerAutomovil {
     private final String nombres;
    private final String apellidos;
    private final String documento;
    private final String direccion;
    private final int cantidadDias;
    private final String tipoAutomovil;

    public AlquilerAutomovil(String nombres, String apellidos, String documento, String direccion, int cantidadDias, String tipoAutomovil) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.documento = documento;
        this.direccion = direccion;
        this.cantidadDias = cantidadDias;
        this.tipoAutomovil = tipoAutomovil;
    }

    public double calcularValorPagar() {
        double valorAlquilerPorDia = 0;
        if (tipoAutomovil.equals("Baja gama familiar")) {
            valorAlquilerPorDia = 120000;
        } else if (tipoAutomovil.equals("Alta gama familiar")) {
            valorAlquilerPorDia = 180000;
        }

        double valorTotal = valorAlquilerPorDia * cantidadDias;
        return valorTotal;
    }

    public void mostrarDatosAlquiler() {
        System.out.println("Datos del cliente:");
        System.out.println("Nombres: " + nombres);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Documento: " + documento);
        System.out.println("Dirección: " + direccion);
        System.out.println("Cantidad de días de alquiler: " + cantidadDias);
        System.out.println("Tipo de automóvil alquilado: " + tipoAutomovil);
        System.out.println("Valor a pagar: $" + calcularValorPagar());
    }
}