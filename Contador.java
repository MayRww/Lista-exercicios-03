class ContadorIntervalo {
    private int contador;

    public ContadorIntervalo() {
        this.contador = 0;
    }

    public void adicionarNumero(int numero) {
        if (numero >= 10 && numero <= 150) {
            contador++;
        }
    }

    public int contarNumerosNoIntervalo() {
        return contador;
    }
}