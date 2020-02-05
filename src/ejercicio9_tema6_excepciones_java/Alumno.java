
package ejercicio9_tema6_excepciones_java;

import java.util.ArrayList;
import java.util.Scanner;

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
    /**
     * Método get de nalumno
     * @return nalumno, con el nombre asignado
     */
    public String getNalumno() 
    {
        return nalumno;
    }
    /**
     * Método set de nalumno
     * @param nalumno variable String que representa al nombre del alumno
     */
    public void setNalumno(String nalumno) 
    {
        this.nalumno = nalumno;
    }
    /**
     * Método en el que se nos pedirán por teclado las notas del alumno, si 
     * la nota del alumno se sale del intervalo(0,10), aparecerá un error y el 
     * programa se detendrá.
     * @throws RangoException 
     */
    public void pedirNotas() throws RangoException
    {
        Scanner teclado=new Scanner(System.in);
        double nota;
        try
        {
            for (int i = 0; i < n_asignaturas; i++) 
            {
                System.out.print("Dame la nota del alumno: ");
                nota=teclado.nextDouble();
                if(nota<0 || nota>10)
                {
                    throw new RangoException("Error. Nota no válida");
                }
                else
                {
                    notas.add(nota);
                }
            }
        }
        catch(RangoException error)
        {
            System.out.println(error.getMessage());
        }
    }
    
    
    
    
    
    
}
