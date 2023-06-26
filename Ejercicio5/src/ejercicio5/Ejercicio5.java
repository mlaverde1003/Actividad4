/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;

import java.util.Scanner;


/*
Realizar un programa que calcule el máximo común múltiplo de un número
*/

public class Ejercicio5 {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        MinimoComunMultiplo mcm = new MinimoComunMultiplo(numero);
        int minimoComunMultiplo = mcm.calcularMinimoComunMultiplo();
        System.out.println("El mínimo común múltiplo de " + numero + " es: " + minimoComunMultiplo);
    }
}