
package demoarregloobject;

import javax.swing.JOptionPane;

public class Articulo {
    
    String cod,desc,tipo;
    int cant;
    double pu;

    public Articulo() {
        
        cod = JOptionPane.showInputDialog("Ingrese el codigo");
        desc = JOptionPane.showInputDialog("Ingrese la descripcion");
        tipo = JOptionPane.showInputDialog("Ingrese el tipo");
        pu = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio Unitario"));
        cant = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad"));
        
    }
    

    double importe(){
    
        return pu*cant;
    }
    
}
