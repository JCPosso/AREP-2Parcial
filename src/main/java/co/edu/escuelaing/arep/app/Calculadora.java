package co.edu.escuelaing.arep.app;
import java.lang.Math.*;

/**
 * @author  JCPosso
 * @version 1.0
 */
public class Calculadora {
    /**
     * Metodo que se encarga de calcular el logaritmo base diez(Logaritmo natural) de un número.
     * @param n numero natural
     * @return el calculo aplicado al número ingresado
     */
    public double ln(double n){
        return Math.log10(n);
    }
    /**
     * Metodo que se encarga de calcular el número de euler elevado a la potencia del parámetro
     * @param n numero natural
     * @return el calculo aplicado al número ingresado
     */
    public double exp(double n){
        return Math.exp(n);
    }
}