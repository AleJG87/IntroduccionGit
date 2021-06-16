package Alumnos;

/**
 * Clase Alumno
 *
 * @author
 * @version 16.06.2021
 */


public class Alumno {
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private int anioNacimento;



    public int getAnioNacimento() {
        return anioNacimento;
    }

    public void setAnioNacimento(int anioNacimento) {
        this.anioNacimento = anioNacimento;
    }

    /**
     * Metodo para obtener la edad del alumno
     *
     * @param anioActual año actual
     * @return edad del alumno
     */

    public int calcularEdad(int anioActual){
        return anioActual;
    }
}
