public class Camion extends Vehiculo implements Interfaz{

    private final int NUM_RUEDAS = 10;

    public Camion(int vr, int vc, Colores color) {
        super(vr, vc, color);
    }

    public int getNUM_RUEDAS() {
        return NUM_RUEDAS;
    }
}
