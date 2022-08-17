package JB_Ejercicio4;

public abstract class SmartDevice {

    protected String fabricante;
    protected String modelo;
    protected String sistemaOperativo;
    protected boolean compatibilidad5g;

    public SmartDevice(){}

    public SmartDevice(String fabricante, String modelo, String sistemaOperativo, boolean compatibilidad5g) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.sistemaOperativo = sistemaOperativo;
        this.compatibilidad5g = compatibilidad5g;
    }

}
