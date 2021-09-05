package ui;
import model.LinkedList;

public class Main {
    public static void main(String[] args){
        LinkedList<String> linkedString = new LinkedList<>();

        // PRUEBA DE LA IMPLEMENTACIÓN
        // SE PUEDE CAMBIAR EL TIPO DE DATO POR CUALQUIERA Y PROBAR LA IMPLEMENTACIÓN
        linkedString.add("Carlos");
        linkedString.add("Andres");
        linkedString.add("Brayan");
        linkedString.add("Zofia");


        System.out.println(linkedString.get(0));
        System.out.println(linkedString.get(1));
        System.out.println(linkedString.get(2));
        System.out.println(linkedString.get(3));
    }
}
