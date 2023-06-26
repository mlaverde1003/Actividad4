/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;


public class Elementos {
    private final int[] arreglo;

    public Elementos(int[] arreglo) {
        this.arreglo = arreglo;
    }

    public void encontrarMayorYMenor() {
        int mayor = arreglo[0];
        int menor = arreglo[0];

        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] > mayor) {
                mayor = arreglo[i];
            }
            if (arreglo[i] < menor) {
                menor = arreglo[i];
            }
        }

        System.out.println("Números en el arreglo:");
        for (int elemento : arreglo) {
            System.out.print(elemento + " ");
        }
        System.out.println();
        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);
    }
}
    
