package aulaVirtual;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Representa a un alumno del aula virtual.
 * Un alumno puede estar inscrito en varias asignaturas.
 */
public class Alumno extends Usuario {

    private Map<Asignatura, Integer> notas;

    /**
     * Constructor de alumno
     *
     * @param nombre Nombre del alumno
     * @param email Email del alumno
     */

    public Alumno(String nombre, String email) {
        super(nombre, email);
        this.notas = new HashMap<>();
    }

    /**
     * Mapa de las asignaturas y notas del alumno
     *
     * @return Mapa de las asignaturas y notas
     */

    public Map<Asignatura, Integer> getNotas() {
        return new HashMap<>(notas);
    }

    /**
     * Asigna una nota a una asignatura
     *
     * @param asignatura asignatura sobre la que se va a aplicar la nota
     * @param nota nota que se va a aplicar a la asignatura
     */

    protected void asignarNota(Asignatura asignatura, int nota) {
        if (getAsignaturas().contains(asignatura)) {
            notas.put(asignatura, nota);
        } else {
            System.out.println("El alumno no está inscrito en esta asignatura.");
        }
    }

    /**
     * Muestra las notas del alumno
     */

    public void mostrarNotas() {
        System.out.println("Notas del alumno " + nombre + ":");
        for (Map.Entry<Asignatura, Integer> entry : notas.entrySet()) {
            System.out.println(entry.getKey().getNombre() + ": " + entry.getValue());
        }
    }

    /**
     * Muestra la nota de una asignatura concreta
     *
     * @param asignatura asignatura de la que se va a mostrar la nota
     * @return La nota del alumno
     */

    public int obtenerNota(Asignatura asignatura) {
        return notas.getOrDefault(asignatura, -1);
    }

}