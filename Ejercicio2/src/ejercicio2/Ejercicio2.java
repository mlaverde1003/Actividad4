/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

import java.util.Scanner;

/*
En una empresa de alquiler de automóviles requieren de un sistema orientado a objetos que les
permita calcular el valor a pagar por un automóvil rentado por un cliente. Del
cliente se desea pedir los datos: nombres, apellidos, documento, dirección,
cantidad de días que lo rento (mínimo de días 2 máximo 30 días). También se
desea pedir el tipo de automóvil que alquiló, la empresa posee 2 tipos de
vehículos:
• Baja gama familiar para 5 personas y el valor de alquiler por día es de
120.000 mil pesos.
• Alta gama familiar para 4 personas y el valor por día es de 180.000 mil
Pesos. 
*/
public class Ejercicio2 {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese los nombres del cliente: ");
        String nombres = scanner.nextLine();

        System.out.print("Ingrese los apellidos del cliente: ");
        String apellidos = scanner.nextLine();

        System.out.print("Ingrese el número de documento del cliente: ");
        String documento = scanner.nextLine();

        System.out.print("Ingrese la dirección del cliente: ");
        String direccion = scanner.nextLine();

        System.out.print("Ingrese la cantidad de días de alquiler: ");
        int cantidadDias = scanner.nextInt();

        scanner.nextLine(); // Limpiar el buffer de entrada

        System.out.print("Ingrese el tipo de automóvil alquilado (Baja gama familiar / Alta gama familiar): ");
        String tipoAutomovil = scanner.nextLine();

        AlquilerAutomovil alquiler = new AlquilerAutomovil(nombres, apellidos, documento, direccion, cantidadDias, tipoAutomovil);
        alquiler.mostrarDatosAlquiler();
    }
}
