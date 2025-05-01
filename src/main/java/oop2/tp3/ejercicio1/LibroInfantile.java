package oop2.tp3.ejercicio1;

public class LibroInfantile extends Libro {
    static final int INFANTILES = 2;

    public LibroInfantile(String nombre) {
        super(nombre, INFANTILES);
    }

    @Override
    public Double calcularDeudaLibro(int diasAlquilados) {
        double monto= 1.5;
        if(diasAlquilados > 3){
            monto +=  (diasAlquilados - 3 ) * 1.5;
        }
        return monto;
    }

    @Override
    public int calcularPuntos() {
        return 0;
    }

    @Override
    public boolean soyNuevoLanzamiento() {
        return false;
    }
}
