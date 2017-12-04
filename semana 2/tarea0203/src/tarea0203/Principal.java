/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea0203;

import javax.swing.JOptionPane;

/**
 *
 * @author LAB-USR-PT385-1408
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     String art;
     double acu=0;
     int n,i;
     
     
     art =JOptionPane.showInputDialog("Ingrese el tipo de Articulo");
             
     if(art.equals("pastillas")){
     
        n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad"));
        for(i=1; i<=n; i++){
            Articulos arti = new Articulos();


            System.out.println("El Importe del Articulo"+art+" es "+ arti.importe());

            /*creamos un acumulador */
            acu = acu+arti.importe();
        }

     
     }else if(art.equals("frascos")){
     
     n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad"));
    
     
        for(i=1; i<=n; i++){

            Articulos arti = new Articulos();

            System.out.println("El Importe del Articulo"+art+" es "+ arti.importe());

            /*creamos un acumulador*/
            acu = acu+arti.importe();

        }
       
     }  
      System.out.println("El Importe Total es : "+acu);

    }
    
}
