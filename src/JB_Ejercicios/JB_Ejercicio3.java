package JB_Ejercicios;

public class JB_Ejercicio3 {

    public static void main(String[] args) {

        String[] textos = new String[6];
        textos[0]="Crear ";
        textos[1]="un ";
        textos[2]="bucle ";
        textos[3]="para ";
        textos[4]="concatenar ";
        textos[5]="textos.";

        System.out.println(concatenar(textos));

    }
    static String concatenar(String[] textos){
        String cadena= "";
        for(String texto: textos){
            cadena += texto;
        }
        return cadena;
    }
}
