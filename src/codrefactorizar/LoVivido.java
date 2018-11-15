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


nombre = JOptionPane.showInputDialog ("Escriba su nombre: ");
edad = JOptionPane.showInputDialog ("Escriba su edad: ");
 
anos = Integer.parseInt (edad);
 
meses = (anos*12);
dias = (anos*365);
horas = (dias*24);
 
 JOptionPane.showMessageDialog(null,  "Meses: "  +meses,"Numero de meses vividos de " +nombre,JOptionPane.INFORMATION_MESSAGE);


 JOptionPane.showMessageDialog(null, "Días: " +dias,"Numero de días vividos de "+nombre,JOptionPane.INFORMATION_MESSAGE);


 JOptionPane.showMessageDialog(null, "Horas: " +horas,"Numero de horas vividos de "+nombre,JOptionPane.INFORMATION_MESSAGE);

   System.exit (0);

}
      
}
