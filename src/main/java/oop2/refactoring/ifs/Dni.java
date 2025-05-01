package oop2.refactoring.ifs;

// Quick Fixes:
// "Invert if condition"
// "Remove redundant else"
//public class Dni {
//    private String numeroDni;
//
//    public Dni(String dni) {
//        if (dni != null) {
//            if (!dni.isEmpty()) {
//                if (tieneLargoCorrecto(dni)) {
//                    if (todosNumeros(dni)) {
//                        this.numeroDni = dni;
//                    } else {
//                        throw new RuntimeException("Debe ingresar números solamente");
//                    }
//                } else {
//                    throw new RuntimeException("El largo del dni no puede ser menor a 3 ni mayor a 10");
//                }
//            } else {
//                throw new RuntimeException("Dni no puede ser vacío");
//            }
//        } else {
//            throw new RuntimeException("Dni no puede ser nulo");
//        }
//    }
//
//    private boolean tieneLargoCorrecto(String dni) {
//        return false;
//    }
//
//    private boolean todosNumeros(String dni) {
//        return true;
//    }
//}

//Despues de refactorizar con invert if, remove redundant else, y extract method
public class Dni {
    private String numeroDni;

    public Dni(String dni) {
        checkDniIsNotNull(dni);
        checkDniIsNotEmpty(dni);
        checkDniLarge(dni);
        checkNumbers(dni);
        this.numeroDni = dni;
    }

    private void checkNumbers(String dni) {
        if (!todosNumeros(dni)) {
            throw new RuntimeException("Debe ingresar números solamente");
        }
    }

    private void checkDniLarge(String dni) {
        if (!tieneLargoCorrecto(dni)) {
            throw new RuntimeException("El largo del dni no puede ser menor a 3 ni mayor a 10");
        }
    }

    private static void checkDniIsNotEmpty(String dni) {
        if (dni.isEmpty()) {
            throw new RuntimeException("Dni no puede ser vacío");
        }
    }

    private static void checkDniIsNotNull(String dni) {
        if (dni == null) {
            throw new RuntimeException("Dni no puede ser nulo");
        }
    }

    private boolean tieneLargoCorrecto(String dni) {
        return false;
    }

    private boolean todosNumeros(String dni) {
        return true;
    }
}