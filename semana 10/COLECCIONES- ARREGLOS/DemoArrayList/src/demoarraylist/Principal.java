
package demoarraylist;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
TEMA : ARRAYLiST
Realize un programa que ingrese a un arraylist los datos 
de los empleados de una empresa : codigo,sueldo basico,bonificacion,
descuento, se pide imprimir los datos de los empleados en pantalla 
utilizando Arraylist
*/
public class Principal {

  
    public static void main(String[] args) {
        
        
        String resp;
        
        ArrayList lista = new ArrayList();
        
        do{
            
            Empleado emp = new Empleado();
            
            emp.cod=JOptionPane.showInputDialog("Ingrese el Codigo");
            emp.sb=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el sueldo basico"));
            emp.bon=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la bonificacion"));
            emp.des=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el descuento"));
            
            emp.sn(emp.sb,emp.bon,emp.des);
            
            lista.add(emp);
            
            resp = JOptionPane.showInputDialog("DEsea continuar");
        
        }while(resp.compareTo("si")==0);
        
        for (int i = 0; i < lista.size(); i++) {
             
            Empleado emp = (Empleado)lista.get(i);
            
            JOptionPane.showMessageDialog(null, emp.cod+" "+emp.sb+" "+emp.bon+" "+emp.des+" "+emp.sn(emp.sb,emp.bon,emp.des)+" "+emp.toString());
        }
        
        System.out.println(lista);
       
    }
    
}
