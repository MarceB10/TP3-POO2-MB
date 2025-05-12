package oop2.tp3.ejercicio4;

public record Persona(String nombre, String apellido) {
    @Override
    public String toString() {
        return "Persona: " +
                "nombre= " + this.nombre + "\'" +
                ", apellido= " + this.apellido + "\'";
    }
}
