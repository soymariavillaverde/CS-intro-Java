package org.donbosco.myfirstbackapp;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    // Método main base
    /* public static void main(String[] args) {
        System.out.println("Hello Wooorld!");
    } */

    //Prueba de constructores
    public static void main(String[] args) {
        PrimitiveData data = new PrimitiveData();
        PrimitiveData data2 = new PrimitiveData("Pepe");
        System.out.println(data.name);
        System.out.println(data2.name);
    }

}
