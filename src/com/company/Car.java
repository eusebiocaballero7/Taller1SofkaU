/**
 * Author: Eusebio Caballero.
 */
package com.company;
/**
 * Clase Car para instanciar objetos y aparte posee una característica privada de contar los objetos usando un
 * bloque de inicialización que sopesa sobre los constructores creados, además de métodos getter and setter.
 */
public class Car {

    private String numberPlate;
    public String color;
    protected int size;
    private static int countCars;

    {
        countCars++;
    }

    public Car() {

    }

    public Car(String numberPlate, int size) {
        this.numberPlate = numberPlate;
        this.size = size;
    }

    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    protected void setSize(int size) {
        this.size= size;
    }
    protected int getSize() {
        return size;
    }

    private static int getCountCars() {
        return countCars;
    }
}