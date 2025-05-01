package oop2.tp3.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private List<Alquiler> alquileres = new ArrayList<Alquiler>();
    private String name;
    private int puntosObtenidos;

    public Cliente(String nombre) {
        this.name = nombre;
        this.puntosObtenidos = 0;
    }

    public Double calcularDeudaAlquileres() {
        double total = 0;
        int puntosAlquilerFrecuente = 0;

        for (Alquiler alquiler : alquileres) {
            double monto = 0;
            total += alquiler.deudaAlquilerLibro();
            // sumo puntos por alquiler
            puntosAlquilerFrecuente++;
            // bonus por dos días de alquiler de un nuevo lanzamiento
            puntosAlquilerFrecuente += alquiler.bonusAlquilerNuevoLanzamiento();
        }

        this.puntosObtenidos = puntosAlquilerFrecuente;
        return total;
    }

    public int puntosObtenidos(){
        return puntosObtenidos;
    }

    public void alquilar(Alquiler rental) {
        alquileres.add(rental);
    }
}