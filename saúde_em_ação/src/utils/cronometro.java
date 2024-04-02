package utils;

public class cronometro {

    private long inicio;

    public void iniciar() {
        inicio = System.currentTimeMillis();
    }

    public long parar() {
        return System.currentTimeMillis() - inicio;
    }

    public void reiniciar() {
        inicio = System.currentTimeMillis();
    }
}
