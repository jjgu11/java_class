
package demoao;

import javax.swing.JOptionPane;


public class Eplanilla extends Empleado {
    
    double bon,des;

    public Eplanilla() {
        
        bon = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la bonificacion"));
        des = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el el desccuento"));
        
        
    }
    
    double pago_planilla(){
    
        return ht*pxh+bon-des;
    }
    
    
    
    
    
    
    
    
}
