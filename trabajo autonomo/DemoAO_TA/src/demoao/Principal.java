
package demoao;

import javax.swing.JOptionPane;


/*
Realizar un programa mediante un arreglo de objetos se ingrese
Los datos de un empleado nombre, sexo, distrito, horas trabajadas, pago por hora
 donde puede ser por contratado en planilla o por recibos por honorarios  
Bonificación (solo para planilla), descuento por seguro (solo para planilla) 
y mostrar un reporte detallado con dichos datos
*/

public class Principal {

   
    public static void main(String[] args) {
        
        
        int n;
        String tipo;
        
        n=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de Empleados"));
        tipo=JOptionPane.showInputDialog("Ingrese el tipo de Empleado");
        
            if(tipo.compareTo("planilla")==0){
                
                Eplanilla ep[] = new Eplanilla[n];

                for (int i = 0; i < n; i++) {

                ep[i] = new Eplanilla();         
            
                }  

                reporte1 (ep,n);
                  
            
            }else{
            
                 Ehonorarios eh[] = new Ehonorarios[n];

                for (int i = 0; i < n; i++) {

                eh[i] = new Ehonorarios();         
            
                }  

                reporte2 (eh,n);
            
            
            }
        
        
      
    }
    
    
    static void reporte1(Eplanilla xep[],int xn){
   
        
        System.out.println("REPORTE DE EMPLEADOS EN PLANILLA");
        System.out.println("---------------------------------------------------------");
        System.out.println("NOMBRE       SEXO        HORATRAS BAJADAS    PAGO POR HORA   BONIFICACION    DESC");
        System.out.println("---------------------------------------------------------");
        
        for (int i = 0; i < xn; i++) {
              
                System.out.println(xep[i].nom+"        "+xep[i].sex+"            "+xep[i].ht+"          "+xep[i].pxh+"           "+xep[i].bon+"        "+xep[i].des+"   ");

            
        }/*fin for*/
        
        
        System.out.println("---------------------------------------------------------");
        
    }
    
    
    
    static void reporte2(Ehonorarios xeh[],int xn){
 
        
        System.out.println("REPORTE DE EMPLEADOS HONORARIOS");
        System.out.println("---------------------------------------------------------");
        System.out.println("NOMBRE       SEXO        HORATRAS BAJADAS    PAGO POR HORA  ");
        System.out.println("---------------------------------------------------------");
        
        
        for (int i = 0; i < xn; i++) {
                

                System.out.println(xeh[i].nom+"        "+xeh[i].sex+"             "+xeh[i].ht+"              "+xeh[i].pxh+"  ");
   
        }
        
        System.out.println("---------------------------------------------------------");

        
    }
    
}
