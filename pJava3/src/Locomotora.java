import java.util.List;

public class Locomotora extends Tren implements Interfaz{

    private final int NUM_RUEDAS = 8;

    public Locomotora(int vr, int vc, Colores color) {
        super(vr, vc, color);
    }

    public Locomotora(int vr, int vc, Colores color, Locomotora l, List<Vagon> v) {
        super(vr, vc, color, l, v);
    }

    public int getNUM_RUEDAS() {
        return NUM_RUEDAS;
    }
}
