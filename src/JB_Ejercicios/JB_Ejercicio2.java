package JB_Ejercicios;


public class JB_Ejercicio2 {

    public static void main(String[] args) {

    System.out.println("El precio con IVA es: "+conIVA(16.15)+ " €.");

    }
    //dado un precio sin IVA nos lo devuelve con el 21% añadido
    public static double conIVA (double PrecioSinIVA){
        double PrecioConIVA=PrecioSinIVA*1.21;
        return PrecioConIVA;

    }


}
