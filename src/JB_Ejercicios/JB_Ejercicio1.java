package JB_Ejercicios;

import java.util.Arrays;

public class JB_Ejercicio1 {

    //atributos de la clase
    byte numByte;
    short numShort;
    int numEntero;
    long numLong;
    float numFloat;
    double numDouble;
    char caracter;
    String cadenaTexto;
    boolean booleano;


    //constructor de la clase
    public JB_Ejercicio1(byte numByte, short numShort, int numEntero, long numLong, float numFloat, double numDouble, char caracter, String cadenaTexto, boolean booleano) {
        this.numByte = numByte;
        this.numShort = numShort;
        this.numEntero = numEntero;
        this.numLong = numLong;
        this.numFloat = numFloat;
        this.numDouble = numDouble;
        this.caracter = caracter;
        this.cadenaTexto = cadenaTexto;
        this.booleano = booleano;
    }
    //metodo toString


    @Override
    public String toString() {
        return "JB_Ejercicio1{" +
                "numByte=" + numByte +
                ", numShort=" + numShort +
                ", numEntero=" + numEntero +
                ", numLong=" + numLong +
                ", numFloat=" + numFloat +
                ", numDouble=" + numDouble +
                ", caracter=" + caracter +
                ", cadenaTexto='" + cadenaTexto + '\'' +
                ", booleano=" + booleano +
                '}';
    }

    public static void main(String[] args) {


        //instancia de la clase
        JB_Ejercicio1 miobjeto = new JB_Ejercicio1((byte)7, (short) -256, 1555, -125698,
                14.45f, 3.1416, 'Ñ', "¿Cómo están ustedes?", false);

        System.out.println(miobjeto.toString());



    }
}
