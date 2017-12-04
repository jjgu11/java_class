
package demoarbolbinario;

import javax.swing.JOptionPane;




/*  */


public class Principal {

  
    public static void main(String[] args) {
        
        Arbol x = new Arbol();
        int z,num=0;
        z= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de datos a capturar"));
        
        for (int i = 1; i < z; i++) {
            int m;
            
            m = Integer.parseInt(JOptionPane.showInputDialog("Ingrese dato"+i));
            x.alta(m);
        }
        
        System.out.println("Valores capturados en preOrden");
        x.imprimirpreorden();
        
        System.out.println("Valores capturados en Inorden");
        x.imprimirinorden();
        System.out.println("Valores capturados en Postorden");
        x.imprimirpostorden();
        
        
        if(x.busca(num)==1){
            
            System.out.println("El numero "+num+"si existe");
            
        }else{
            System.out.println("El numero "+num+"no existe");
        }
    }
    
}
