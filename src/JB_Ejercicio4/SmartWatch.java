package JB_Ejercicio4;

public class SmartWatch extends SmartDevice{

    protected String pulsera;
    protected double tamanoEsfera;

    public SmartWatch() {}

    public SmartWatch(String fabricante, String modelo, String sistemaOperativo, boolean compatibilidad5g, String pulsera, double tamanoEsfera) {
        super(fabricante, modelo, sistemaOperativo, compatibilidad5g);
        this.pulsera = pulsera;
        this.tamanoEsfera = tamanoEsfera;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "pulsera='" + pulsera + '\'' +
                ", tamanoEsfera=" + tamanoEsfera +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", sistemaOperativo='" + sistemaOperativo + '\'' +
                ", compatibilidad5g=" + compatibilidad5g +
                '}';
    }
}
