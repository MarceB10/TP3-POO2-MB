package oop2.tp3.ejercicio1;

public abstract class Libro {
    static final int INFANTILES = 2;
    static final int REGULARES = 0;
    static final int NUEVO_LANZAMIENTO = 1;
    private String nombre;
    private int codigoPrecio;

    public Libro(String nombre, int priceCode) {
        this.nombre = nombre;
        this.codigoPrecio = priceCode;
    }

    public int codigoPrecio() {
        return codigoPrecio;
    }

    public String nombre() {
        return nombre;
    }

    public abstract Double calcularDeudaLibro(int diasAlquilados);

    public abstract int calcularPuntos();

    public boolean soyNuevoLanzamiento() {
        return this.codigoPrecio == NUEVO_LANZAMIENTO;
    }

}