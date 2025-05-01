package oop2.refactoring.collecting.ejemplo1;

import java.util.ArrayList;

public abstract class ItemMenu {

    private float precio;
    private String descripcion;

    public ItemMenu(float precio, String descripcion) {
        this.precio = precio;
        this.descripcion = descripcion;
    }

    public float precio() {
        return this.precio;
    }

    public void agregarBebida(ArrayList<Object> bebidas) {

    }
}
