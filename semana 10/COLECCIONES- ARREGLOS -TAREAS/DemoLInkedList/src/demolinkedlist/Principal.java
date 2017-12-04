
package demolinkedlist;

import java.util.LinkedList;
import javax.swing.JOptionPane;

/*TEMA:COLECCIONES LINKEDLIST
REALIZAR EL PROGRAMA QUE ALMACENE LOS DATOS DE UN 
EMPLEADO: CODIGO, APELLIDOS Y NOMBRES, SUELDO BASICO,
BONIFICACION Y DESCUENTO, EN UNA ESTRUCTURA DE DATOS 
LINKEDLIST Y LUEGO MUESTRE UN REPORTE CON LOS DATOS 
DE ENTRADA QUE INCLUYA EL SUELDO NETO.

APLICAR HERENCIA A LOS EJERCICIOS DE ARRAYLIST Y LINKEDLIST SOBRE 
EMPLEADOS CONSIDERANDO QUE HAY DOS TIPOS DE EMPLEADO AUXILIARES Y TÉCNICO. 
(LOS TÉCNICOS TIENE UN INGRESE POR RIESGO DE VIDA).
 */

public class Principal {

   
    public static void main(String[] args) {
        
        int n,i;
       String te,cod,apnom;
       double sb,bon,des,rv;
       LinkedList lista=new LinkedList();
       n=Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de empleados "));
       
       te = JOptionPane.showInputDialog("Ingrese el tipo de empleado");
       
       for(i=0;i<n;i++)
       {
           
          if(te.compareTo("tecnico")==0){
          
          cod=JOptionPane.showInputDialog("Ingrese codigo ");
          apnom=JOptionPane.showInputDialog("Ingrese apellidos y nombre ");
          sb=Double.parseDouble(JOptionPane.showInputDialog("Ingrese sueldo basico"));
          bon=Double.parseDouble(JOptionPane.showInputDialog("Ingrese bonificacion"));
          des=Double.parseDouble(JOptionPane.showInputDialog("Ingrese descuento "));
          rv=Double.parseDouble(JOptionPane.showInputDialog("Ingrese riesgo de vida "));
          
          Tecnico tec=new Tecnico(rv, cod, apnom, sb, bon, des);
          
          tec.netot(sb,bon,des,rv);
          
          lista.add(tec);
          
          }else{
          
          cod=JOptionPane.showInputDialog("Ingrese codigo ");
          apnom=JOptionPane.showInputDialog("Ingrese apellidos y nombre ");
          sb=Double.parseDouble(JOptionPane.showInputDialog("Ingrese sueldo basico"));
          bon=Double.parseDouble(JOptionPane.showInputDialog("Ingrese bonificacion"));
          des=Double.parseDouble(JOptionPane.showInputDialog("Ingrese descuento "));
          
          Auxiliares aux=new Auxiliares(cod,apnom,sb,bon,des);
          aux.neto(sb,bon,des);
          
          lista.add(aux);
          
          }
           

       }
       System.out.println(lista); //imprime la lista de empleados
       System.out.println(lista.getFirst());//imprime el primer empleado
       System.out.println(lista.getLast());//imprime ultimo empleado
       System.out.println(lista.get(2));//imprime empleado en pos 2
       System.out.println(lista.removeLast());//elimina el ultimo empleado
       System.out.println(lista.indexOf("222 perez juan 3000.0 2000.0 1000.0 4000.0"));//añade 1 emp
       System.out.println(lista.contains("222 perez juan 3000 2000 1000 4000"));//verifica si el emp esta en lista
        
        
        
       
    }
    
}
