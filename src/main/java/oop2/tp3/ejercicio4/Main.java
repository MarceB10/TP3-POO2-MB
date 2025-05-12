package oop2.tp3.ejercicio4;

import org.jdbi.v3.core.Jdbi;

public class Main {

    public static void main(String[] args) {

        Jdbi jdbi = Jdbi.create("jdbc:hsqldb:mem;create=true");

        new SetUpDatabase(jdbi).setUp();

        var repo = new PersonaRepository(jdbi);
//        var personas = repo.buscarPorNombre("Vla");
        var personas = repo.buscarPorNombre("V");
//
//        for (Persona persona : personas) {
//            persona.toString();
//        }

        personas.ifPresent(personas1 -> System.out.println(personas1.toString()));

        var optionalPersona = repo.buscarId(1L);
        optionalPersona.ifPresent(
                persona -> System.out.println(persona.toString()));

    }
}
