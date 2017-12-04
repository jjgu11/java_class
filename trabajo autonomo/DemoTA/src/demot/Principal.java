 
package demot;

import javax.swing.JOptionPane;


public class Principal { 
    public static void main(String[] args) {
        
        String persona,nom,sex;
        int edad;
               
        persona = JOptionPane.showInputDialog("Ingrese el tipo de Persona");
            
            if (persona.compareTo("vendedor")==0){
                
                int ht,pxh,com;
                
                /*var de la clase padre*/
                nom = JOptionPane.showInputDialog("Ingrese nombre del Vendedor");
                sex = JOptionPane.showInputDialog("Ingrese el sexo del Vendedor");
                edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del Vendedor"));
                
                /*var de la propia clase hija*/
                ht = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de horas laboradas"));
                pxh = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el pago por horas laboradas"));
                com = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la comision generada"));
                
                Vendedor objVen = new Vendedor(ht,pxh,com,nom,sex,edad);
                
                procesar(objVen);
            
            }else{
            
                String pro;
                int cant;
                double pre,desc;
                
                /*var de la clase padre*/
                nom = JOptionPane.showInputDialog("Ingrese nombre del Cliente");
                sex = JOptionPane.showInputDialog("Ingrese el sexo del Cliente");
                edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del Cliente"));
                
                /*var de la propia clase hija*/
                pro = JOptionPane.showInputDialog("Ingrese el nombre del Producto Comprado");
                pre = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del Producto"));
                cant = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad del Producto"));
                desc = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el descuento del Producto"));
                
                Cliente  objCli = new Cliente(pro,pre,cant,desc,nom,sex,edad);
                
                /*llamo al metodo*/
                procesar(objCli);
                       
            }
   
    }
       
        
    static void procesar(Persona n){
        
        System.out.println("Su Codigo de ID es"+ n.Codigo());   
                             
        if( n instanceof Vendedor){
          
            double sn = ((Vendedor)n).sueldoNeto();
            String dat = ((Vendedor)n).Datos();

            System.out.println("El Sueldo Neto del Vendedor es: "+sn);
            System.out.println("Los Datos del Vendedor son: "+dat);
            
        }else{
            
            double pp = ((Cliente)n).PagoProduct();
            String dat = ((Cliente)n).Datos();

            System.out.println("El pago del Cliente es: "+" "+pp);
            System.out.println("Los Datos del Cliente son: "+dat);
         
        }
           
    }  
     
  }
    

