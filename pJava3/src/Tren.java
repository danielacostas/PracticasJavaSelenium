import java.util.List;

public class Tren extends Vehiculo implements Interfaz{

    private Locomotora locomotora;
    private List<Vagon> vagones;

    public Tren (int vr, int vc, Locomotora l){
        super(vr, vc);
        this.locomotora = l;
    }

    public Tren(int vr, int vc, Locomotora l, List<Vagon> v) {
        super(vr, vc);
        this.locomotora = l;
        this.vagones = v;
    }
    public void addVagones(Vagon vagon){
        vagones.add(vagon);
    }
    public void removeVagon (Vagon vagon){
        vagones.remove(vagon);
    }
    public void removeAll(){
        vagones.removeAll();
    }
    public void buscarVagon (int asientos){
        int contador = 0;
        for (Vagon v : vagones){
            if (v.getAsientos() == asientos){
                contador++;
            }
        }
        System.out.println("Hay " + contador + "vagones con " + asientos + "asientos.");
    }
    public int getNumRuedas(){
        int ruedas = locomotora.getNumRuedas();
        for (Vagon v : vagones){
            ruedas += v.getNumRuedas();
        }
        return ruedas;
    }
}
