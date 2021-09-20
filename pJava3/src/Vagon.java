import java.util.List;
import java.util.Random;

public class Vagon extends Tren implements Interfaz{

    private final int NUM_RUEDAS = 6;
    private int asientos;

    public Vagon(Colores color, Locomotora l, List<Vagon> v, int asientos) {
        super(l, v, color);
        Random r = new Random();
        this.asientos = r.nextInt(100);
    }

    public int getAsientos() {
        return asientos;
    }

    public void setAsientos(int asientos) {
        this.asientos = asientos;
    }

    public int getNUM_RUEDAS() {
        return NUM_RUEDAS;
    }
}
