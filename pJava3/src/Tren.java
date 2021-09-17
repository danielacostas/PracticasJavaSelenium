import java.util.List;

public class Tren extends Vehiculo implements Interfaz{

    private Locomotora locomotora;
    private List<Vagon> vagones;

    public Tren (Locomotora l){
        this.locomotora = l;
    }

    public Tren(Locomotora l, List<Vagon> v) {
        this.locomotora = l;
        this.vagones = v;
    }
    public void addVagones(Vagon vagon){

    }
    public void removeVagon (Vagon vagon){

    }
    public void removeAll(){

    }
    public void buscarVagon (int asientos){

    }
    public void getNumRuedas(){

    }
}
