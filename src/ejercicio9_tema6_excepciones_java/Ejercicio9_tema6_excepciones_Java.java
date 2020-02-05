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
    public static void main(String[] args){
        Scanner teclado=new Scanner(System.in);
        Alumno alumno=new Alumno();
        
        String nombre;
        System.out.print("Dame el nombre del alumno: ");
        nombre=teclado.nextLine();
        alumno.setNalumno(nombre);
        
        try
        {
            alumno.pedirNotas();
        }
        catch(RangoException error)
        {
            System.out.println(error.getMessage());
        }
        
        try
        {
            try
            {
                alumno.modificarNota(0, 0);
            }
            catch(RangoException error)
            {
                System.out.println(error.getMessage());
            }
        
        }
        catch(Exception error)
        {
            System.out.println(error.toString());
        }
        
        alumno.imprimirCalificaciones(); 
    }
    
}
