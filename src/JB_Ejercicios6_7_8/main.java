package JB_Ejercicios6_7_8;

import static JB_Ejercicios6_7_8.funciones.*;

public class main {

    public static void main(String[] args) {
        String mitexto = "¿Cómo están ustedes?";

        System.out.println("\nEJERCICIOS:");
        System.out.println(reverse(mitexto)); //pto. 1 del ejercicio
        recorrerArray1D(Datos.arrayTexto);
        recorrerArray2D(Datos.array2D);
        ejercicioVector();
        aclaracionVectores();
        ejercicioList1();
        ejercicioList2();
        dividePorCero((int)(Math.random()*10));
        copiaFichero("C:/Users/user/Desktop/cursos/SQLQuery1.sql","C:/Users/user/Desktop/cursos/Nueva carpeta/copia.sql");
        ejercicio9();
    }
}
