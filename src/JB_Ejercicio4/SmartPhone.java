package JB_Ejercicio4;

public class SmartPhone extends SmartDevice {

    protected double tamanoPantalla;
    protected boolean tieneCamara;

    public SmartPhone() {};

    public SmartPhone(String fabricante, String modelo, String sistemaOperativo, boolean compatibilidad5g, double tamañoPantalla, boolean tieneCamara) {
        super(fabricante, modelo, sistemaOperativo, compatibilidad5g);
        this.tamanoPantalla = tamanoPantalla;
        this.tieneCamara = tieneCamara;
    }

    @Override
    public String toString() {
        return "SmartPhone {" +
                "tamanoPantalla=" + tamanoPantalla +
                ", tieneCamara=" + tieneCamara +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", sistemaOperativo='" + sistemaOperativo + '\'' +
                ", compatibilidad5g=" + compatibilidad5g +
                '}';
    }
}

