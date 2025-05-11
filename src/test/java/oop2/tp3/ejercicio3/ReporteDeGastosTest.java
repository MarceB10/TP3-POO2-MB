package oop2.tp3.ejercicio3;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReporteDeGastosTest {

    @Test
    public void gastosMultiples(){
        var g1 = new GastoDesayuno(10000); //excede 1000
        var g2 = new GastoCena(10); //no excede 5000

        var reporte = new ReporteDeGastos(LocalDate.of(2024,10,10));
        var salida = reporte.imprimir(List.of(g1,g2));

        assertEquals("Expenses 2024-10-10\r\n" +
                "Desayuno\t10000\tX\r\n" +
                "Cena\t10\t \r\n" +
                "Gastos de comida: 10010\r\n" +
                "Total de gastos: 10010\r\n" , salida);
    }



}