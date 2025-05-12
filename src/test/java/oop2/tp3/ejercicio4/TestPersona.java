package oop2.tp3.ejercicio4;

import org.jdbi.v3.core.Jdbi;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestPersona {
    @Test
    public void test1(){

        Jdbi jdbi = Jdbi.create("jdbc:hsqldb:mem;create=true");

        new SetUpDatabase(jdbi).setUp();

        var repo = new PersonaRepository(jdbi);

        var personas = repo.buscarPorNombre("V");

        var optionalPersona = repo.buscarId(1L);

        assertEquals("Optional[[Persona: nombre= Vladimir', apellido= Varkov']]", personas.toString());
        assertEquals("Optional[Persona: nombre= José', apellido= Laurenti']", optionalPersona.toString());

    }


}