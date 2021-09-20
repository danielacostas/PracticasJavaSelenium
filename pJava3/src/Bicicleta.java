public class Bicicleta extends Vehiculo implements Interfaz{

    private final int NUM_RUEDAS = 2;

    public Bicicleta(int vr, int vc, Colores color) {
        super(vr, vc, color);
    }

    public int getNUM_RUEDAS() {
        return NUM_RUEDAS;
    }
}
