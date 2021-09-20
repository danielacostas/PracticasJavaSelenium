import java.util.List;

public class Locomotora extends Tren implements Interfaz{

    private final int NUM_RUEDAS = 8;

    public Locomotora(int vr, int vc, Colores color, Locomotora l) {
        super(vr, vc, color, l);
    }

    public Locomotora(int vr, int vc, Colores color, Locomotora l, List<Vagon> v) {
        super(vr, vc, color, l, v);
    }
}
