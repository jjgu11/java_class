
package tarea0202;

import javax.swing.JOptionPane;


public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
     String art,cod,des,tipo;
     double pre_uni,acu=0;
     int n,i,cant,stock;
     
     
     art =JOptionPane.showInputDialog("Ingrese el tipo de Articulo");
             
     if(art.equals("pastillas")){
     
        n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad"));
    
     
        for(i=1; i<=n; i++){

        tipo = JOptionPane.showInputDialog("Ingrese el nom bre del Articulo ");
        cod = JOptionPane.showInputDialog("Ingrese el codigo del Articulo ");
        des = JOptionPane.showInputDialog("Ingrese la descripcion del Articulo");

        pre_uni = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio unitario"));
        cant = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad"));
        stock =Integer.parseInt(JOptionPane.showInputDialog("Ingrese el stock minimo"));

        Articulos arti = new Articulos(cod,des,tipo,pre_uni,cant,stock);
        
        
        System.out.println("El Importe del Articulo"+art+" es "+ arti.importe());
              
        /*creamos un acumulador para almacenar cada sueldo neto*/
        acu = acu+arti.importe();

        }

     
     }else if(art.equals("frascos")){
     
     n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad"));
    
     
        for(i=1; i<=n; i++){

        tipo = JOptionPane.showInputDialog("Ingrese el nom bre del Articulo ");
        cod = JOptionPane.showInputDialog("Ingrese el codigo del Articulo ");
        des = JOptionPane.showInputDialog("Ingrese la descripcion del Articulo");

        pre_uni = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio unitario"));
        cant = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad"));
        stock =Integer.parseInt(JOptionPane.showInputDialog("Ingrese el stock minimo"));

        Articulos arti = new Articulos(cod,des,tipo,pre_uni,cant,stock);
        
        
        System.out.println("El Importe del Articulo"+art+" es "+ arti.importe());
              
        /*creamos un acumulador para almacenar cada sueldo neto*/
        acu = acu+arti.importe();

        }
       
     }
     
    
      System.out.println("El Importe Total es : "+acu);

    
    }
    
    
}
