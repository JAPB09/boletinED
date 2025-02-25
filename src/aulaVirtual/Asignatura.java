package aulaVirtual;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa una asignatura en el aula virtual.
 * Una asignatura tiene un nombre y un profesor encargado.
 */
public class Asignatura {
    private String nombre;
    private Profesor profesor;
    private List<Alumno> alumnos;

    /**
     * Constructor de asignatura
     *
     * @param nombre Nombre de la asignatura
     */

    public Asignatura(String nombre) {
        this.nombre = nombre;
        this.profesor = null;
        this.alumnos = new ArrayList<>();
    }
//Pequeño cambio en el código

    /**
     * Muestra el nombre de la asignatura
     *
     * @return Devuelve el nombre de la asignatura
     */

    public String getNombre() {
        return nombre;
    }

    /**
     * Muestra el profesor que tiene la asignatura
     *
     * @return Devuelve el profesor que tiene la asignatura
     */

    public Profesor getProfesor() {
        return profesor;
    }

    /**
     * Añade un alumno a la asignatura
     *
     * @param alumno El alumno que se añade
     */

    public void agreagarAlumno(Alumno alumno) {
        alumnos.add(alumno);
    }

    /**
     * Elimina un alumno de la asignatura
     *
     * @param alumno El alumno que se va a eliminar de la asignatura
     */

    public void eliminarAlumno(Alumno alumno) {
        for (Alumno a : this.alumnos) {
            if (a.getNombre().equals(alumno.nombre)) alumnos.remove(a);
        }
    }

    /**
     * Muestra los datos de los alumnos que hay inscritos en la asignatura
     *
     * @return Devuelve los alumnos que hay en la asignatura o si no hay ninguno inscrito
     */

    public String getDatosAlumnos() {
        if (alumnos.isEmpty()) {
            return "No hay alumnos en la lista";
        } else {
            for (Alumno alumno : alumnos) {
                return "Nombre: " + alumno.getNombre() +", Email: "+alumno.getEmail()
                        +"Asignaturas: " +alumno.getAsignaturas();
            }
            return "";
        }
    }
}
