package JB_Ejercicio4;

public class main {

    public static void main(String[] args) {

        SmartWatch xiaomiC14 = new SmartWatch("Xiaomi","C14","Android",
                true, "Plástico azul", 1.2);
        SmartPhone samsungA52 = new SmartPhone("Samsung","A52","Android",
                true,8.2,false);

        System.out.println(xiaomiC14.toString());
        System.out.println(samsungA52.toString());
    }

}
