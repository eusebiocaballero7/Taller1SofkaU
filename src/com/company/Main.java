/**
 * Author: Eusebio Caballero.
 */

package com.company;

/**
 * Clase principal donde interactúan las clases creadas, a partir de la instancia de objetos.
 */

public class Main{

    public static void main(String[] args) {
        /**
         * creando un objeto de clase persona y seteando el nombre de human1 a modo de probar el metodo set y get.
         */
        Person human1 = new Person();
        human1.setName("Jane");
        System.out.println(human1.getName());
        /**
         * Instanciando un objeto de la clase fruta y configurando dos colores como caracteristicas del objeto.
         */
        Fruit fruit1 = new Fruit();
        fruit1.setColor("orange");
        fruit1.setColor("yellow");
        System.out.println(fruit1.getColors());
        /**
         * Instanciando un objeto cuenta de banco y seteando la activación de la cuenta con estado booleano.
         */
        BankAccount account1 = new BankAccount();
        account1.setActived(true);
        System.out.println(account1.getActived());
        /**
         * Creando dos objetos de clase Car y seteando el atributo tamaño del primer objeto. La declaración
         * comentada deriva de establecer el llamado de un metodo privado en la clase.
         */
        Car carOne = new Car();
        Car carTwo = new Car();
        carOne.color = "black";
        carOne.size = 180;
        carOne.setSize(190);
        System.out.println(carOne.color);
        System.out.println(carOne.getSize());
        //System.out.println(Car.getCountCars())
        /**
         * Instancia de un objeto box1 de la clase caja con un método constructor que solo define el atributo
         * bruteWeight por defecto, mas no permite la modificación posterior de este.
         */
        Box box1 = new Box(18.05F);
        box1.setNetWeight(18.50F);
        box1.setVolume(200F);
        System.out.println(box1.getBruteWeight());
        /**
         * Instancia de un objeto book1 que setea y obtiene las páginas a contener.
         */
        Book book1 = new Book();
        book1.setPages(200);
        System.out.println(book1.getPages());
    }
}

