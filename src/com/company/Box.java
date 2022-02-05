/**
 * Author: Eusebio Caballero.
 */
package com.company;
/**
 * Clase Box con sus atributos, métodos getter and setter, y sobrecarga de constructores para instanciar el objeto con o sin parámetros.
 */
public class Box {

    public String color;
    private float volume;
    protected float netWeight;
    private float bruteWeight;

    public Box() {

    }

    public Box(float bruteWeight) {
        this.bruteWeight = bruteWeight;
    }

    public Box(float volume, float netWeight) {
        this.volume = volume;
        this.netWeight = netWeight;
    }

    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }

    protected float getNetWeight() {
        return netWeight;
    }

    protected void setNetWeight(float netWeight) {
        this.netWeight = netWeight;
    }

    private void setBruteWeight (float bruteWeight) {
        this.bruteWeight = bruteWeight;
    }

    public float getBruteWeight(){
        return bruteWeight;
    }
}
