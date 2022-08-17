package JB_Ejercicios6_7_8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Vector;

public class Datos {

    static String[] arrayTexto = {
            "Escribe código que devuelva una cadena al revés.",
            "Crea un array unidimensional de Strings y recórrelo.",
            "Crea un array bidimensional de enteros y recórrelo.",
            "Crea un 'Vector' del tipo de dato que prefieras y añádele 5 elementos."
    };

    static int[][] array2D = {
            {2,7,-3},
            {1,0,-1},
            {0,1,1}
    };

    public static Vector<Double> mivector = new Vector(5,5);

    public static ArrayList<String> miArrayList = new ArrayList<>();

    public static LinkedList<String> miLinkedList = new LinkedList<>();

    public static ArrayList<Integer> ArrayListInt = new ArrayList<>();

    public static HashMap<Integer, String> mapaRutas = new HashMap<>();

    public static ArrayList<String> listaTemas = new ArrayList<>(5);

}
