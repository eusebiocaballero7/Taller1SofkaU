/**
 * Author: Eusebio Caballero.
 */
package com.company;
/**
 * Representa una plantilla con el objeto "persona" y alguna de sus características distintivas.
 */
import java.util.Date;

public class Person {
    public String name, lastName1, lastName2;
    public Date dateBirth;
    public float height;

    /**
     *
     * Métodos para la obtención y configuración del atributo name (Se puede acceder desde cualquier clase por estar
     * público el atributo "name", son metódos demostrativos).
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}