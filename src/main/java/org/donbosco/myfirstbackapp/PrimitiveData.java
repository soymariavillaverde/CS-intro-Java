package org.donbosco.myfirstbackapp;

// imports

public class PrimitiveData {
    
    // atributos: valores/propiedades/características de una clase
    private String name;

    
    
    // Constructores
    //Constructor que NO recibe parámetros
    public PrimitiveData() {
        // asigna un valor fijo al atributo name
        this.name = "Porter";
    }

    //Constructor que recibe parámetros
    public PrimitiveData(String name) {
        // asigna un valor variable al atributo name
        this.name = name;
    }

    
    //Métodos - acciones
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Ejemplos de otros métodos (acciones)
    public void printReversedDtring() {

    };

    public void removeAllVocals(){

    }

}
