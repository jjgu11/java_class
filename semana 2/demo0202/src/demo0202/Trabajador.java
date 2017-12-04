
package demo0202;

import javax.swing.JOptionPane;


public class Trabajador {
    
    String nom,cod;
    double sb,bn,des;

    public Trabajador() {
        
        cod= JOptionPane.showInputDialog("Ingrese el Codigo");
        nom= JOptionPane.showInputDialog("Ingrese el Nombre");
        sb = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Sueldo Basico"));
        bn = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la Bonificacion"));
        des = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Descuento")); 
    }
    
    public double sneto(){
        return sb+bn-des;
    }
    
    
    
   
}
