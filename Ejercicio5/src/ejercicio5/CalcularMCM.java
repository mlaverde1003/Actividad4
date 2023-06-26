package ejercicio5;

class MinimoComunMultiplo {
    private final int numero;

    public MinimoComunMultiplo(int numero) {
        this.numero = numero;
    }

    public int calcularMinimoComunMultiplo() {
        int mcm = numero;

        for (int i = 2; i <= numero; i++) {
            while (mcm % i == 0 && mcm != i) {
                mcm /= i;
            }
        }

        return mcm;
    }
}