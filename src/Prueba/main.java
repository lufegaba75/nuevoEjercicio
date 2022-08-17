package Prueba;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;


/*public class main {

   /* public static void main(String[] args) {

        HashMap<Integer, String> mapa = new HashMap<>();
            mapa.put(1, "C:/Users/user/Desktop/cursos/doc1.txt");
            mapa.put(2, "C:/Users/user/Desktop/cursos/doc2.txt");
            mapa.put(3, "C:/Users/user/Desktop/cursos/doc3.txt");
            mapa.put(4, "C:/Users/user/Desktop/cursos/doc4.txt");
            mapa.put(5, "C:/Users/user/Desktop/cursos/doc5.txt");

        ArrayList<Byte> titulo = new ArrayList<>();
        String tituloletra = "";

        //System.out.println(mapa.get(2));
        int indice;
        indice = (int)((Math.random()*5)+1);

        String cabecera = """
                HECHOS SORPRENDENTES DE LA TIERRA
                (de https://www.muycomputer.com/2016/03/22/diez-cosas-impresionantes-tierra/)

                """;
        System.out.println(cabecera.length()); //113

        try {
            InputStream fichero = new FileInputStream(mapa.get(indice));
            try {
                byte[] datos = fichero.readAllBytes();
                /*for (byte dato: datos) {
                    System.out.print((char)dato);
                }

                for(int i=113;i<datos.length ; i++){
                    do{
                        titulo.add(datos[i]);
                    }while((char)datos[i] == '\\');
                }

            }catch (IOException e) {
                System.out.println("El programa da error: "+e.getMessage());
            }


        }catch(FileNotFoundException e){
            System.out.println("El programa da error: "+e.getMessage());
            }

        for(int i=0; i<titulo.size(); i++){
            char c = (char)(titulo.get(i));

        }



    }

}*/
