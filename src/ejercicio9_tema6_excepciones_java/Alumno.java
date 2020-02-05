
package ejercicio9_tema6_excepciones_java;

import java.util.ArrayList;

/**
 * Clase Alumno
 * @author Javi
 */
public class Alumno {
    private String nalumno;
    private ArrayList<Double> notas;
    public static int n_asignaturas=5;
    /**
     * Constructor por defecto de la clase Alumno
     */
    public Alumno() 
    {
        nalumno="";
        notas=new ArrayList<>();
        n_asignaturas=5;
    }
    /**
     * Constructor por parámetros de la clase Alumno
     * @param nalumno variable String que representa al nombre del alumno
     */
    public Alumno(String nalumno) 
    {
        this.nalumno = nalumno;
    }
    
    
    
    
    
}
