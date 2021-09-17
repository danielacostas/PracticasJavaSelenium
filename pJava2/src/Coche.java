public class Coche {

    private int velRecta;
    private int velCurva;

    public Coche() {
        this.velRecta = 0;
        this.velCurva = 0;
    }

    public Coche(int vr) {
        if (vr >= 0) {
            this.velRecta = vr;
            this.velCurva = 1;
        }
        else {
            System.out.println("La velocidad no puede ser un número negativo.");
        }
    }

    public Coche(int vr, int vc) {
        if (vr >= 0 && vc >= 0) {
            this.velRecta = vr;
            this.velCurva = vc;
        }
        else {
            System.out.println("La velocidad no puede ser un número negativo.");
        }
    }

    public Coche(Coche c){
        this.velRecta = c.getVelRecta();
        this.velCurva = c.getVelCurva();
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

    public void mejoraCoche() {
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
