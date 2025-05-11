package oop2.tp3.ejercicio3;

import java.time.LocalDate;
import java.util.List;

public class ReporteDeGastos {
    private LocalDate fecha;

    public ReporteDeGastos(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String imprimir(List<Gasto> gastos) {
        StringBuilder reporte = new StringBuilder();
        int total = 0;
        int gastosDeComida = 0;

        reporte.append("Expenses ").append(fecha).append(System.lineSeparator());

        for (Gasto gasto : gastos) {
            gastosDeComida += gasto.montoComida();

            reporte.append(gasto.nombre())
                    .append("\t")
                    .append(gasto.monto())
                    .append("\t")
                    .append(esExceso(gasto))
                    .append(System.lineSeparator());

            total += gasto.monto();
        }

        reporte.append("Gastos de comida: ").append(gastosDeComida).append(System.lineSeparator());
        reporte.append("Total de gastos: ").append(total).append(System.lineSeparator());

        return reporte.toString();
    }

    private static String esExceso(Gasto gasto) {
        return gasto.esExcesoDeComida() ? "X" : " ";
    }
}