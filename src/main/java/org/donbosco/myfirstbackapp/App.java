package org.donbosco.myfirstbackapp;
public final class App {
    private App() {
    }

    // Método main base
        /* public static void main(String[] args) {
            System.out.println("Hello Wooorld!");
        } */


    //Prueba de constructores
/*     public static void main(String[] args) {
        PrimitiveData data = new PrimitiveData();
        PrimitiveData data2 = new PrimitiveData("Pepe");
        System.out.println(data.name);
        System.out.println(data2.name);
    } */

    
    // Prueba de métodos
/*     public static void main(String[] args) {
        PrimitiveData data = new PrimitiveData("Rosa");
        data.name = "Claudia";
        System.out.println(data.name);
    } */

        //con el atributo privado
        public static void main(String[] args) {
            
            // Recuperar el atributo
            /* PrimitiveData data = new PrimitiveData("Juan");
            System.out.print(data.getName()); */

            // Settear el atributo
            PrimitiveData data = new PrimitiveData("Juan");
            data.setName("Pablo");
            System.out.print(data.getName());
        }

}
