package aulaVirtual;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProfesorTest {

    private Profesor profesor;
    private Alumno alumno;
    private Asignatura leng;
    private Asignatura ef;

    @Before
    public void setUp() {
        profesor = new Profesor("Johan", "correoprofesor@notanreal");
        alumno = new Alumno("Ismael", "correoalumno@100%realnofake");
        leng = new Asignatura("Lengua");
        ef = new Asignatura("Educación Física");

        //Inscribimos al profesor a la asignatura
        profesor.inscribirAsignatura(ef);

        //Inscribimos al alumno y le asignamos una nota
        alumno.inscribirAsignatura(ef);
    }

    @Test
    public void profImpate(){
        boolean resultado = profesor.calificarAlumno(alumno, ef, 9);
    }

    @Test
    public void profNoImpate(){
        boolean resultado = profesor.calificarAlumno(alumno, leng, 7);
    }

}