package oop2.tp3.ejercicio1;

public class LibroRegular extends Libro {
    static final int REGULARES = 0;

    public LibroRegular(String nombre) {
        super(nombre, REGULARES);
    }


    @Override
    public Double calcularDeudaLibro(int diasAlquilados) {
        double monto = 2;
        if(diasAlquilados > 2){
            monto += (diasAlquilados - 2 ) * 1.5;
        }
        return monto;
    }

    @Override
    public int calcularPuntos() {
        return 0;
    }
}
