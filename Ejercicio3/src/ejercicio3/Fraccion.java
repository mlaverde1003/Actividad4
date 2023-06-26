/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

class Fraccion {
    private final int numerador;
    private final int denominador;

    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public Fraccion suma(Fraccion otraFraccion) {
        int resultadoNumerador = this.numerador * otraFraccion.denominador + otraFraccion.numerador * this.denominador;
        int resultadoDenominador = this.denominador * otraFraccion.denominador;
        return simplificarFraccion(new Fraccion(resultadoNumerador, resultadoDenominador));
    }

    public Fraccion resta(Fraccion otraFraccion) {
        int resultadoNumerador = this.numerador * otraFraccion.denominador - otraFraccion.numerador * this.denominador;
        int resultadoDenominador = this.denominador * otraFraccion.denominador;
        return simplificarFraccion(new Fraccion(resultadoNumerador, resultadoDenominador));
    }

    public Fraccion multiplicacion(Fraccion otraFraccion) {
        int resultadoNumerador = this.numerador * otraFraccion.numerador;
        int resultadoDenominador = this.denominador * otraFraccion.denominador;
        return simplificarFraccion(new Fraccion(resultadoNumerador, resultadoDenominador));
    }

    public Fraccion division(Fraccion otraFraccion) {
        int resultadoNumerador = this.numerador * otraFraccion.denominador;
        int resultadoDenominador = this.denominador * otraFraccion.numerador;
        return simplificarFraccion(new Fraccion(resultadoNumerador, resultadoDenominador));
    }

    private Fraccion simplificarFraccion(Fraccion fraccion) {
        int gcd = gcd(fraccion.numerador, fraccion.denominador);
        int numeradorSimplificado = fraccion.numerador / gcd;
        int denominadorSimplificado = fraccion.denominador / gcd;
        return new Fraccion(numeradorSimplificado, denominadorSimplificado);
    }

    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public int getNumerador() {
        return numerador;
    }

    public int getDenominador() {
        return denominador;
    }
}