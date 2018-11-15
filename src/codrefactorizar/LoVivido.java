/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codrefactorizar;

import javax.swing.JOptionPane;

/**
 *
 * @author Lara Vázquez Dorna
 */
public class LoVivido {

    public static void main(String[] args) {
        //ATRIBUTOS_ cambio los nombres de los atributos por otros que se entienda su utilidad en el codigo
        String nombre;
        String edad;
        int anos;
        int meses;
        int dias;
        int horas;

        //Pide por panel el nombre y la edad 
        nombre = JOptionPane.showInputDialog("Escriba su nombre: ");
        edad = JOptionPane.showInputDialog("Escriba su edad: ");
        //Parsea la edad en años para comprobar que escriban un numero
        anos = Integer.parseInt(edad);

        //Calcula la edad en los distintos atributos
        meses = (anos * 12);
        dias = (meses * 365);
        horas = (dias * 24);

        //Muestra por panel los resultados
        JOptionPane.showMessageDialog(null, "Meses: " + meses, "Numero de meses vividos de " + nombre, JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Días: " + dias, "Numero de días vividos de " + nombre, JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Horas: " + horas, "Numero de horas vividos de " + nombre, JOptionPane.INFORMATION_MESSAGE);

        //Sale del programa
        System.exit(0);

    }

}
