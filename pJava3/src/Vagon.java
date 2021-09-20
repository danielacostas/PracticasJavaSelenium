import java.util.List;
import java.util.Random;

public class Vagon extends Tren implements Interfaz{

    private final int NUM_RUEDAS = {6,4};
    private int asientos;

    public Vagon(Locomotora l, List<Vagon> v, int asientos) {
        super(l, v);
        Random r = new Random();
        this.asientos = r.nextInt(100);
    }
}
