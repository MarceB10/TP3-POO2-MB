package oop2.refactoring.collecting.ejemplo1;

import java.util.ArrayList;

public class Bebida extends ItemMenu {
    private float litros;

    public Bebida(String descripcion, float precio, float litros) {
        super(precio, descripcion);
        this.litros = litros;
    }

    public float litros() {
        return this.litros;
    }

    public void agregarBebida(ArrayList<Object> bebidas) {
        bebidas.add(this);
    }

}
