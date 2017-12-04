
package demoarraylist;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
TEMA : ARRAYLiST
Realize un programa que ingrese a un arraylist los datos 
de los empleados de una empresa : codigo,sueldo basico,bonificacion,
descuento, se pide imprimir los datos de los empleados en pantalla 
utilizando Arraylist

APLICAR HERENCIA A LOS EJERCICIOS DE ARRAYLIST Y LINKEDLIST SOBRE 
EMPLEADOS CONSIDERANDO QUE HAY DOS TIPOS DE EMPLEADO AUXILIARES Y TÉCNICO. 
(LOS TÉCNICOS TIENE UN INGRESE POR RIESGO DE VIDA).
*/
public class Principal {

  
    public static void main(String[] args) {
        
        
        String resp,te;
        
        ArrayList lista = new ArrayList();
        
        te = JOptionPane.showInputDialog("Ingrese el tipo de empleado");
        
        do{
            
            if(te.compareTo("tecnico")==0){
            
            Tecnicos tec = new Tecnicos();
            
            tec.cod=JOptionPane.showInputDialog("Ingrese el Codigo");
            tec.sb=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el sueldo basico"));
            tec.bon=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la bonificacion"));
            tec.des=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el descuento"));
            tec.rv=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el riego de vida"));
            
            tec.snt();
            
            lista.add(tec);
            
            resp = JOptionPane.showInputDialog("DEsea continuar");
            
            }else{
             
            Auxiliares aux = new Auxiliares();
            
            aux.cod=JOptionPane.showInputDialog("Ingrese el Codigo");
            aux.sb=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el sueldo basico"));
            aux.bon=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la bonificacion"));
            aux.des=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el descuento"));
            
            aux.sn(aux.sb,aux.bon,aux.des);
            
            lista.add(aux);
            
            resp = JOptionPane.showInputDialog("DEsea continuar");
            
            }
        
        }while(resp.compareTo("si")==0);
        
        for (int i = 0; i < lista.size(); i++) {
            
            
            if(te.compareTo("tecnico")==0){
            
             Tecnicos tec = (Tecnicos)lista.get(i);
            
            JOptionPane.showMessageDialog(null, tec.cod+" "+tec.sb+" "+tec.bon+" "+tec.des+" "+tec.rv+""+tec.snt()+" "+tec.toString());
       
            }else{
            
            Auxiliares aux = (Auxiliares)lista.get(i);
            
            JOptionPane.showMessageDialog(null, aux.cod+" "+aux.sb+" "+aux.bon+" "+aux.des+" "+aux.sn(aux.sb,aux.bon,aux.des)+" ");
       
            
            }
             
        }
        
        System.out.println(lista);
       
    }
    
}
