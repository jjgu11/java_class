
package demo0202;

import javax.swing.JOptionPane;

/**
 * Diseñar un programa que ingrese los datos de los trabajadores:
 * codigo, apellidos y nombres, sueldo basico, bonificacion y descuento.
 * se pide calcular e imprimir el sueldo neto de cada trabajador
 * aplique clases ojetos y metodos.
 * 
 * 
 * 
 * NOTA : ******SIN PARAMETROS EN EL CONSTRUCTOR******
 */

public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        String nom,cod;
        int n,i;
        double tsn=0;
        
         n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cuantos trabajadores hay"));
         
          for(i=1; i<=n; i++){
              
              Trabajador trab = new Trabajador();             
              System.out.println("El sueldo neto del trabajador :"+trab.nom +" es "+ trab.sneto());             
              
              /*creamos un acumulador para almacenar cada sueldo neto*/
              tsn = tsn+trab.sneto();     
        }
          
         System.out.println("El total del sueldo neto es:  "+ tsn);  
        
    }
    
}
