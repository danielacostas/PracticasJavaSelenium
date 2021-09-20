public class Coche extends Vehiculo implements Interfaz{

    private final int NUM_RUEDAS = 4;

    public Coche(int vr, int vc, Colores color) {
        super(vr, vc, color);
    }

    public int getNUM_RUEDAS() {
        return NUM_RUEDAS;
    }
}
