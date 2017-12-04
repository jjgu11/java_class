
package tarea0201;

import javax.swing.JOptionPane;


public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int n1,i;
        double acu=0;
        String art;
        
        art =JOptionPane.showInputDialog("Ingrese el tipo de Articulo");
             
        if(art.equals("pastillas")){
        
            n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad"));
            
            for(i=1; i<=n1; i++){
                
                Articulos arti = new Articulos();
                
                arti.setCod(JOptionPane.showInputDialog("Ingrese el codigo del Articulo "));
                arti.setDes(JOptionPane.showInputDialog("Ingrese la descripcion del Articulo"));
                
                arti.setPre_uni(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio unitario")));
                arti.setCant(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad")));
                arti.setStock(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el stock minimo")));
                
                System.out.println("El Importe del Articulo"+art+" es "+ arti.importe());
                
                /*acumulador*/
                
                acu = acu+arti.importe();
                                       
            }
            
            
            }else if(art.equals("frascos")){
                
                n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cuantos Articulos hay"));
            
                for(i=1; i<=n1; i++){
                
                Articulos arti = new Articulos();
                
                arti.setCod(JOptionPane.showInputDialog("Ingrese el codigo del Articulo "));
                arti.setDes(JOptionPane.showInputDialog("Ingrese la descripcion del Articulo"));
                
                arti.setPre_uni(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio unitario")));
                arti.setCant(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad")));
                arti.setStock(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el stock")));
                
                System.out.println("El Importe del Articulo"+art+" es "+ arti.importe());
                
                /*acumulador*/
                
                acu = acu+arti.importe();            
             
            } 
                
                
           
        }else{
          System.out.println("No esta en la lista de articulos");   
        }    
           
            
        System.out.println("El Importe Total es : "+acu);
        

    }
    
}
