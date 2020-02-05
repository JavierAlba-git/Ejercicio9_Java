package ejercicio9_tema6_excepciones_java;
/**
 * Clase Alumno
 * @author Javi
 */
public class Alumno {
    private String nalumno;
    
    /**
     * Constructor por defecto de la clase Alumno, donde el nombre de alumno 
     * se inicializará vació por defecto.
     */
    public Alumno() 
    {
        nalumno="";
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
