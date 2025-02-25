package aulaVirtual;

/**
 * Representa a un profesor del aula virtual.
 * Un profesor puede impartir varias asignaturas.
 */
public class Profesor extends Usuario {

    /**
     * Constructor de profesor
     *
     * @param nombre Nombre del profesor
     * @param email Email del profesor
     */

    public Profesor(String nombre, String email) {
        super(nombre, email);
    }

    /**
     *Calificar a un alumno de una asignatura
     *
     * @param alumno Alumno a calificar
     * @param asignatura Asignatura que se califica
     * @param nota Nota a aasignar
     * @return Dirá si la operación a sido exitosa o no
     */

    public boolean calificarAlumno(Alumno alumno, Asignatura asignatura, int nota) {
        if (getAsignaturas().contains(asignatura)) {
            alumno.asignarNota(asignatura, nota);
            System.out.println("Nota asignada a " + alumno.getNombre() + " en " + asignatura.getNombre() + ": " + nota);
            return true;
        } else {
            System.out.println("El profesor no imparte esta asignatura.");
            return false;
        }
    }
}
