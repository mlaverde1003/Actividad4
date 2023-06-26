/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;

import java.util.Scanner;
/*
Crear un programa que permita calcular el promedio de N estudiantes. A cada
estudiante se le pedirá la cantidad de notas que desea promediar, nombres,
apellidos, semestre y carrera. Imprimir todos los datos y promedio de cada
estudiante. 
*/


public class Ejercicio4 {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de estudiantes: ");
        int cantidadEstudiantes = scanner.nextInt();

        Estudiante[] estudiantes = new Estudiante[cantidadEstudiantes];

        for (int i = 0; i < cantidadEstudiantes; i++) {
            System.out.println("Estudiante #" + (i + 1));
            scanner.nextLine();

            System.out.print("Ingrese los nombres del estudiante: ");
            String nombres = scanner.nextLine();

            System.out.print("Ingrese los apellidos del estudiante: ");
            String apellidos = scanner.nextLine();

            System.out.print("Ingrese el semestre del estudiante: ");
            String semestre = scanner.nextLine();

            System.out.print("Ingrese la carrera del estudiante: ");
            String carrera = scanner.nextLine();

            System.out.print("Ingrese la cantidad de notas a promediar: ");
            int cantidadNotas = scanner.nextInt();

            estudiantes[i] = new Estudiante(nombres, apellidos, semestre, carrera, cantidadNotas);
            estudiantes[i].ingresarNotas(scanner);
        }

        for (int i = 0; i < cantidadEstudiantes; i++) {
            System.out.println("\nDatos del estudiante #" + (i + 1) + ":");
            estudiantes[i].mostrarDatos();
        }
    }
}
