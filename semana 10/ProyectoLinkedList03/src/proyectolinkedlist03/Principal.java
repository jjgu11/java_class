/*TEMA:COLECCIONES LINKEDLIST
REALIZAR EL PROGRAMA QUE ALMACENE LOS DATOS DE UN 
EMPLEADO: CODIGO, APELLIDOS Y NOMBRES, SUELDO BASICO,
BONIFICACION Y DESCUENTO, EN UNA ESTRUCTURA DE DATOS 
LINKEDLIST Y LUEGO MUESTRE UN REPORTE CON LOS DATOS 
DE ENTRADA QUE INCLUYA EL SUELDO NETO.
 */
package proyectolinkedlist03;
import java.util.LinkedList;
import javax.swing.JOptionPane;
public class Principal 
{
    public static void main(String[] args) 
    {
       int n,i;
       String cod,apnom;
       double sb,bon,des;
       LinkedList lista=new LinkedList();
       n=Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de empleados "));
       for(i=0;i<n;i++)
       {
          cod=JOptionPane.showInputDialog("Ingrese codigo ");
          apnom=JOptionPane.showInputDialog("Ingrese apellidos y nombre ");
          sb=Double.parseDouble(JOptionPane.showInputDialog("Ingrese sueldo basico"));
          bon=Double.parseDouble(JOptionPane.showInputDialog("Ingrese bonificacion"));
          des=Double.parseDouble(JOptionPane.showInputDialog("Ingrese descuento "));
          Empleado emp=new Empleado(cod,apnom,sb,bon,des);
          emp.neto(sb,bon,des);
          lista.add(emp);
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
