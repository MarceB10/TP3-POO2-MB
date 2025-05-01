package oop2.tp3.ejercicio1;

public class CopiaLibro {
    private Libro libro;

    public CopiaLibro(Libro libro) {
        this.libro = libro;
    }

    public Libro libro() {
        return libro;
    }

    public boolean isNuevoLanzamiento(){
        return this.libro.soyNuevoLanzamiento();
    }

    public Double laDeudaCopiaEs(int diasAlquilado){
        return this.libro.calcularDeudaLibro(diasAlquilado);
    }
}