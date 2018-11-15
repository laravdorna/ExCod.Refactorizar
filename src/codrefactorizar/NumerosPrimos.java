package codrefactorizar;

/**
 *
 * @author Lara Vázquez Dorna
 *
 */
public class NumerosPrimos {

    /**
     * @param args the command line arguments
     */
    //Codificado por: sAfOrAs
    //LIstar los numeros según el numero de digitos indicado
    //Considero solo hasta numeros menores a 100000 (5 digitos), 
    //por el hecho de k buscar numeros primos a partir de 6 digitos, el proceso se hace muy lento.
    public static boolean primo = false;//inicializa la bandera primo a falso

    public static void main(String arg[]) {
        //atributos
        int numDigitos = 0;
        int nDigitos = 0;// la segunda palabra se inicia con mayusculas para mejor lectura

        numDigitos = Integer.parseInt(arg[0]);

        //comprueba que el numero de difitos dado sea mayor que 0
        if (numDigitos <= 0) {
            System.out.println("Ingrese como parámetro, un numero de digitos correcto (mayor que 0): ");
        }

        for (int iteracion = 1; iteracion <= 99999; iteracion++) {
            int divisionEntera = iteracion;
            int contador = 0;

            while (divisionEntera != 0) {
                divisionEntera = divisionEntera / 10;
                contador++;
            }
            nDigitos = contador;

            if (nDigitos == numDigitos) {
                if (iteracion < 4) {
                    primo = true;
                } else {
                    if (iteracion % 2 == 0) {
                        primo = false;
                    } else {
                        int contador1 = 0;
                        int iteracionUno = 1;
                        int limite = (iteracion - 1) / 2;
                        if (limite % 2 == 0) {
                            limite--;
                        }

                        while (iteracionUno <= limite) {
                            if (iteracion % iteracionUno == 0) {
                                contador1++;
                            }
                            iteracionUno += 2;
                            if (contador1 == 2) {
                                iteracionUno = limite + 1;
                            }
                        }

                        if (contador1 == 1) {
                            primo = true;
                        }
                    }
                }

                if (primo == true) {
                    System.out.println(iteracion);
                }
            }
        }
    }
}
