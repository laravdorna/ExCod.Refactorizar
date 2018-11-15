/*
 * 
 */
package codrefactorizar;

/**
 *
 * @author Lara Vázquez Dorna
 */
public class Factorial {

    public static void main(String[] args) {
        //Atributos
        int numero=8; // j = 8; se puede inicializar cuando se crea el atributo
        int factorial;
        int iteracion;
        
        //crea un bucle
        if (numero == 0) {
            factorial = 1;
        } else {
            factorial = 1;
            for (iteracion = numero; iteracion >= 1; iteracion--) {
                factorial = factorial * iteracion;
            }
        }
        //imprime por pantalla el factorial
        System.out.println(factorial);

    }

}
