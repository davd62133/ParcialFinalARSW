package eci.finalarsw.model;

public class Grado {
    private double numViejo;
    private double numNuevo;

    public Grado() {
    }

    public Grado(double numNuevo,double numViejo) {
        this.numViejo = numViejo;
        this.numNuevo = numNuevo;
    }

    public double getNumViejo() {
        return numViejo;
    }

    public void setNumViejo(double numViejo) {
        this.numViejo = numViejo;
    }

    public double getNumNuevo() {
        return numNuevo;
    }

    public void setNumNuevo(double numNuevo) {
        this.numNuevo = numNuevo;
    }
}
