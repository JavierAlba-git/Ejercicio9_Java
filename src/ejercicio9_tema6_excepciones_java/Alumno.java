
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
    /**
     * Método en el cúal seleccionaremos una posición del array de notas, y si
     * está es una posición válida, podremos modificar la nota del alumno 
     * siempre y cuando esta esté dentro del intervalo (0,10).
     * @param posicion variable int que representa a la posición del array que 
     *        estamos buscando. 
     * @param nnota variable double que representa la nota que vamos a 
     *        introducir en el array
     * @throws RangoException
     * @throws Exception 
     */
    public void modificarNota(int posicion, double nnota)
    throws RangoException, Exception
    {
        Scanner teclado=new Scanner(System.in);
        System.out.print("Dame la posición: ");
        posicion=teclado.nextInt();
        notas.get(posicion);
        System.out.print("Dame la nota del alumno: ");
        nnota=teclado.nextDouble();
        if(nnota<0 || nnota>10)
        {
            throw new RangoException("Error. Nota no válida");
        }
        else
        {
            notas.set(posicion, nnota);
        }   
    }
    /**
     * Método que imprimirá por pantalla tanto el nombre del alumno como todas
     * sus notas.
     */
    public void imprimirCalificaciones()
    {
        int cont=1;
        System.out.println("Alumno: "+nalumno);
        for (int i = 0; i < notas.size(); i++) 
        {
            System.out.println("Nota "+cont+": "+notas.get(i));
            cont++;
        }
    }
    
    
    
    
    
    
}
