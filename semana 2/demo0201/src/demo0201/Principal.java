
package demo0201;

import javax.swing.JOptionPane;

/**
 * Diseñar un programa que ingrese los datos de los trabajadores:
 * codigo, apellidos y nombres, sueldo basico, bonificacion y descuento.
 * se pide calcular e imprimir el sueldo neto de cada trabajador
 * aplique clases ojetos y metodos.
 * 
 * 
 *  NOTA : ******CON PARAMETROS EN EL CONSTRUCTOR******
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int n,i;
        String cod,nom;
        double sb,bn,des,tsn=0;
        
        n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cuantos trabajadores hay"));
        
        for(i=1; i<=n; i++){
           
              cod= JOptionPane.showInputDialog("Ingrese el codigo");
              nom= JOptionPane.showInputDialog("Ingrese el Nombre");
              sb = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Sueldo Basico"));
              bn = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la Bonificacion"));
              des = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Descuento")); 
              
              Trabajador trab = new Trabajador(cod,nom,sb,bn,des);
              
              System.out.println("El sueldo neto del trabajador :"+nom +" es "+ trab.sneto());
              
              /*creamos un acumulador para almacenar cada sueldo neto*/
              tsn = tsn+trab.sneto();
        }
        
        System.out.println("El total del sueldo neto es:  "+ tsn);
        
       
          
    
  }  
    
}
