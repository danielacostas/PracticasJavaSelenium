public class Vehiculo {

    private int velRecta;
    private int velCurva;
    private Colores color;

    public Vehiculo(Colores color) {
        this.velRecta = 0;
        this.velCurva = 0;
        this.color = color;
    }

    public Vehiculo(int vr, Colores color) {
        if (vr >= 0) {
            this.velRecta = vr;
            this.velCurva = 1;
            this.color = color;
        }
        else {
            System.out.println("La velocidad no puede ser un número negativo.");
        }
    }

    public Vehiculo(int vr, int vc, Colores color) {
        if (vr >= 0 && vc >= 0) {
            this.velRecta = vr;
            this.velCurva = vc;
            this.color = color;
        }
        else {
            System.out.println("La velocidad no puede ser un número negativo.");
        }
    }

    public Vehiculo(Vehiculo h){
        this.velRecta = h.getVelRecta();
        this.velCurva = h.getVelCurva();
    }

    public int getVelRecta() {
        return velRecta;
    }

    public void setVelRecta(int velRecta) {
        this.velRecta = velRecta;
    }

    public int getVelCurva() {
        return velCurva;
    }

    public void setVelCurva(int velCurva) {
        this.velCurva = velCurva;
    }

    public Colores getColor() {
        return color;
    }

    public void setColor(Colores color) {
        this.color = color;
    }

    @Override
    public String  toString() {
        return "Velocidad de recta actual: " + velRecta + " || Velocidad de curva actual: " + velCurva;
    }

    public void aceleraRecta() {
        setVelRecta(getVelRecta()+5);
    }

    public void aceleraCurva() {
        setVelCurva(getVelCurva()+5);
    }

    public void frenaRecta() {
        setVelRecta(getVelRecta()-5);
    }

    public void frenaCurva() {
        setVelCurva(getVelCurva()-5);
    }

    public void mejoraVehiculo() {
        setVelRecta(getVelRecta()+15);
        setVelCurva(getVelCurva()+15);
    }

    public int calculaRecta (int k){
        if (getVelRecta() == 0) {
            return -1;
        }
        return (k/getVelRecta())*3600;
    }

    public int calculaCurva (int k){
        if (getVelCurva() == 0) {
            return -1;
        }
        return (k/getVelCurva())*3600;
    }
}
