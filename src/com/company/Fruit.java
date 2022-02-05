/**
 * Author: Eusebio Caballero.
 */
package com.company;
/**
 * Clase fruit que establece atributos y métodos para nombrar y establecer los colores que la componen.
 */
import java.util.ArrayList;

public class Fruit {
    public String name;
    private float averageWeight;
    private ArrayList<String> colors;

    public Fruit (){
        this.colors = new ArrayList<>();
    }

    public ArrayList<String> getColors() {
        return colors;
    }
    public void setColor(String name) {
        String s = name;
        colors.add(s);
    }

}
