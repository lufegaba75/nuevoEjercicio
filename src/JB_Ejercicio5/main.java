package JB_Ejercicio5;

public class main {

    public static void main(String[] args) {

        CocheCRUD citroenc4 = new CocheCRUDImpl();
        citroenc4.save();
        citroenc4.findAll();
        citroenc4.delete();
    }
}
