/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

import java.util.Scanner;

/*
Crear un programa que permita calcular el promedio de N estudiantes. A cada
estudiante se le pedirá la cantidad de notas que desea promediar, nombres,
apellidos, semestre y carrera. Imprimir todos los datos y promedio de cada
estudiante. 
 */
public class Estudiante {
    private final String nombres;
    private final String apellidos;
    private final String semestre;
    private final String carrera;
    private final int cantidadNotas;
    private final double[] notas;

    public Estudiante(String nombres, String apellidos, String semestre, String carrera, int cantidadNotas) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.semestre = semestre;
        this.carrera = carrera;
        this.cantidadNotas = cantidadNotas;
        this.notas = new double[cantidadNotas];
    }

    public void ingresarNotas(Scanner scanner) {
        for (int i = 0; i < cantidadNotas; i++) {
            System.out.print("Ingrese la nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }
    }

    public double calcularPromedio() {
        double suma = 0;
        for (int i = 0; i < cantidadNotas; i++) {
            suma += notas[i];
        }
        return suma / cantidadNotas;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombres + " " + apellidos);
        System.out.println("Semestre: " + semestre);
        System.out.println("Carrera: " + carrera);
        System.out.println("Notas:");
        for (int i = 0; i < cantidadNotas; i++) {
            System.out.println("- Nota " + (i + 1) + ": " + notas[i]);
        }
        System.out.println("Promedio: " + calcularPromedio());
    }
}
