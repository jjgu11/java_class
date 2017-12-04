
package demoao;

import javax.swing.JOptionPane;


public class Empleado {
    
    String nom,sex;
    int ht;
    double pxh;

    public Empleado() {
        
        nom = JOptionPane.showInputDialog("Ingrese el nombre del empleado");
        sex = JOptionPane.showInputDialog("Ingrese el sexo del empleado");
        ht = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas trabajadas"));
        pxh = Double.parseDouble(JOptionPane.showInputDialog("Ingrese pago por horas"));
       
    }
    
    
   double pago_neto(){
   
        return ht*pxh;
   
   }
      
    
}
