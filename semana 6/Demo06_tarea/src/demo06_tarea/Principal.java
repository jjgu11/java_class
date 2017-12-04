

/*
Realizar un programa que ingrese los datos de n empleados de una empresa: codigo del empleado
apellidos y nombres, sexo, estado civil, categoria (puede ser auxiliar, tecnico o profesional),
sueldo basico, bonificacion, descuento, repeticion de quinta categoria(solo para profesional),
bonificacion especial (solo para tecnicos), bonificacion por riesgo de vida (solo para tecnicos). 
Se pide imprimir un reporte con los datos de entrada
que incluya el sueldo neto de cada trabajador y al pie del reporte se debe imprimir el total 
de sueldos netos por categoria

Aplique sobrecarga de metodos
*/

package demo06_tarea;

import javax.swing.JOptionPane;


public class Principal {

    public static void main(String[] args) {
        
        int n,i;
        String cod,apnom,sex,est_civil,cat;
        double sb, bon, des, rep_qc, bon_esp, bon_rsg;
        double acuau,acupro,acutec;
        
        n= Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de Empleados"));
        
        for ( i = 1; i <=n; i++) {
            
            cod = JOptionPane.showInputDialog("Ingrese el codigo del alumnos");
            apnom = JOptionPane.showInputDialog("Ingrese el nombre del Empleado");
            sex = JOptionPane.showInputDialog("Ingrese el sexo del Empleado");
            est_civil = JOptionPane.showInputDialog("Ingrese es estado civil del Empleado");
            cat = JOptionPane.showInputDialog("Ingrese la categoria del Empleado");
            
            sb = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la Sueldo Basico del Empleado"));
            bon = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la Bonificacion del Empleado"));
            des = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Descuento del Empleado"));
            
            
            
            if(cat.compareTo("Auxiliar")==0){
                
                Empleado au = new Empleado(cod, apnom, sex, est_civil, cat, sb, bon, des);
                System.out.println("El Sueldo Neto del Empleado Auxiliar es  "+ au.sn(sb, bon, des));
                
                     
            }else if(cat.compareTo("profesional")==0){
                
                rep_qc = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la Repeticion de la Quinta Categoria"));
                Empleado pro = new Empleado(cod, apnom, sex, est_civil, cat, sb, bon, des, rep_qc);
                System.out.println("El Sueldo Neto del Empleado Profesional es:" + pro.sn(sb, bon, des, rep_qc));
                
        
            }else{
                
                 bon_esp = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la Bonificacion de especfial"));
                 bon_rsg = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la Bonificacion por Riesgo de vida"));
                 Empleado tec = new Empleado(cod, apnom, sex, est_civil, cat, sb, bon, des, bon_esp, bon_rsg);
                 System.out.println("El Sueldo Neto del Empleado Tecnico es:"+tec.sn(sb, bon, des, bon_esp, bon_rsg));
               

            }
            
            /*falta aplicar el total de sueldo neto por categoria */

        }
        
      
    }
    
}
