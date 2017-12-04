
package tarea0203;

import javax.swing.JOptionPane;

public class Articulos {
    
    
    String cod,des,tipo;
    int pre_uni;
    int cant,stock;

    public Articulos() {
        
        tipo = JOptionPane.showInputDialog("Ingrese el nom bre del Articulo ");
        cod = JOptionPane.showInputDialog("Ingrese el codigo del Articulo ");
        des = JOptionPane.showInputDialog("Ingrese la descripcion del Articulo");

        pre_uni = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio unitario"));
        cant = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad"));
        stock =Integer.parseInt(JOptionPane.showInputDialog("Ingrese el stock minimo"));
    }
    
    /*Calculando el Importe*/
    public double importe()
    {
        return cant*pre_uni;
    }
    
    
    
    
}
