/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

import java.util.Scanner;

/*
 Desarrollar un programa que determine el elemento mayor y menor de un
arreglo de N elementos enteros. Imprimir los números del arreglo, el número
mayor y el número menor.
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de elementos del arreglo: ");
        int cantidadElementos = scanner.nextInt();

        int[] arreglo = new int[cantidadElementos];

        System.out.println("Ingrese los elementos del arreglo:");
        for (int i = 0; i < cantidadElementos; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            arreglo[i] = scanner.nextInt();
        }

        Elementos elementosArray = new Elementos(arreglo);
        elementosArray.encontrarMayorYMenor();
    }
}
