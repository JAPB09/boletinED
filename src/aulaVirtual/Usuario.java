package aulaVirtual;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa un usuario genérico en el aula virtual.
 * Puede ser un Alumno o un Profesor.
 * @author Javier Barceló
 * @version 0.1
 */
public class Usuario {
    protected String nombre;
    protected String email;
    private List<Asignatura> asignaturas;

    /**
     * Constructor de Usuario
     *
     * @param nombre Nombre del usuario
     * @param email Email del usuario
     */

    public Usuario(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
        this.asignaturas = new ArrayList<>();
    }

    /**
     * Lista de las asignaturas del usuario
     *
     * @return Devuelve la lista de la asignatura
     */

    public List<Asignatura> getAsignaturas() {
        return new ArrayList<>(asignaturas);
    }

    /**
     * Inscribe al usuario a la asignatura
     *
     * @param asignatura Asignatura a la que se va a inscribir el usuario
     */

    public void inscribirAsignatura(Asignatura asignatura) {
        asignaturas.add(asignatura);
    }

    /**
     * Da el nombre del usuario
     *
     * @return El nombre del usuario
     */

    public String getNombre() {
        return nombre;
    }

    /**
     * Da el email del usuario
     *
     * @return El email del usuario
     */

    public String getEmail() {
        return email;
    }

    /**
     * Inicia la sesion de la cuenta
     *
     * @param password Contraseña del usuario
     * @return Devuelve si se ha iniciado con exito o no la cuenta
     */

    public boolean iniciarSesión (String password) {
        // simula la consulta a la base de datos de las credenciales del usuario
        int hash = password.hashCode();
        return true;
    }
}