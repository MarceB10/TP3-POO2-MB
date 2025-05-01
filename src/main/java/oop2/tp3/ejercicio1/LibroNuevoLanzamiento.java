package oop2.tp3.ejercicio1;

public class LibroNuevoLanzamiento extends Libro {
    static final int NUEVO_LANZAMIENTO = 1;

    public LibroNuevoLanzamiento(String nombre) {
        super(nombre, NUEVO_LANZAMIENTO);
    }

    @Override
    public Double calcularDeudaLibro(int diasAlquilados) {
        return diasAlquilados *  3.0;
    }

    @Override
    public int calcularPuntos() {
        return 0;
    }
}
