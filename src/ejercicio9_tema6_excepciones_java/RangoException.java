package ejercicio9_tema6_excepciones_java;
/**
 * Clase RangoException que extiende a Exception
 * @author Javi
 */
public class RangoException extends Exception{
    /**
     * 
     * @param mensaje variable String que representa al error.
     */
    public RangoException(String mensaje) {
        super(mensaje);
    }
    
}
