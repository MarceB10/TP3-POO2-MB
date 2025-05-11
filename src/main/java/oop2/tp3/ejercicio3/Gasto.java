package oop2.tp3.ejercicio3;


public abstract class Gasto {

    private int monto;

    public Gasto(int monto){
        this.monto = monto;
    }

    public int monto(){
        return this.monto;
    }

    public abstract String nombre();

    protected int montoComida() {
        return 0;
    }

    protected boolean esExcesoDeComida() {
        return false;
    }

}




