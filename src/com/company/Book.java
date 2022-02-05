/**
 * Author: Eusebio Caballero.
 */
package com.company;

/**
 * Creación de la clase Book y sus atributos y métodos para establecer ciertas características como
 * name, pages y contentTable (Tabla de contenido).
 */

public class Book {
    public String name;
    private int pages;
    protected boolean contentTable;

    /**
     * Sobrecarga de constructores para poder instanciar objetos con o sin parametros predefinidos.
     */

    public Book() {

    }

    public Book(boolean contentTable, int pages) {
        this.contentTable = contentTable;
        this.pages = pages;
    }

    /**
     * Métodos getter and setter de contentTable y pages, atributos de la clase Book.
     */

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public boolean isContentTable() {
        return contentTable;
    }

    public void setContentTable(boolean contentTable) {
        this.contentTable = contentTable;
    }

}
