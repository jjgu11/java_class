
package demo0401;

/*Realizar un programa que ingrese  los datos de n empleados de una empresa: código, apellidos y nombres,
categoría (puede ser técnico o profesional), sueldo básico, bonificación, descuento, bonificación especial 
(solo para profesionales) 
y pago por riesgo de vida (solo para tecnicos).Se pide calcular e imprimir el sueldo neto de cada trabajador*/

/*Modificar el programa tal que forma que se implemente la categoria auxiliar con una bonificacion famuiliar 
del 15% de su sueldo basico. Ademas se debera imprimir:

a) Reporte de Todos los empleados con todo sus datos;
b) Total de sueldo netos por categorias
C) El sueldo mas alto por categoria







insertar codigo toString(): en la clase padre para sacar reporte

*/


import javax.swing.JOptionPane;


public class Demo0401 {


    public static void main(String[] args) {
        
        int n,i;
        String cat;
        
        n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de Empleado"));
        
        for ( i = 1; i <= n; i++) {
            
            cat = JOptionPane.showInputDialog("Ingrese la Categoria");
            
            if(cat.compareTo("Tecnico")==0){
                
                /*Clase hija que implemento la clase abstracta de la superclase*/
                Tecnico t = new Tecnico();
                
                t.setCod(JOptionPane.showInputDialog("Ingrese su Codigo"));
                t.setNom(JOptionPane.showInputDialog("Ingrese su Nombre"));
                t.setCat(cat);
                
                t.setSb(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Sueldo Basico")));
                t.setB(Double.parseDouble(JOptionPane.showInputDialog("Ingrese la Bonificacion")));
                t.setDes(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Descuento")));
                
                t.setRv(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Riesgo de Vida")));
                
                
                /*metodo implementado de la superclase*/
                System.out.println("El sueldo neto es : " + t.sn());
                
                
            
            }else{
                
                /*Clase hija que implemento la clase abstracta de la superclase*/
                Profesional p = new Profesional();
                
                p.setCod(JOptionPane.showInputDialog("Ingrese su Codigo"));
                p.setNom(JOptionPane.showInputDialog("Ingrese su Nombre"));
                p.setCat(cat);
                
                p.setSb(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Sueldo Basico")));
                p.setB(Double.parseDouble(JOptionPane.showInputDialog("Ingrese la Bonificacion")));
                p.setDes(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Descuento")));
                
                p.setBesp(Double.parseDouble(JOptionPane.showInputDialog("Ingrese la Bonificacion ESpecial")));
                
                 /*metodo implementado de la superclase*/
                  System.out.println("El sueldo neto es : " + p.sn());
            }
        }
       
        
       
    }
    
}
