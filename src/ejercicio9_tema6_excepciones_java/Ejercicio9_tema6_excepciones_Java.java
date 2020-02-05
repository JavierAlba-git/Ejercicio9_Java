package ejercicio9_tema6_excepciones_java;

import java.util.Scanner;

/**
 * Clase Main del programa
 * @author Javi
 */
public class Ejercicio9_tema6_excepciones_Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        Alumno alumno=new Alumno();
        
        String nombre;
        System.out.print("Dame el nombre del alumno: ");
        nombre=teclado.nextLine();
        alumno.setNalumno(nombre);
        
        try
        {
            alumno.pedirNotas();
            try
            {
                try
                {
                    alumno.modificarNota(0, 0);
                    alumno.imprimirCalificaciones();
                }
                catch(RangoException error)
                {
                    System.out.println(error.getMessage());
                }                
            }
            catch(IndexOutOfBoundsException error)
            {
            System.out.println("Error, posición no válida("+error.getMessage()+").");
            }         
        }
        catch(RangoException error)
        {
            System.out.println(error.getMessage());
        }       
    }
    
}
