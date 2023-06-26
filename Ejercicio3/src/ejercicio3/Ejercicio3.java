/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

import java.util.Scanner;

/*
Se desea crear un sistema que realice operaciones con fracciones suma, resta,
multiplicación y división
*/

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el numerador de la primera fracción: ");
        int numerador1 = scanner.nextInt();

        System.out.print("Ingrese el denominador de la primera fracción: ");
        int denominador1 = scanner.nextInt();

        System.out.print("Ingrese el numerador de la segunda fracción: ");
        int numerador2 = scanner.nextInt();

        System.out.print("Ingrese el denominador de la segunda fracción: ");
        int denominador2 = scanner.nextInt();

        Fraccion fraccion1 = new Fraccion(numerador1, denominador1);
        Fraccion fraccion2 = new Fraccion(numerador2, denominador2);

        Fraccion resultadoSuma = fraccion1.suma(fraccion2);
        Fraccion resultadoResta = fraccion1.resta(fraccion2);
        Fraccion resultadoMultiplicacion = fraccion1.multiplicacion(fraccion2);
        Fraccion resultadoDivision = fraccion1.division(fraccion2);

        System.out.println("Suma: " + resultadoSuma.getNumerador() + "/" + resultadoSuma.getDenominador());
        System.out.println("Resta: " + resultadoResta.getNumerador() + "/" + resultadoResta.getDenominador());
        System.out.println("Multiplicación: " + resultadoMultiplicacion.getNumerador() + "/" + resultadoMultiplicacion.getDenominador());
        System.out.println("División: " + resultadoDivision.getNumerador() + "/" + resultadoDivision.getDenominador());
    }
}