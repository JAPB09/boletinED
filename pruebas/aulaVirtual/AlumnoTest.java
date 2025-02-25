package aulaVirtual;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AlumnoTest {

    private Alumno alumno;
    private Asignatura mate;
    private Asignatura ingles;

    @Before
    public void setUp() {

        //Creamos los objetos
        alumno = new Alumno("Ismael", "correoalumno@100%realnofake");
        mate = new Asignatura("Matemáticas");
        ingles = new Asignatura("Inglés");

       //Inscribimos al alumno y le asignamos una nota
        alumno.inscribirAsignatura(mate);
        alumno.asignarNota(mate, 10);

    }
    @Test
    public void testObtenerNota(){
        int nota = alumno.obtenerNota(mate);
        assertEquals(10, nota);
    }

    @Test
    public void testObtenerNotaNoCursada(){
        int nota = alumno.obtenerNota(ingles);
        assertEquals(-1, nota);
    }
}