package oop2.tp3.ejercicio1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AlquilerTest {

    @Test
    public void test01(){
        Libro elTunel = new LibroRegular("El Túnel");
        CopiaLibro elTunelCopia = new CopiaLibro(elTunel);
        Alquiler alquilerElTunel = new Alquiler(elTunelCopia, 5);
        Cliente yo = new Cliente("Marce");

        yo.alquilar(alquilerElTunel);

        Double precioTotal = yo.calcularDeudaAlquileres();
        var puntosObtenidos = yo.puntosObtenidos();


        assertEquals(6.5, precioTotal);
        assertEquals(1, puntosObtenidos);
    }

}