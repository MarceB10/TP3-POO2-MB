package oop2.tp3.ejercicio1;

public class Alquiler {
    static final int DIA_MINIMO_DE_ALQUILER = 1;
    private CopiaLibro copia;
    private int diasAlquilados;

    public Alquiler(CopiaLibro copia, int diasAlquilados) {
        this.copia = copia;
        this.diasAlquilados = diasAlquilados;
    }

    public int diasAlquilados() {
        return this.diasAlquilados;
    }

    public CopiaLibro copia() {
        return this.copia;
    }

    public Double deudaAlquilerLibro(){
        return this.copia.laDeudaCopiaEs(this.diasAlquilados);
    }
    public int bonusAlquilerNuevoLanzamiento() {
        int puntosAlquiler=0;
        if (copia().isNuevoLanzamiento() && diaValido()) {
            puntosAlquiler++;
        }
        return puntosAlquiler;
    }

    private boolean diaValido() {
        return diasAlquilados > DIA_MINIMO_DE_ALQUILER;
    }

}
