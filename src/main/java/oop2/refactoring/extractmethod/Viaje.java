package oop2.refactoring.extractmethod;

import java.time.LocalDate;
import java.time.LocalTime;

//public class Viaje {
//    private LocalDate fechaSalida;
//    private LocalTime horaSalida;
//    private double distanciaRecorrida;
//
//    public double costoDelViaje() {
//        //¿Qué significa esta condición en las reglas del negocio?
//        if (horaSalida.getHour() > 22 || horaSalida.getHour() < 06) {
//            return distanciaRecorrida * 5;
//        } else {
//            return distanciaRecorrida * 3;
//        }
//    }
//}

//Despues de refactorizar el if y los "numeros magicos"

public class Viaje {
    static final int COEFICIENTE_COSTO_VIAJE_NOCTURNO = 5;
    static final int COEFICIENTE_COSTO_VIAJE_DOS = 3;
    private LocalDate fechaSalida;
    private LocalTime horaSalida;
    private double distanciaRecorrida;

    public double costoDelViaje() {
        //¿Qué significa esta condición en las reglas del negocio?
        if (esViajeNocturno()) {
            return distanciaRecorrida * COEFICIENTE_COSTO_VIAJE_NOCTURNO;
        } else {
            return distanciaRecorrida * COEFICIENTE_COSTO_VIAJE_DOS;
        }
    }

    private boolean esViajeNocturno() {
        return horaSalida.getHour() > 22 || horaSalida.getHour() < 06;
    }
}