package JB_Ejercicios6_7_8;

import java.io.*;
import java.sql.SQLOutput;
import java.util.*;

import static JB_Ejercicios6_7_8.Datos.*;

public class funciones {

    public static String reverse(String texto) {
        String textoInverso = "";
        System.out.println("\n0.Invertimos el texto: \n");
        for (int i = 0; i < texto.length(); i++) {
            textoInverso += texto.charAt(texto.length() - 1 - i);
        }
        return textoInverso;
    }

    public static void recorrerArray1D(String[] miArray) {
        String[] Array = miArray;
        System.out.println("\n1.Recorremos Array unidimensional: \n");
        for (int i = 0; i < Array.length; i++) {
            System.out.println(Array[i]);
        }
    }

    public static void recorrerArray2D(int[][] miArray) {
        int[][] Array = miArray;
        System.out.println("\n2.Recorremos Array bidimensional: \n");
        for (int i = 0; i < Array.length; i++) {
            for (int j = 0; j < Array[i].length; j++) {
                System.out.println("El elemento de la fila " + i + " y columna " + j + " es: " + Array[i][j]);
            }

        }
    }

    public static Vector<Double> crearVector(Vector miVector) {
        Vector vector = miVector;
        for (int i = 0; i < 5; i++) {
            vector.add(Math.random());
        }
        return vector;
    }

    public static Vector<Double> borraElementos(Vector miVector) {

        miVector.removeElementAt(2);
        /*importante, 1º retiramos el 3º porque
        de lo contrario, al retirar el 2º el 3º pasaría a ser el 2º y
        generariamos un error lógico al retirar muy probablemente el que
         en origen era el 4º elemento*/
        miVector.removeElementAt(1);
        return miVector;
    }

    public static void muestraVector(Vector miVector) {

        System.out.print(miVector);
    }

    public static void ejercicioVector() {
        System.out.println("\n3.Creamos y trabajamos con un vector: \n");
        crearVector(mivector);
        muestraVector(mivector);
        System.out.println(" ---  Vector inicial");
        borraElementos(mivector);
        muestraVector(mivector);
        System.out.println(" ---  Vector sin 2º ni 3º elemento");
    }

    public static void aclaracionVectores() {
        System.out.println("\n4.Problema de crear vector con la capacidad por defecto: \n");
        System.out.println("Por defecto su capacidad sería de 10, \n" +
                "al superar los diez elementos haría copia y duplicaría su capacidad a 20 \n" +
                "y así sucesivamente hasta llegar/superar los 1000 elementos de capacidad \n" +
                "ralentizando la ejecución");
    }

    public static ArrayList<String> crearArrayList(ArrayList<String> miArrayList) {
        miArrayList.add(0, "España");
        miArrayList.add(1, "Francia");
        miArrayList.add(2, "Italia");
        miArrayList.add(3, "Alemania");

        return miArrayList;
    }

    public static LinkedList<String> copiarALinkedList(ArrayList miArrayList) {
        for (int i = 0; i < miArrayList.size(); i++) {
            miLinkedList.add(i, miArrayList.get(i).toString());
        }
        return miLinkedList;
    }

    public static void muestraListas(ArrayList miArrayList, LinkedList miLinkedList) {
        System.out.println("El ArrayList: \n");
        for (int i = 0; i < miArrayList.size(); i++) {
            System.out.println(miArrayList.get(i));
        }
        System.out.println("\nEl LinkedList: \n");
        for (int i = 0; i < miLinkedList.size(); i++) {
            System.out.println(miLinkedList.get(i));
        }
    }

    public static void ejercicioList1() {
        crearArrayList(miArrayList);
        copiarALinkedList(miArrayList);
        System.out.println("\n5. ArrayList y LinkedList: \n");
        muestraListas(miArrayList, miLinkedList);
    }

    public static ArrayList<Integer> crearALInteger(ArrayList ArrayListInt) {
        for (int i = 0; i < 10; i++) {
            int elemento = (int) (10 * Math.random());
            ArrayListInt.add(i, elemento);
        }
        return ArrayListInt;
    }

    public static void recorrerList(ArrayList ArrayListInt) {
        for (Object elemento : ArrayListInt) {
            System.out.print(elemento + ", ");
        }
    }

    public static ArrayList<Integer> quitarPares(ArrayList ArrayListInt) {
        /*empezamos por el final dado que el tamaño del arraylist va a disminuir,
        en caso contrario nos saltaremos posiciones en el bucle.*/
        for (int i = ArrayListInt.size() - 1; i >= 0; i--) {
            if (((int) (ArrayListInt.get(i)) % 2) == 0) {
                ArrayListInt.remove(i);
            }
        }
        return ArrayListInt;
    }

    public static void ejercicioList2() {
        crearALInteger(ArrayListInt);
        System.out.println("\n6.Ejercicio con Arraylist<Integer>: \n");
        recorrerList(ArrayListInt);
        System.out.println("   --- Este es el ArrayList Inicial \n");
        quitarPares(ArrayListInt);
        recorrerList(ArrayListInt);
        System.out.println("   --- Este es el ArrayList final \n");
    }

    public static int dividePorCero(int a) throws ArithmeticException {
        System.out.println("\n7. Prueba captura Error aritmético: \n");
        try {
            return a / 0;
        } catch (ArithmeticException e) {
            System.out.println("Esto no puede hacerse");
        } finally {
            System.out.println("Demo de código");
        }
        return 0;
    }

    public static void copiaFichero(String fileIn, String fileOut) {

        try {
            InputStream in = new FileInputStream(fileIn);
            byte[] datos = in.readAllBytes();

            PrintStream out = new PrintStream(fileOut);
            out.write(datos);

        } catch (Exception e) {
            System.out.println("No ha funcionado, se capturó la excepción.");
        }

        System.out.println("\n8. Ejercicio de copia de ficheros con InputStream y OutputStream: \n");
    }

    public static HashMap<Integer,String> llenarMapa(){
        mapaRutas.put(1, "C:/Users/user/Desktop/cursos/doc1.txt");
        mapaRutas.put(2, "C:/Users/user/Desktop/cursos/doc2.txt");
        mapaRutas.put(3, "C:/Users/user/Desktop/cursos/doc3.txt");
        mapaRutas.put(4, "C:/Users/user/Desktop/cursos/doc4.txt");
        mapaRutas.put(5, "C:/Users/user/Desktop/cursos/doc5.txt");

        return mapaRutas;
    }

    public static ArrayList<String> llenarArrayList(){
        listaTemas.add("1.¿La Tierra es redonda o es plana?");
        listaTemas.add("2.¿El día tiene 24 horas?");
        listaTemas.add("3.¿Todos los días chocamos con meteoritos?");
        listaTemas.add("4.¿Cuántos humanos han habitado la Tierra?");
        listaTemas.add("5.¿Cuánto hielo hay en la Antártida?");

        return listaTemas;
    }

    public static int generarIndiceAleatorio (){
        int indice = (int)(1+Math.random()*5);
        return indice;
    }

    public static void leerFichero (int indice){
        try {
            InputStream fichero = new FileInputStream(mapaRutas.get(indice));
            byte[] datos = fichero.readAllBytes();
            for (byte dato: datos) {
                System.out.print((char)dato);
            }
            PrintStream out = new PrintStream("copiaSorpresa.txt");
            out.write(datos);
            fichero.close();
        } catch (Exception e) {
            System.out.println("Se ha producido una excepción.");;
        }
    }

    public static void seleccionarAccion(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(listaTemas);
        System.out.println("Escriba un número del 1 al 5 para escoger el tema o\ncualquier otro caracter para una sorpresa aleatoria");
        String input = scanner.next();

        switch(input){
            case "1": leerFichero(1);
            break;
            case "2": leerFichero(2);
            break;
            case "3": leerFichero(3);
            break;
            case "4": leerFichero(4);
            break;
            case "5": leerFichero(5);
            break;
            default: leerFichero(generarIndiceAleatorio());
        }
    }




    public static void ejercicio9 (){
        System.out.println("\n9. Ejercicio para ¿sorprender? a Seniors que han visto muchas cosas: \n");
        llenarMapa();
        llenarArrayList();
        seleccionarAccion();
    }
}
